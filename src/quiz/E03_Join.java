package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Scanner;

public class E03_Join {

	// 1.
	// ����ڰ� �ڽ��� ���������� �Է��ϸ�
	// �� ������ ������� �̸����� �� ���Ͽ� �����غ�����

	// # D:\\java_io\\member\\ ���丮 �ؿ� ������ ��

	//2. 
	// ������� �̸��� ���޹����� �ش� ����ڰ� ���� �� ȸ���̶�� ���Ͽ��� ��� ������ �о� ������ְ� 
	// ���� ���Ե��� ���� ����̶�� ���Ե��� �ʾҴٰ�����ϴ� �޼��带 �ۼ��غ�����

	//3.
	// 


	public void Join(String name, String phone, String age, String favor) {

		String all = "name: "+name + " phone: "+ phone +" age: "+ age +" favor: "+favor;

		try {
			FileOutputStream member = new FileOutputStream("D:\\java_io\\member\\"+name+".txt");

			byte[] data = all.getBytes();
			member.write(data);

			member.close();

			System.out.println("���� ����!");
		} catch (FileNotFoundException e) {
			System.out.println("������ ã�� �� �����ϴ�");
		} catch (IOException e) {
			System.out.println("���ٰ� ���� �߻��� �����Դϴ�");
		}

	}

	public void check(String name) {

		try {
			FileInputStream member =
					new FileInputStream("D:\\java_io\\member\\"+name+".txt");

			byte[] bytes = new byte[100];

			// ���� ���� -1�� �ƴѵ��� ��� �о���δ�
			int ch = -1;
			int index = 0;
			while ((ch = member.read()) != -1) {
				bytes[index++] = (byte) ch;
			}

			System.out.println(new String(bytes));

			member.close();

		} catch (FileNotFoundException e) {
			System.err.println("���� ������ �Ǿ����� �ʽ��ϴ�");
		} catch (IOException e) {
			System.out.println("??");
		}

	}
	//	
	//	public void update(String name, String ) {
	//		
	//	}

	static class Member {
		String name;
		int age;
		String blood_type;
		String tel;

		public Member(String name, int age, String blood_type, String tel) {
			this.name = name;
			this.age = age;
			this.blood_type = blood_type;
			this.tel = tel;
		}

		@Override
		public String toString() {
			return String.format("%s/%d/%s/%s", name, age,blood_type, tel);
		}
	}

	public static void save(Member info) throws IOException {

		String dir = "D:\\java_io\\member\\";
		String filename = info.name + ".txt";


		PrintWriter pw = new PrintWriter(
				new BufferedWriter(
						new FileWriter(dir + filename, Charset.forName("UTF-8"))));

		pw.print(info);

		pw.close();
	}

	public static boolean checkNotMember(String name) throws IOException {
		String dir = "D:\\java_io\\member\\";
		String filename = name + ".txt";

		BufferedReader br = null;
		try {
			br = new BufferedReader(
					new FileReader(
							dir + filename, Charset.forName("UTF-8")
							)
					);

			String[] data = br.readLine().split("/");
			System.out.printf("<< '%s'���� ����>>\n", data[0]);
			System.out.println("�̸� : " + data[0]);
			System.out.println("���� : " + data[1]);
			System.out.println("������ : " + data[2]);
			System.out.println("Tel : " + data[3]);

			return false;

		} catch (FileNotFoundException e) {
			System.out.println("[System] - ȸ�������� �����մϴ�");
			return true;
		} finally {
			if (br != null)
				br.close();
		}
	}


	public static void main(String[] args) {
		//		E03_Join a = new E03_Join();
		//		
		//		a.Join("��ťť", "010-1564-1564", "25", "īƮ���̴�");
		//		a.Join("������", "010-8484-8484", "29", "��Ż������");
		//		a.check("������");

		///////////////////////////////////////////////////

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("�̸� > ");
			String name = br.readLine();

			if (checkNotMember(name)) {
				System.out.print("���� > ");
				int age = Integer.parseInt(br.readLine());

				System.out.print("������ > ");
				String blood_type = br.readLine();

				System.out.print("��ȭ��ȣ > ");
				String tel = br.readLine();

				save(new Member(name, age, blood_type, tel));

				br.close();
			}
		}
		catch (IOException e) {
			System.out.println("������ ã�� �� �����ϴ�");
		}


	}
}
