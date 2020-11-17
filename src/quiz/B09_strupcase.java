package quiz;

import java.util.Scanner;

public class B09_strupcase {

	// 입력받은 문자열의 모든 알파벳을 대문자로 만들어보세요
	// 원본 훼손 안되게 새로운 문자열에 넣으세요
	
	public static void main(String[] args) {
		
		System.out.println("문자열을 입력해주세요");
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
