package quiz;

import java.util.Scanner;

public class B09_is_contain_alpha {

	// ����ڰ� �Է��� ���ڿ��� ���ĺ��� ���ԵǾ� ������ true�� ��� ������ false
	
	public static void main(String[] args) {
		System.out.println("���ڿ��� �Է��ϼ���");
		String str = new Scanner(System.in).nextLine();
		
		// boolean result = false;
		int count = 0;
		for(int i = 0, len = str.length(); i < len;i++) {
			char ch = str.charAt(i);
			
			if (ch >= 'a' && ch <= 'z' ||
					ch >= 'A' && ch <= 'Z') {
				count++;
				//result = true;
				break;
			}
		}System.out.println(count != 0 ? true: false);
		//System.out.println(result);

	}

}
