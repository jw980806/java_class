package myobj.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PokerHandM {
	// 1. 다섯장의 PokerCard를 가지고 있어야 함
	// 2. 다섯장의 카드의 숫자/ 무늬를 통해 족보를 완성해야함
	// 3. 다른 PokerHand 인스턴스와 족보를 통한 크기비교가 가능해야함
	// 4. 다섯장 중 원하는 카드만 공개하는 기능이 있어야 함
	// 5. 카드를 한장씩 추가하는 기능이 있어야함

	public static int[] deck;
	public static int[] player;

	private static int DECK_RANGE = 13;
	private static List<Integer> counts;


	private final static Set<Set<Integer>> ROYAL_FLUSH; 
	private final static Set<Set<Integer>> BACK_FLUSH; 
	private final static Set<Set<Integer>> STRAIGHT_FLUSH;  
	private final static Set<Set<Integer>> STRAIGHT; 
	private final static Set<Set<Integer>> BACK_STRAIGHT; 

	static {
		// Same Shape
		ROYAL_FLUSH = new HashSet<>();
		BACK_FLUSH = new HashSet<>();
		STRAIGHT_FLUSH = new HashSet<>();


		for (int i = 0; i < 53; i+=13) {
			Set<Integer> royal = new HashSet<>(5);
			Collections.addAll(royal, i, i+9, i+10, i+11, i+12);
			ROYAL_FLUSH.add(royal);

			Set<Integer> back = new HashSet<>(5);
			Collections.addAll(back, i, i+1, i+2, i+3, i+4);
			BACK_FLUSH.add(back);

			Set<Integer> straightF = new HashSet<>(5);
			Collections.addAll(straightF, i+7, i+8, i+9, i+10, i+11);
			STRAIGHT_FLUSH.add(straightF);
		}


		STRAIGHT = new HashSet<>();  // % 13 나중에
		for (int i = 0; i < 9; ++i) {
			Set<Integer> straight = new HashSet<>(5);
			Collections.addAll(straight, i, i+1, i+2, i+3, i+4);
			STRAIGHT.add(straight);
		}


		BACK_STRAIGHT = new HashSet<>(); // % 13 나중에
		Set<Integer> backS = new HashSet<>(5);
		Collections.addAll(backS, 1, 2, 3, 4, 5);
		BACK_STRAIGHT.add(backS);


	}

	public static String check_game(List<Integer> list) {

		ArrayList<Integer> player_13 = new ArrayList<>();
		for(int temp : list) {
			//			if (temp == 12 || temp == 25 || temp == 38 || temp == 51) {
			//				player_13.add(temp%13+1);
			//			} else {
			//				player_13.add(temp%13); // % 13
			//			}
			player_13.add(temp%13); 
		}


		// check by dices
		for (Set<Integer> rf : ROYAL_FLUSH) {
			if (list.containsAll(rf)) {
				return " >> 로얄 스트레이트 플러쉬!!";
			}
		}
		for (Set<Integer> bf : BACK_FLUSH) {
			if (list.containsAll(bf)) {
				return " >> 백 스트레이트 플러쉬!!";
			}
		}
		for (Set<Integer> sf : STRAIGHT_FLUSH) {
			if (list.containsAll(sf)) {
				return " >> 스트레이트 플러쉬!!";
			}
		}
		for (Set<Integer> sf : STRAIGHT_FLUSH) {
			if (list.containsAll(sf)) {
				return " >> 스트레이트 플러쉬!!";
			}
		}
		for (Set<Integer> s : STRAIGHT) {
			if (player_13.containsAll(s)) {
				return " >> 스트레이트!!";
			}
		}
		for (Set<Integer> bs : BACK_STRAIGHT) {
			if (player_13.containsAll(bs)) {
				return " >> 백스트레이트!!";
			}
		}

		// check by count
		if(counts.contains(4)) {
			return " >> 포카드!!";
		} else if (counts.contains(3) && counts.contains(2)) {
			return " >> 풀하우스 !!";
		} else if (counts.contains(3)) {
			return " >> 트리플 !!";
		} else if (counts.contains(2)) {
			return " >> 원페어!!";
		}


		return "NO PAIR";
	}

	public static int[] shuffle() {
		int deck[] = new int[52];

		// 52 % 13 : 0 - 12 스페이드, 13 - 25 하트, ....
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

	// String 맞을까? int 아님?
	public static String prettyCard(int card) {

		char[] shape = {'♡', '♠', '♣', '◇'};
		String[] value = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

		int s_index = card / 13;
		int v_index = card % 13;

		return shape[s_index] + value[v_index];
	}
	static int a = 0;
	static int b = 0;

	public static void draw() {
		player[a++] = deck[b++];
	}


	public static void print_game(int mode) {
		if (mode == 0) {
			// open() 함수시 들어갈 자리


		} else if (mode == 1) {
			System.out.print("\nPlayer : \n\t");
			for (int i = 0; i <= a-1; i++) {
				System.out.print(prettyCard(player[i]) + "  ");
			}
		}

	}

	public String PokerHands() 
	{
		// 한번에 5개 아님 draw 반복이 여기 있어야됨

		deck = shuffle();
		//System.out.println(Arrays.toString(deck));
		player = new int[20];

		counts = new ArrayList<>(DECK_RANGE);
		Collections.addAll(counts, 0,0,0,0,0,0,0,0,0,0,0,0,0);

		for (int i = 0; i < 7; i++) {
			draw();
			//count();

			print_game(1);

//			System.out.println("\nDo You Want Betting?");
//			String answer = new Scanner(System.in).next();
//			if (answer.equals("yes")) {
//				System.out.println("[ 베팅하셨습니당 ]\n");
//			}
		}

		ArrayList<Integer> player_list = new ArrayList<>();  // player

		for(int temp : player) {
			player_list.add(temp); // % 13
		}

		count(player_list);


		return check_game(player_list);

	}

	private void count(List<Integer> list) {
		ArrayList<Integer> player13 = new ArrayList<>();
		//System.out.println(list);
		for(int temp : list) {
			player13.add(temp%13); // % 13
		}
		//System.out.println(player13);

		for (int i = 0; i < DECK_RANGE; ++i) {
			int deck_num = i + 1;
			counts.set(i, Collections.frequency(player13, deck_num));
		}
		//System.out.println(counts);
	}



	// 까고 싶은 패
	public void open(int num) {
		System.out.println();


	}


	public static void main(String[] args) {

//		PokerHandM user = new PokerHandM();
//		String result;
//		result = user.PokerHands();
//		System.out.println(result);
		//user.open(1);
		
		while (true) {
			PokerHandM user = new PokerHandM();
		}

	}

}
