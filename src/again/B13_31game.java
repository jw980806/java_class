package again;

import java.util.Random;
import java.util.Scanner;

public class B13_31game {

	public static void main(String[] args) {

		Scanner user = new Scanner(System.in);
		Random rn = new Random();
		boolean computer_turn = rn.nextBoolean();
		
		System.out.printf("<%s>�� �����Դϴ�!", computer_turn? "Computer" : "User");
		
		int game_num = 0;
		
		while (true) {
			int num = 0;
			
		    // 30, 26, 22, 18, 14, 10, 6, 2  -> �ʽ�!
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
				System.out.println("���ڸ� �Է����ּ��� (1, 2, 3)");
				num = user.nextInt();
				if (num >= 1 && num <= 3) {
					
					break;
					
				} else {
					System.out.println("�ùٸ� ���ڸ� �Է����ּ���");
				}
				
			}
			
			game_num += num;
			
			System.out.printf("���� Count : %d", game_num);
			
			
			
			
			
			
			
			
			
		}
		
		
	}
	
}
