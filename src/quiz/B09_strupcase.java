package quiz;

import java.util.Scanner;

public class B09_strupcase {

	// �Է¹��� ���ڿ��� ��� ���ĺ��� �빮�ڷ� ��������
	// ���� �Ѽ� �ȵǰ� ���ο� ���ڿ��� ��������
	
	public static void main(String[] args) {
		
		System.out.println("���ڿ��� �Է����ּ���");
		String str = new Scanner(System.in).nextLine();
		
		StringBuilder upper = new StringBuilder();
		
		for (int i= 0, len = str.length(); i < len; i++) {
			char ch = str.charAt(i);
			
			if ( ch >= 'a' && ch <= 'z') {
				ch -= 32;
				//ch -= Math.abs('A'-'a');
				//ch =(char)(ch - 'a' + 'A');
			} 
			upper.append(ch);
		}
		System.out.print(upper);

	}

}
