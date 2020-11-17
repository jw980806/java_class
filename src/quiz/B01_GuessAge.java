package quiz;

import java.util.Scanner;

public class B01_GuessAge {

	// 사용자로부터 올해의 년도와 나이를 입력받으면
	// 한국 나이를 계산하여 몇 살인지 알려주는 프로그램을 만들어보세요
	
	public static void main(String[] args) {
		System.out.println("올해의 년도와 생년을 입력해주세요");
		int this_year = new Scanner(System.in).nextInt();
		int birth_year = new Scanner(System.in).nextInt();
		
		int k_age = this_year - birth_year + 1;
		System.out.printf("당신의 한국 나이는 %d살 입니다", k_age);
		
	}
}
