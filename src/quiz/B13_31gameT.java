package quiz;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class B13_31gameT {

	public static void main(String[] args) throws IOException {
		
		// 초기화 부분
		Scanner user = new Scanner(System.in);
		Random ran = new Random();
		
		boolean computer_turn = ran.nextBoolean();
		
		System.out.printf("<%s>의 선공입니다!\n",
				computer_turn ? "Computer" : "User");
		
		int game_num = 0;

		while(true) {
			int num;
			
			if(computer_turn) {
				
				//컴퓨터가 이기려면 game_num을 본 후
				// 2, 6, 10, 14, 18, 22, 26, 30을 만들면 무조건 이김
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
					System.out.println("1 ~ 3만 입력하셔야 합니다");
					continue;
				}
			}
			
			//처리부분
			game_num += num;
			
			//출력부분
			if(game_num >= 31) {
				break;
			}
			System.out.println("\t현재 상황 : " + game_num);
			computer_turn = !computer_turn;
		}
		System.out.printf("<%s>의 승리!!",computer_turn ? "User" : "Computer");

	}

}
