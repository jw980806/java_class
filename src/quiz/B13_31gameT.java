package quiz;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class B13_31gameT {

	public static void main(String[] args) throws IOException {
		
		// �ʱ�ȭ �κ�
		Scanner user = new Scanner(System.in);
		Random ran = new Random();
		
		boolean computer_turn = ran.nextBoolean();
		
		System.out.printf("<%s>�� �����Դϴ�!\n",
				computer_turn ? "Computer" : "User");
		
		int game_num = 0;

		while(true) {
			int num;
			
			if(computer_turn) {
				
				//��ǻ�Ͱ� �̱���� game_num�� �� ��
				// 2, 6, 10, 14, 18, 22, 26, 30�� ����� ������ �̱�
				if (game_num % 4 == 0) {
					num = 2;
				}else if(game_num % 4 == 3) {
					num = 3;
				}else if(game_num % 4 == 1) {
					num = 1;
				}else {
					num = ran.nextInt(3) + 1;
				}
				
				//num = ran.nextInt(3) + 1;
				System.out.println("Computer > "+ num);
			}else {
				System.out.print("User > ");
				num = user.nextInt();
				
				if(num > 3 || num < 1) {
					System.out.println("1 ~ 3�� �Է��ϼž� �մϴ�");
					continue;
				}
			}
			
			//ó���κ�
			game_num += num;
			
			//��ºκ�
			if(game_num >= 31) {
				break;
			}
			System.out.println("\t���� ��Ȳ : " + game_num);
			computer_turn = !computer_turn;
		}
		System.out.printf("<%s>�� �¸�!!",computer_turn ? "User" : "Computer");

	}

}
