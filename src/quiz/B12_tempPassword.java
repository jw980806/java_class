package quiz;

import java.util.Random;

public class B12_tempPassword {

	// 랜덤 4자리의 임시 비밀번호 문자열을 생성하는 프로그램을 만들어보세요
	// (비밀번호를 구성하는 문자 - 알파벳 대문자, 숫자)

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
		
		//////////////////////////////////////////////////강사님
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
