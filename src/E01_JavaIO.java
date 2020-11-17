import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class E01_JavaIO {

	// # Java I/O (Input and Output)
	//	- �ڹٴ� ��Ʈ���� �̿��� ������� �ٷ��
	//	- �츮 ���α׷����� ������ ��� �����͵��� �Է��̶� �θ��� (Input)
	//	- ���α׷��� �����ؼ� �������� ��� �����͵��� ����̶�� �θ��� (Output)

	// # Stream
	//	- �����͵��� ������ ���
	//	- �Է¹��� �� ����ϴ� ��θ� inputStream�̶�� �θ���
	//	- ����Ҷ� ����ϴ� ��θ� outputStream�̶�� �θ���
	//	- �����Ͱ� Stream�� ���� �̵��� ���� �����͸� 0��1�� ��ȯ�Ͽ� �����Ѵ�

	// # OutputStream Ŭ������ ���� �޼���
	//	- write (int)
	//	- write (byte[])
	//	- flush : ��Ƴ��� �����͸� �����Ѵ�
	//	- close : ��Ʈ���� ����Ѵ� (�ݴ´�, �޸� ����)

	// # InputStream Ŭ������ ���� �޼���
	//	- int read()  : ���� �� ����Ʈ�� �о�´�, EOF(End of file)�� �����ϸ� -1�� ��ȯ
	//	- close()     : ��Ʈ���� �ݴ´� (�޸� ����)

	public static void main(String[] args) {
		
		// # FileOutputStream
		//	- ���Ϸ� ����ϴµ� Ưȭ�� OutputStream
		//	- Java IO Ŭ�������� ��κ� �ʼ������� ó���ؾ��ϴ� ���ܰ� �����Ѵ�
		
		try {
			FileOutputStream fout = new FileOutputStream("D:\\java_io\\testout.txt");
			
			// 1. int�� ����ϴ� ���
			//fout.write(65);
			
			// 2. byte[]�� ����ϴ� ���
			byte[] data = "Hello �ȳ��ϼ���".getBytes();
			fout.write(data);
			
			
			fout.close();   
			// Java IO�� ��Ʈ������ �޸𸮸� gc�� �������� �ʱ� ������ �پ� ��Ʈ���� �ݵ�� ���� �ݾ��־�� �Ѵ�
			
			System.out.println("���� ����");
		} catch (FileNotFoundException e) {
			System.err.println("������ ã�� ���߽��ϴ�");
		} catch (IOException e) {
			System.err.println("���ٰ� ���� �߻��� ����");
		}
		
		
		// # java.io.FileInputStream
		//	- ���Ϸκ��� �Է��� �޴µ� Ưȭ�� InputStream
		
		try {
			FileInputStream fin =
					new FileInputStream("D:\\java_io\\testout.txt");
			//System.out.println((char)fin.read());
			
			byte[] bytes = new byte[100];
			
			// ���� ���� -1�� �ƴѵ��� ��� �о���δ�
			int ch = -1;
			int index = 0;
			while ((ch = fin.read()) != -1) {
				bytes[index++] = (byte) ch;
			}
			
			System.out.println("byte[]�� ����� ���� : " + Arrays.toString(bytes));
			System.out.println(new String(bytes));
			
			fin.close();
		} catch (FileNotFoundException e) {
			System.err.println("������ ã�� ���߽��ϴ�");
		} catch (IOException e) {
			System.err.println("���ٰ� ���� �߻��� ����");
		}


		// # FileInputStream, FileOutputStream�� �����͸� �ڵ�� �о���� ������ 
		//	 ���α׷��Ӱ� ���� ���·� �������ϴ� ������ �ʿ��ϴ�

	}

}
