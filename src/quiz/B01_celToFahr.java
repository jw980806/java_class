package quiz;

import java.util.Scanner;

public class B01_celToFahr {

	// 사용자로부터 섭씨 온도를 입력받으면 화씨온도로 변환하여 출력해주는 프로그램을 
	// 만드세요(변환공식은 검색, 출력은 소수 첫째자리까지)
	
	public static void main(String[] args) {
		System.out.println("현재 섭씨온도를 입력해 주세요");
		double c = new Scanner(System.in).nextDouble();
		double f = c * 1.8 + 32;
		
		System.out.printf("℃: %.1f -> ℉: %.1f", c, f );
		
		
	}
}
