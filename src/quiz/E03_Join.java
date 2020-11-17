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
	// 사용자가 자신의 개인정보를 입력하면
	// 그 정보를 사용자의 이름으로 된 파일에 저장해보세요

	// # D:\\java_io\\member\\ 디렉토리 밑에 저장할 것

	//2. 
	// 사용자의 이름을 전달받으면 해당 사용자가 가입 된 회원이라면 파일에서 모든 정보를 읽어 출력해주고 
	// 아직 가입되지 않은 사람이라면 가입되지 않았다고출력하는 메서드를 작성해보세요

	//3.
	// 


	public void Join(String name, String phone, String age, String favor) {

		String all = "name: "+name + " phone: "+ phone +" age: "+ age +" favor: "+favor;

		try {
			FileOutputStream member = new FileOutputStream("D:\\java_io\\member\\"+name+".txt");

			byte[] data = all.getBytes();
			member.write(data);

			member.close();

			System.out.println("쓰기 성공!");
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다");
		} catch (IOException e) {
			System.out.println("쓰다가 뭔가 발생한 에러입니당");
		}

	}

	public void check(String name) {

		try {
			FileInputStream member =
					new FileInputStream("D:\\java_io\\member\\"+name+".txt");

			byte[] bytes = new byte[100];

			// 읽은 값이 -1이 아닌동안 계속 읽어들인다
			int ch = -1;
			int index = 0;
			while ((ch = member.read()) != -1) {
				bytes[index++] = (byte) ch;
			}

			System.out.println(new String(bytes));

			member.close();

		} catch (FileNotFoundException e) {
			System.err.println("아직 가입이 되어있지 않습니다");
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
			System.out.printf("<< '%s'님의 정보>>\n", data[0]);
			System.out.println("이름 : " + data[0]);
			System.out.println("나이 : " + data[1]);
			System.out.println("혈액형 : " + data[2]);
			System.out.println("Tel : " + data[3]);

			return false;

		} catch (FileNotFoundException e) {
			System.out.println("[System] - 회원가입을 진행합니다");
			return true;
		} finally {
			if (br != null)
				br.close();
		}
	}


	public static void main(String[] args) {
		//		E03_Join a = new E03_Join();
		//		
		//		a.Join("피큐큐", "010-1564-1564", "25", "카트라이더");
		//		a.Join("대정령", "010-8484-8484", "29", "메탈슬러그");
		//		a.check("대정령");

		///////////////////////////////////////////////////

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("이름 > ");
			String name = br.readLine();

			if (checkNotMember(name)) {
				System.out.print("나이 > ");
				int age = Integer.parseInt(br.readLine());

				System.out.print("혈액형 > ");
				String blood_type = br.readLine();

				System.out.print("전화번호 > ");
				String tel = br.readLine();

				save(new Member(name, age, blood_type, tel));

				br.close();
			}
		}
		catch (IOException e) {
			System.out.println("파일을 찾을 수 없습니다");
		}


	}
}
