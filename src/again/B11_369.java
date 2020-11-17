package again;

import java.util.Scanner;

public class B11_369 {
	
	// 사용자로부터 정수 하나를 입력받고
	// 해당 숫자까지 369 게임이 진행된다면
	// 박수를 총 몇번 쳐야하는지 세어보세요
	
	public static void main(String[] args) {

		System.out.println("숫자를 입력해주세요");
		int range = new Scanner(System.in).nextInt();
		
		int clap = 0;
		
		for (int i=1; i<= range; i++) {
			System.out.printf("%d :", i);
			int check = i;
			while(check != 0) {
				int digit = check % 10;
				if (digit % 3 == 0 && digit != 0) {
					++clap;
					System.out.print("짝");
				}
				check /= 10;
			}
			System.out.println();
		}
		System.out.printf("박수 친 횟수 : %d", clap);
		
		
	}
}
