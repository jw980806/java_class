package quiz;

import java.util.Scanner;

public class B09_is_contain_alpha {

	// 사용자가 입력한 문자열에 알파벳이 포함되어 있으면 true를 출력 없으면 false
	
	public static void main(String[] args) {
		System.out.println("문자열을 입력하세요");
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
