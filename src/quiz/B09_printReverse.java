package quiz;

import java.util.Scanner;

// ����ڰ� ������ �Է��ϸ� �� ������ �Ųٷ� ����غ�����

public class B09_printReverse {

	public static void main(String[] args) {
		
		System.out.println("������ �Է����ּ���");
		String str = new Scanner(System.in).nextLine();
		String reverse = "";
		for(int i = str.length() -1; i >= 0; i--) {
			reverse += str.charAt(i);
		}System.out.println(reverse);
		
		StringBuffer sb = new StringBuffer();
		System.out.println("\n\n������ �Է����ּ���2");
		String str2 = new Scanner(System.in).nextLine();
		sb.append(str2);
		System.out.println(sb.reverse());
		
		// StringBuffer�� += ��� append���
		StringBuilder str3 = new StringBuilder("heelo");
		str3.append(", world!");
		
		//�ٸ���� �� �ڿ� String ���� ��ȯ�ؼ� ���
		String build_result = str.toString();
		System.out.println(build_result);
		
		
	}
}
