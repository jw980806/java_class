package quiz;

import java.util.Scanner;

public class B04_scoreToGrade {
	
	// return() : main()을 끝냄
	// System.exit(0); : 프로그램을 종료
	
	public static void main(String[] args) {
		System.out.println("점수를 입력해주세요(정수만 가능)");
		int num = new Scanner(System.in).nextInt();
		if(num >=0 && num <=100) {
			if(num >= 90)
				System.out.println("당신의 학점은 A입니다");
			else if (num >= 80)
				System.out.println("당신의 학점은 B입니다");
			else if(num >= 70)
				System.out.println("당신의 학점은 C입니다");
			else if(num >= 60)
				
				System.out.println("당신의 학점은 D입니다");
			else
				System.out.println("당신의 학점은 F입니다");
		}else {
			System.out.println("올바른 점수를 입력해주세요");
		}
	}
}
