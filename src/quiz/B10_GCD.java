package quiz;

import java.util.Scanner;

public class B10_GCD {

	// 두 숫자를 입력받으면 두 숫자의 최대 공약수를 구해보세요
	// 최대 공약수란 두 숫자의 공약수 중 가장 큰 공약수
	
	public static int gcd(int p, int q)
	{
		
		if (q == 0) return p;
		return gcd(q, p%q);
	}
	
	public static void main(String[] args) {
//		System.out.println("숫자를 두개 입력하세요");
//		int num1 = new Scanner(System.in).nextInt();
//		int num2 = new Scanner(System.in).nextInt();

		int num1 = 15;
		int num2 = 45;
		
		if(num1 < num2) {
			int temp = num2;
			num2 = num1;
			num1 = temp;
		}

//		for(int j = num1; j >= 1 ; j--) {
//			int gcd = 0;
//			if(num1 % j == 0 && num2 % j == 0) {
//				gcd += j;
//				System.out.println(gcd);
//				break;
//			}
//		}
		
		// 유클리드 알고리즘
		
		int n = -1;
		
		for(; n != 0;) {
			n = num1 % num2;
			num1 = num2;
			num2 = n;
		}
		System.out.println("최대 공약수는 " + num1 + "입니다");

		
		
		


		

		
		
		
		
	}
}
