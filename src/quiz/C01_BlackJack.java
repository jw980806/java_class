package quiz;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class C01_BlackJack {

	// # ������ ����� ������

	// * ���� ����
	// 1. ����(��ǻ��)�� ī�带 �̴´�
	//	(��ǻ�ʹ� ���� ī�� ���� 16������ �� ������ �̰�, 17�̻��̸� ������ �����)
	// 2. ����ڴ� ī�带 �� ������ ������ �����Ѵ� (hit stand)
	// 3. ����ڰ� ���߸� ���и� ������ش�
	// 4. ����ڰ� ī�带 �� �̾��� �� ��ǻ�� ���� ���� ���ų� ,21�� ������ �й�
	//							��ǻ�� ���� ���� ���ų� 21�̸� �¸�

	// �� ó������ ������ �̴´�
	// �� A�� 1�� �ɼ��� 11�� �ɼ��� �ִ�
	// �� J, Q, K�� 10�� �ش��Ѵ�

	// ī�� : A, 2,3,4,5,6,7,8,9,10,J,Q,K

	public static void main(String[] args) {

		// 1~9 ���� / A :10 / B : J / C : Q / D :K
		String deck = "123456789ABCD"
				+ "123456789ABCD"
				+ "123456789ABCD"
				+ "123456789ABCD";

		char[] rDeck = deck.toCharArray();
		//1. ���ڿ��� ������ ����, ������� �̴� ����� ��õ
		
		int[] userDeck = new int[20];
		int[] comDeck = new int[20];


		Random ran = new Random();
		for (int i = 0; i < rDeck.length; i++) {
			int r = ran.nextInt(rDeck.length-1); 
			char temp = rDeck[0]; // 0���氪 <-> �����氪
			rDeck[0] = rDeck[r];
			rDeck[r] = temp;
		}

		//System.out.println(rDeck);
		System.out.println();

		int com = 0;
		int user = 0;
		

		for(int i = 0; i < 4; i++) {
			if(rDeck[i] >= 'A' && rDeck[i] <= 'D')
				rDeck[i] = 58;  // 0�� 48�̶�
			
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
			
			System.out.println("\n�� �����ðڽ��ϱ�? (  hit  / stand )");

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
