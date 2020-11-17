package again;

import java.util.Random;
import java.util.Scanner;

public class B13_31game {

	public static void main(String[] args) {

		Scanner user = new Scanner(System.in);
		Random rn = new Random();
		boolean computer_turn = rn.nextBoolean();
		
		System.out.printf("<%s>의 선공입니다!", computer_turn? "Computer" : "User");
		
		int game_num = 0;
		
		while (true) {
			int num = 0;
			
		    // 30, 26, 22, 18, 14, 10, 6, 2  -> 필승!
			if(computer_turn) {
				if(game_num % 4 == 1) {
					num = 1;
				} else if (game_num % 4 == 0) {
					num = 2;
				} else if (game_num % 4 == 3) {
					num = 3;
				} else {
					num = rn.nextInt(1)+2;
				}
			} else {
				System.out.println("숫자를 입력해주세요 (1, 2, 3)");
				num = user.nextInt();
				if (num >= 1 && num <= 3) {
					
					break;
					
				} else {
					System.out.println("올바른 숫자를 입력해주세요");
				}
				
			}
			
			game_num += num;
			
			System.out.printf("현재 Count : %d", game_num);
			
			
			
			
			
			
			
			
			
		}
		
		
	}
	
}
