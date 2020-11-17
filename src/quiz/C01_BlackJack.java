package quiz;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class C01_BlackJack {

	// # 블랙잭을 만들어 보세요

	// * 게임 순서
	// 1. 딜러(컴퓨터)가 카드를 뽑는다
	//	(컴퓨터는 뽑은 카드 합이 16이하일 때 무조건 뽑고, 17이상이면 무조건 멈춘다)
	// 2. 사용자는 카드를 더 뽑을지 멈출지 결정한다 (hit stand)
	// 3. 사용자가 멈추면 승패를 출력해준다
	// 4. 사용자가 카드를 더 뽑았을 때 컴퓨터 보다 합이 낮거나 ,21이 넘으면 패배
	//							컴퓨터 보다 합이 높거나 21이면 승리

	// ※ 처음에는 두장을 뽑는다
	// ※ A는 1이 될수도 11이 될수도 있다
	// ※ J, Q, K는 10에 해당한다

	// 카드 : A, 2,3,4,5,6,7,8,9,10,J,Q,K

	public static void main(String[] args) {

		// 1~9 숫자 / A :10 / B : J / C : Q / D :K
		String deck = "123456789ABCD"
				+ "123456789ABCD"
				+ "123456789ABCD"
				+ "123456789ABCD";

		char[] rDeck = deck.toCharArray();
		//1. 문자열의 순서를 섞고, 순서대로 뽑는 방식을 추천
		
		int[] userDeck = new int[20];
		int[] comDeck = new int[20];


		Random ran = new Random();
		for (int i = 0; i < rDeck.length; i++) {
			int r = ran.nextInt(rDeck.length-1); 
			char temp = rDeck[0]; // 0번방값 <-> 랜덤방값
			rDeck[0] = rDeck[r];
			rDeck[r] = temp;
		}

		//System.out.println(rDeck);
		System.out.println();

		int com = 0;
		int user = 0;
		

		for(int i = 0; i < 4; i++) {
			if(rDeck[i] >= 'A' && rDeck[i] <= 'D')
				rDeck[i] = 58;  // 0이 48이라서
			
			if(i <2) {
				comDeck[i] = (int)(rDeck[i]-'0');
				com += comDeck[i];
			}else {
				userDeck[i-2] = (int)(rDeck[i]-'0');
				user += userDeck[i-2];
			}
		}

		System.out.printf("Computer Deck.\t> %2d  ?\n", comDeck[0]);
		System.out.printf("My Deck.\t> %2d %2d = %d\n", userDeck[0], userDeck[1], user);


		for(int i = 4; i < rDeck.length;) {

			if(rDeck[i] >= 'A' && rDeck[i] <= 'D')
				rDeck[i] = 58;
			
			int card = (int)rDeck[i]-'0';

			
			if(com <= 16) {
				com += card;
				comDeck[i-2] = card;
				i++;
			}else if(com >= 21) {
				break;
			}
			
			System.out.println("\n더 뽑으시겠습니까? (  hit  / stand )");

			String choice = new Scanner(System.in).next();

			if(choice.equals("hit")) {
				
				user += card;
				userDeck[i-3] = card;
				
				System.out.print("My Deck.\t> ");
				for(int j = 0; j< i-2; j++) {
					if(userDeck[j] != 0) 
						System.out.printf("%d  ", userDeck[j]);
					
				}
				
				System.out.printf("= %d\n", user );
				
				if(user >= 21) {
					break;
				}
				i++;
			}else if(choice.equals("stand")) {
				i++;
				System.out.print("\nComputer Deck.\t> ");
				for(int j = 0; j< i-2; j++) {
					if(comDeck[j] != 0) 
						System.out.printf("%d  ", comDeck[j]);
					
				}
				break;
			}

			
			card=0;
		}


		if((user < 21 && user > com) || user == 21 || com > 21) {
			System.out.printf("\n\nuser > %d, com > %d.  You Win!!", user, com);
		}else if (user == com) {
			System.out.printf("\n\nuser > %d, com > %d.  Drow!!", user, com);
		}else if(com == 21) {
			System.out.printf("\n\nuser > %d, com > %d.  You Lose!!", user, com);
		}
		else {
			System.out.printf("\n\nuser > %d, com > %d.  You Lose!!", user, com);
		}

	}



}
