package quiz;

import java.util.Scanner;

public class B09_is_numeric_str {

	// 입력받은 문자열에 숫자만 포함되어있으면 결과에 1을 저장
	// 다른 문자가 포함되어 있다면 0을 저장하여 출력
	
	// 단 문자열이 비어있을 때는 결과가 2
	
	public static void main(String[] args) {
		
		System.out.println("문자열을 입력해주세요");
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
