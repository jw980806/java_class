package quiz;

import java.util.Scanner;

public class B10_NextPrime {

	// 사용자로부커 숫자를 입력받으면
	// 입력받은 수보다 더 크거나 같은 다음 소수흫 찾아서 출력해보세요
	
	public static void main(String[] args) {
		
		System.out.println("Number > ");
		int num = new Scanner(System.in).nextInt();
		//int num = 8;
		
		//int range = num * 5;
		
		for(int i = num; true;) {
			int sosu = 0;
			for(int j = 2; j <= i; j++) {
				if(i % j == 0) {
					sosu++;
				}
			}
			if(sosu == 1) {
				System.out.print("입력받은 수보다 더 크거나 같은 다음 소수 > "+i);
				break;
			}else {
				i++;
			}
			sosu =0;
		}
	}
}
