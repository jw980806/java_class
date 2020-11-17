package quiz;

import java.util.Scanner;

public class B09_forQuizBasic {

	// 사용자가 숫자를 입력했을 때
	// 1. 10부터 입력한 숫자까지의 총 합을 구해보세요
	// 2. 1부터 입력한 숫자 사이의 3의 배수만 모두 출력하고 몇 개있는지 출력하세요


	public static void main(String[] args) {
		
		System.out.println("1. 숫자를 입력하세요");
		int num = new Scanner(System.in).nextInt();
		int sum = 0;

		if(num < 10) {
			for(int i = num; i <= 10; i++) {
				sum += i;
				//System.out.println(sum);
			}
			System.out.println("총합 : "+sum);
		}else {
			for(int i = 10; i <= num; ++i) {
				sum += i;
			}
			System.out.println("총합 : "+sum);
		}


		System.out.println("\n2. 숫자를 입력하세요");
		int num2 = new Scanner(System.in).nextInt();
		int count = 0;
		int start = 1;
		int end = num2;
		
		if(start > end) {
			int temp = start;
			start = end;
			end = temp;
		}
		
		for (int i = start; i <= end; i++) {
			if (i % 3 == 0) {
				System.out.printf("%d ",i);
				count++;
			}else {
				continue;
			}
		}System.out.println("\ncount: "+count);



	} 
}
