package quiz;

import java.util.Scanner;

public class B10_Prime {

	// 사용자로부터 숫자를 입력받으면
	// 1부터 입력한 숫자 사이에 존재하는 소수를 모두 출력해보세요
	// 소수란 약수가 1과 자직 자신밖에 없는 숫자
	
	public static void main(String[] args) {
		//System.out.println(9%3);
		System.out.println("0 이상의 숫자를 입력해주세요");
		int num = new Scanner(System.in).nextInt();

		int sosu = 0;
		for(int i = 2; i < num; i++) {
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if(i % j == 0) {
					sosu++;
				}
			}
			if (sosu == 0) {
				System.out.print(i+ " ");
			}
			sosu=0;
		}
		
//		boolean sosu = true;
//		for(int i = 2; i < num; i++) {
//			for (int j = 2; j <= i; j++) {
//				if(i % j == 0) {
//					sosu++;
//				}
//			}
//		}
		
		
		
		
	}

}
