package quiz;

import java.util.Scanner;

public class B09_is_numeric_str {

	// �Է¹��� ���ڿ��� ���ڸ� ���ԵǾ������� ����� 1�� ����
	// �ٸ� ���ڰ� ���ԵǾ� �ִٸ� 0�� �����Ͽ� ���
	
	// �� ���ڿ��� ������� ���� ����� 2
	
	public static void main(String[] args) {
		
		System.out.println("���ڿ��� �Է����ּ���");
		String str = new Scanner(System.in).nextLine();
		
//		int result = 0;
//		
//		if( str == null) {
//			result = 2;
//		}else {
//			for(int i = 0, len = str.length(); i < len; i++) {
//				char ch = str.charAt(i);
//				
//				if(!(ch >= '0' && ch <= '9')) {
//					break;
//				}
//				else {
//					result = 1;
//				}
//			}
//		}System.out.print(result);
		
		
		int result = -3;
		
		//  			  str.equals("")
		if( str== null || str.isEmpty() || str.length() == 0) {
			result = 2;
		}
		
		for(int i = 0, len = str.length(); i < len; i++) {
			char ch = str.charAt(i);
			
			if(!(ch >= '0' && ch <= '9')) {
				result = 0;
				break;
			}
			else {
				result = 1;
			}
		}System.out.print(result);
		
//		switch (result) {
//		case 0:
//			System.out.println(000);
//		case 1:
//			System.out.println(111);
//		case 2:
//			System.out.println(2222);
//			break;
//		}

	}

}
