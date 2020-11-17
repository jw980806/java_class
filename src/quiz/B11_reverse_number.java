package quiz;

import java.util.Scanner;

public class B11_reverse_number {

	// 사용자로부터 정수를 하나 입력받고 
	// 그 정수를 일의 자리부터 순서대로 출력해보세요
	
	public static void main(String[] args) {
		
		
		System.out.print("Number reverse > ");
		int num = new Scanner(System.in).nextInt(); // int는 10자리수 까지 커버 가능
		//int num = 123456789;
		int len = (int)(Math.log10(num)+1);
		
		//System.out.println(len);
		//int i = 0;
		
		int i = 0;
		int a = 10;
		int b = 1;
		while(i < len) {
			System.out.print(num % a / b);
			a *= 10;
			b *= 10;
			if(num % a / b == 0) {
				break;
			}
		}
		
		///////////////////////////////////////////////////////////////////////////
		// 강사님 해설
		System.out.println();
		
		int user = 1687295;
		
		while (true) {
			System.out.print(user % 10);
			user /= 10;
			
			if (user <= 0) {
				break;
			}
		}

		
		
		
		
	}
}
