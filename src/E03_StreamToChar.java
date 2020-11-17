import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class E03_StreamToChar {

	// # Reader/Writer�� ���� Ŭ��������
	//   Stream���� ���� �����͸� ���ڷ� ��ȯ�ϴ� Ŭ�������̴�
	
	// # ���α׷��Ӱ� �����͸� ���ڷ� ���ϰ� �ٷ�� ���� ��
	//   InputStream/OutputStream�� Reader/WriterŬ������ �ѹ� �� ���μ� ����Ѵ�
	
	public static void main(String[] args) {
		
		// # abstract class Reader
		//	- Reader�� ��ӹ޾� ������ Ŭ������
		//	- BufferedReader, InputStreamReader, FileReader ���..
		//	- Stream���� ���� �����͸� ���ڷ� �籸���Ͽ� ���α׷��ӿ��� �����Ѵ�
		//	- �ڵ� �����͸� ���ڷ� �籸���ҽ� ����� chartset�� �˸°� �������� ������ ���ڰ� ������
		
		try {
			//FileReader fr = new FileReader("D:\\java_io\\bufferedout.txt",Charset.forName("UTF-8"));
			FileInputStream fr = new FileInputStream("D:\\java_io\\bufferedout.txt");
			
			InputStreamReader ir = new InputStreamReader(fr, "UTF-8");
			
			// FileReader�� ���׷��̵�
			BufferedReader br = new BufferedReader(ir, 2048);
			
			// ReaderŬ������ read�� ���� byte�� �ƴ϶�, ���� char�� �д´�
			int ch;
			while ((ch = br.read()) != -1) {
				System.out.print((char)ch);
			}
			
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		// # abstract class Writer
		//	- ���Ͽ� ���ڸ� ������ �� charset�� ������ �� �ִ�
		//	- ���α׷��Ӱ� �� �� ���ϰ� OutputStream�� �̿��� �� �ִ�
		
		try {
			FileOutputStream fout = new FileOutputStream("D:\\java_io\\bufferedout.txt");
			
			// OutputStream��Ŀ��� Writer�� ��ȯ (byte-> char)
			OutputStreamWriter ow = new OutputStreamWriter(fout, "EUC-KR");
			
			// OutputStream�� Writer�� ��ȯ�ϴ� ������ �����ϴ� Ŭ����
			FileWriter fw = new FileWriter("D:\\java_io\\bufferedout.txt", Charset.forName("UTF-8"));
			
			// Buffered: �������
			BufferedWriter bw = new BufferedWriter(ow, 4096);
			
			// print : ���α׷��ӿ��� ���� print�޼������ �̿��� �� ����
			PrintWriter pw = new PrintWriter(ow);
			
			// �ֿܼ� ����ϴ� ���� ���Ͽ� ����� �� �ִ�
			for (int i = 0; i < 10000000; i++) {
				pw.printf("%d�� %d�� %d:%d - �ȳ��ϼ��� �ݰ����ϴ�\n",1,2,3,4);
			}
			
			pw.close();
			bw.close();
			fw.close();
			ow.close();
			fout.close();
			
			System.out.println("����� �������ϴ�");
			
		} catch (FileNotFoundException e) {
			System.out.println("������ �� ã�ҽ��ϴ�");
		} catch (UnsupportedEncodingException e) {
			System.out.println("�߸��� ���ڵ� ����Դϴ�");
		} catch (IOException e) {
			System.err.println("���ٰ� ���� �߻��� ����");
		}
		
		
		
		
	}
	
	
}
