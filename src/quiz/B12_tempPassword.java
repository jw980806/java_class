package quiz;

import java.util.Random;

public class B12_tempPassword {

	// ���� 4�ڸ��� �ӽ� ��й�ȣ ���ڿ��� �����ϴ� ���α׷��� ��������
	// (��й�ȣ�� �����ϴ� ���� - ���ĺ� �빮��, ����)

	public static void main(String[] args) {
		
		
		StringBuilder pw = new StringBuilder();
		
		for(int i = 0; i < 4;) {
			Random ran = new Random();
			char word = (char) ran.nextInt();
			if((word >= 'A' && word <= 'Z') || (word >= '0' && word <= '9')) {
				pw.append(word);
				i++;
			}
		}
		System.out.println(pw);
		
		//////////////////////////////////////////////////�����
		StringBuilder temp_pass = new StringBuilder();
		
		Random ran = new Random();
		
		for (int i = 0; i < 4; ++i) {
			char ch;
			
			if (ran.nextBoolean()) {
				ch = (char)(ran.nextInt(26) + 'A');
			}else {
				ch = (char)(ran.nextInt(10) + '0');
			}
			temp_pass.append(ch);
		}
		System.out.println(temp_pass);
	}
}
