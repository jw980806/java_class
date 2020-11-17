import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E02_BufferedIO {

	// # Buffered I/O
	//	- ���۸� ����� �б�/���� ������ ����Ű�� Ŭ����
	//	- ���۶�? �����͸� ��/����ϱ� ���� ����Ű�� �޼ҵ�
	
	// # ���۸� �̿��ؾ��ϴ� ����
	//	- ���۾��� �б�/���⸦ �ϰ� ���� ������� �ʹ� ���� �Ͼ��
	
	// Ex> Java programming�� ���� ���
	//	- �⺻ OutputStream���� �� ���ھ� ���� 16���� ����� �߻��Ѵ�
	//	- �迭�� �����س��� �ѹ��� ���� 1���� ��¸����� ����� ����
	
	
	public static void main(String[] args) {
		StringBuilder text = new StringBuilder();
		for (int i = 0; i < 10000; i++) {
			text.append(i+"�ȳ��ϼ���\n");
		}
		
		// # java.io.BufferedOUtputStream
		//	- �����ڿ� OutputStream�� �䱸�Ѵ�
		//	- OutputStream ����� ��Ҹ� �����ϴ� �뵵�� ���
		//	- BufferedOutputStream�� ���ɾ��׷��̵��� �뵵�� ���
		
		// ������ ũ�Ⱑ 1024�ΰ��
		//	�����͸� �ش� �ƿ�ǲ ��Ʈ���� �� �� 1024��Ʈ�� �����Ͱ� �ٸ��̸� ����Ѵ�
		//	Ȥ�� ���α׷��Ӱ� flush()�޼��带 ȣ���� �� ����Ѵ�
		//	Ȥ�� close�� �߻��ϸ� ���¸��� �����͸� ����Ѵ�
		try {
			
			long start_time = System.currentTimeMillis();
			FileOutputStream fout = new FileOutputStream("D:\\java_io\\bufferedout.txt");
			BufferedOutputStream bout = new BufferedOutputStream(fout, 4096);
			
			// batch processing (�ϰ�ó��)
			byte[] data = new String(text).getBytes();
			for (byte b : data) {
				bout.write(b);
			}
			//bout.write(data);
			bout.close();
			fout.close();
			
			System.out.println("������³�" + (System.currentTimeMillis() - start_time) + "ms");
		} catch (FileNotFoundException e) {
			System.err.println("������ ã�� ���߽��ϴ�");
		} catch (IOException e) {
			System.err.println("���ٰ� ���� �߻��� ����");
		}
		
		
		// # java.io.BufferedInputStream
		//	- InputStream�� �����ڷ� �䱸�Ѵ�
		
		try {
			FileInputStream fin = new FileInputStream("D:\\java_io\\bufferedout.txt");
			BufferedInputStream bin = new BufferedInputStream(fin, 1024);
			
			// # read()�� �⺻ �����ε�
			//	- �� ����Ʈ�� int������ �о�´�
			
			// # read(byte[])�� �����ε�
			//	- ������ byte[]�� ũ�⸸ŭ�� byte�� ä���ش�
			//	- ������ �迭�� �� byte�� ä�������� ��ȯ�Ѵ� (len)
			
			// # read(byte[], off, len)
			//	- ������ byte[]�߿��� off���� len�������� �����͸� ä���ش�
			//	- ������ �迭�� �� byte�� ä������ ��ȯ�Ѵ�

//			byte[] buff = new byte[1024];
//			
//			int len;
//			int count = 0;
//			while ((len = bin.read(buff)) != -1) {
//				System.out.println(new String(buff,0,len));
//				
//				System.out.println(count++ + "��° �б�");
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
			System.err.println("������ ã�� ���߽��ϴ�");
		} catch (IOException e) {
			System.err.println("���ٰ� ���� �߻��� ����");
		}
		
		

	}

}
