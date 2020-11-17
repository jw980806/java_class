package quiz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class D10_OnlyPhoneNumber {

	// 사용자로부터 전ㄴ화번호만 입력받아보세요
	// 전화번호 형태가 아닐 경우 에러 메세지를 출력후 다시 입력해야합니다
	
	public static void main(String[] args) {
		
		String phoneNum = "";

		
		while (true) {
			System.out.println("전화번호를 입력하세요");
			phoneNum = new Scanner(System.in).next();
			if (!Pattern.matches("01[01679]-[\\d]{3,4}-[\\d]{4}", phoneNum)) {
				System.err.println("올바른 형식이 아닙니다");
			} else {
				System.out.println("당신의 전화번호 : " + phoneNum);
				break;
			}
		}
	}

}
