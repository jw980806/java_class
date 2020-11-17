package quiz;

import java.util.Scanner;

public class B11_count_369_clap {

	// 사용자로부터 정수 하나를 입력받고
	// 해당 숫자까지 369 게임이 진행된다면
	// 박수를 총 몇번 쳐야하는지 세어보세요
	
	public static void main(String[] args) {
		
		//int num = 14;
		System.out.println("숫자를 입력하세요");
//		int num = new Scanner(System.in).nextInt();
		
//		int start = 1;
//		int count = 0;
//		int clap = 0;
//		int again;
//		
//		while(start <= num) {
//			again = start;
//			int temp = 0;
//			
//			while (again > 0) {
//				if (again == 3 || again == 6 || again == 9 ) {
//					count++;
//					clap++;
//				}
//				
//				System.out.println(again + " " + clap);
//				again /= 10;
//			}
//			start++;
//		}
//		System.out.println(count);
		
		// 문자열을 사용하는 방법
		
//		int user = 333;
//		int clap = 0;
//		for (int i =1; i <= user; ++i) {
//			String check = "" + i;
//			int len = check.length();
//			
//			for (int j = 0; j < len; ++j) {
//				if (check.charAt(j) == '3'||
//						check.charAt(j) == '6'||
//						check.charAt(j) == '9') {
//					++clap;
//				}
//			}
//		} System.out.println(clap);
		
		
		// 프로그램 실행시간 측정
		long start_time = System.currentTimeMillis();
		
		
		// 숫자를 이용하는 방법
		
		int user2 = new Scanner(System.in).nextInt();
		int clap2 = 0;
		
		boolean debugMode = true;
		
		for(int i = 1; i <= user2; ++i) {
			int check = i;
			
			if (debugMode) System.out.printf("%d : ",i);
			while (check != 0) {
				int digit = check % 10;
				if( digit % 3 == 0 && digit != 0) {
					++clap2;
					if(debugMode)System.out.print("짝");
					
				}
				check /= 10;
			}
			if(debugMode)System.out.println();
			
			
		}System.out.println(clap2 + "회");
		
		long end_time = System.currentTimeMillis();
		System.out.println("걸린 시간 : "+ (end_time-start_time)); //ms
		

		
		
		
		
		
		
		//////////////////////다른거
		//System.out.println(3%9);
//		while(i <= num) {
//			if (i % 10 == 9) {
//				count += 3;
//				System.out.print(i+"(짝짝짝) ");
//				System.out.println();
//			}else if (i % 10 == 6) {
//				count += 2;
//				System.out.print(i+"(짝짝) ");
//			}else if (i % 10 == 3) {
//				count+=1;
//				System.out.print(i+"(짝) ");
//			}
//			i++;
//		}
//		System.out.printf("\n박수는 %d번 쳐졌습니다!",count);
		
		
	}
	
}
