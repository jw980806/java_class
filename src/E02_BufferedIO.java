import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E02_BufferedIO {

	// # Buffered I/O
	//	- 버퍼를 사용해 읽기/쓰기 성능을 향상시키는 클래스
	//	- 버퍼란? 데이터를 입/출력하기 전에 향상시키는 메소드
	
	// # 버퍼를 이용해야하는 이유
	//	- 버퍼없이 읽기/쓰기를 하게 도면 입출력이 너무 자주 일어난다
	
	// Ex> Java programming을 쓰는 경우
	//	- 기본 OutputStream으로 한 글자씩 쓰면 16번의 출력이 발생한다
	//	- 배열에 저장해놓고 한번에 쓰면 1번의 출력만으로 출력이 끝남
	
	
	public static void main(String[] args) {
		StringBuilder text = new StringBuilder();
		for (int i = 0; i < 10000; i++) {
			text.append(i+"안녕하세요\n");
		}
		
		// # java.io.BufferedOUtputStream
		//	- 생성자에 OutputStream을 요구한다
		//	- OutputStream 출력할 장소를 선택하는 용도로 사용
		//	- BufferedOutputStream은 성능업그레이드의 용도로 사용
		
		// 버퍼의 크기가 1024인경우
		//	데이터를 해당 아웃풋 스트림에 쓸 때 1024비트의 데이터가 다모이면 출력한다
		//	혹은 프로그래머가 flush()메서드를 호출할 때 출력한다
		//	혹은 close가 발생하면 여태모인 데이터를 출력한다
		try {
			
			long start_time = System.currentTimeMillis();
			FileOutputStream fout = new FileOutputStream("D:\\java_io\\bufferedout.txt");
			BufferedOutputStream bout = new BufferedOutputStream(fout, 4096);
			
			// batch processing (일괄처리)
			byte[] data = new String(text).getBytes();
			for (byte b : data) {
				bout.write(b);
			}
			//bout.write(data);
			bout.close();
			fout.close();
			
			System.out.println("파일출력끝" + (System.currentTimeMillis() - start_time) + "ms");
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾지 못했습니다");
		} catch (IOException e) {
			System.err.println("쓰다가 뭔가 발생한 에러");
		}
		
		
		// # java.io.BufferedInputStream
		//	- InputStream을 생성자로 요구한다
		
		try {
			FileInputStream fin = new FileInputStream("D:\\java_io\\bufferedout.txt");
			BufferedInputStream bin = new BufferedInputStream(fin, 1024);
			
			// # read()의 기본 오버로딩
			//	- 한 바이트를 int값으로 읽어온다
			
			// # read(byte[])의 오버로딩
			//	- 전달한 byte[]의 크기만큼의 byte를 채워준다
			//	- 전달한 배열에 몇 byte를 채웠는지를 반환한다 (len)
			
			// # read(byte[], off, len)
			//	- 전달한 byte[]중에서 off부터 len까지에만 데이터를 채워준다
			//	- 전달한 배열에 몇 byte를 채웠는지 반환한다

//			byte[] buff = new byte[1024];
//			
//			int len;
//			int count = 0;
//			while ((len = bin.read(buff)) != -1) {
//				System.out.println(new String(buff,0,len));
//				
//				System.out.println(count++ + "번째 읽기");
//			}
//			
//			bin.read();
			int b;
			while((b = bin.read()) != -1) {
				System.out.print((char)b);
			}
			
			bin.close();
			fin.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾지 못했습니다");
		} catch (IOException e) {
			System.err.println("쓰다가 뭔가 발생한 에러");
		}
		
		

	}

}
