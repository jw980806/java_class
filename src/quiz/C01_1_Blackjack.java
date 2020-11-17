package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class C01_1_Blackjack {

	// �ٸ� �Լ������� ������ ����� �� �ֵ��� �Լ� �ۿ� ������ ������ �� �ִ�.
	public static int[] deck;
	public static int[] player;
	public static int[] dealer;
	
	public static int[] game_index; // {0, 0, 0}
//	public static int DEALER = 0;
//	public static int PLAYER = 1;
//	public static int DECK = 2;
	
	
	
	public static int[] shuffle() {
		int deck[] = new int[52];
		
		// 52 % 13 : 0 - 12 �����̵�, 13 - 25 ��Ʈ, ....
		// "CA", "C2", ... "CK" / "SA", "S2", ...
		
		for (int i = 0; i < deck.length; ++i) {
			deck[i] = i;
		}
		for(int i = 1; i < 200; ++i) {
			int ran = (int)(Math.random() * 51 + 1);
			
			int temp = deck[0]; 
			deck[0] = deck[ran];
			deck[ran] = temp;
		}
		return deck;
	}
	
	
	public static void draw(int drawer) {
		switch (drawer) {
		case 0:
			dealer[game_index[0]++] = deck[game_index[2]++];
			break;
		case 1:
			player[game_index[1]++] = deck[game_index[2]++];
			break;
		}
	}
	
	public static String prettyCard(int card) {
		
		char[] shape = {'��', '��', '��', '��'};
		String[] value = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		
		int s_index = card / 13;
		int v_index = card % 13;
		
		return shape[s_index] + value[v_index];
	}
	
	
	
//	public static void print_game(int mode) {
//
//		String up = "\t������������������\t";
//		String side = "\t��       ��\t";
//		String down = " \t������������������\t";
//		
//		
//		System.out.println("Dealer : ");
//		for (int i = 0; i < game_index[0]; i++) {
//			if (mode == 0 && i == 0) {
//				System.out.print("X");
//			} else {
//				//System.out.printf("%s\n%s\n");
//				System.out.print(up +"\n" +side +"\n" +"\t    " +prettyCard(dealer[i]) +"\n" + side +"\n" +down + "\n");
//			}
//		}
//		if (mode == 0) {
//			System.out.println();
//		}else {
//			System.out.printf("(%d)\n", check_value(0));
//		}
//		
//		System.out.println();
//		
//		System.out.print("Player : \n\t");
//		for (int i = 0; i < game_index[1]; i++) {
//			System.out.print(prettyCard(player[i]) + "  ");
//		}
//		System.out.printf("(%d)\n", check_value(1));
//	}
	
	public static void print_game(int mode) {

		System.out.println("Dealer : ");
		for (int i = 0; i < game_index[0]; i++) {
			if (mode == 0 && i == 0) {
				System.out.print("\tX   ");
			} else {
				System.out.print(prettyCard(dealer[i]) + " ");
			}
		}
		if (mode == 0) {
			System.out.println();
		}else {
			System.out.printf("(%d)\n", check_value(0));
		}
		
		System.out.println();
		
		System.out.print("Player : \n\t");
		for (int i = 0; i < game_index[1]; i++) {
			System.out.print(prettyCard(player[i]) + "  ");
		}
		System.out.printf("(%d)\n", check_value(1));
	}
	
	
	
	public static int getSum(int[] values) {
		int sum = 0;
		int ace =0;
		
		for(int i = 0; i < values.length; i++) {
			if(values[i] == 0) {
				sum += 11;
				ace += 1;
			} else if(values[i] >= 10) {
				sum += 10;
			} else {
				sum += values[i] + 1;
			}
		}
		
		// A�� 1�� �̻� �����ϸ鼭 ���� 21�� ���� �� A�� 1�� �����Ѵ�
		while (sum > 21 && ace > 0) {
			sum -= 10;
			ace -= 1;
		}
		
		return sum;
	}
	
	
	public static int check_value(int user) {
		
		int[] values = new int[game_index[user]];
		
		for (int i=0; i < values.length; i++) {
			values[i] = user == 0? dealer[i] % 13 : player[i] % 13;
		}
		return getSum(values);
		
	}
	
	
	public static int game_start() {
		// 1. ������ ������ ���� �ϳ� �����Ѵ�.
		deck = shuffle();
		
		player = new int[20];
		dealer = new int[20];
		game_index = new int[3];
		
		// ���࿡ �ʿ��� �������� �ʱ�ȭ �Ѵ�
		
		
		// ������� ������ ������ �����Ѵ�
		//System.out.println(Arrays.toString(deck));
		
		// ī�� �̱� (���� �ι�, �÷��̾� �ι�)
		draw(0);
		draw(0);
		draw(1);
		draw(1);
		
		//System.out.println("���� : " +Arrays.toString(dealer));
		//System.out.println("�÷��̾� : " +Arrays.toString(player));
		
		System.out.println();
		
		
		// �÷��̾��� ����
		Scanner console = new Scanner(System.in);
		int player_value = check_value(1);
		
		while((player_value = check_value(1)) < 21) {
			// ���� ���� ���
			print_game(0);
			
			System.out.print("\n1. hit\t2. stand\n>> ");
			int select = console.nextInt();
			
			if (select == 2) {
				break;
			}else if(select == 1) {
				draw(1);
			}
		}
		
		// ������ ���� �̰� ��� ������ ����� �� ����� ����
		print_game(1);
		
		int dealer_value = check_value(0);
		
		while ((dealer_value = check_value(0)) <= 16) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			draw(0);
			print_game(1);
			dealer_value = check_value(0);
		}
		
		// �ùٸ� ����� ����
		
		return check_game(dealer_value, player_value);
	}
	
	public static int check_game(int d, int p) {
		if(d > 21 && p > 21) {
			return 0;
		}else if (d == p) {
			return 0;
		}else if (p <= 21 && d > 21) {
			return p == 21 ? 2 :1;
		}else if( p <= 21 && p > d) {
			return p == 21 ? 2 :1;
		}else {
			return -1;
		}
	}
	
	
	

	public static void main(String[] args) {
		int player_money = 9500;
		
		while(player_money > 0) {
			int betting = 500;
			player_money -= betting;

			int game_result = game_start();

			System.out.println("================================================");
			StringBuilder msg = new StringBuilder("���� ��� : ");

			switch(game_result) {
			case 0:
				player_money += betting;
				msg.append("���º�");
				break;
			case 1:
				player_money += betting *2;
				msg.append("�¸�!");
				break;
			case 2:
				player_money += (int)(betting * 2.5);
				msg.append("21�� �¸�!");
				break;
			default:
				msg.append("�й�...;^;");
				break;
			}

			msg.append("\n���� �ܾ� : " + player_money + "��");
			System.out.println(msg);
			System.out.println("================================================");
			System.out.println();
		}


	}

}
