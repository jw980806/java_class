package myobj.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class RerollDice {
	private Random ran;

	private static int DICE_FACET = 6;
	private static int NUM_OF_DICE = 5;

	private final static Set<Set<Integer>> SMALL_CASES;
	private final static Set<Set<Integer>> LARGE_CASES;

	static {

		LARGE_CASES = new HashSet<>();

		for (int i = 1; i <= 3; ++i) {
			Set<Integer> large = new HashSet<>(4);
			Collections.addAll(large, i, i+1, i+2, i+3, i+4);
			LARGE_CASES.add(large);
		}

		SMALL_CASES = new HashSet<>();

		for (int i = 1; i <= 3; ++i) {
			Set<Integer> small = new HashSet<>(4);
			Collections.addAll(small, i, i+1, i+2, i+3);
			SMALL_CASES.add(small);
		}

	}


	private List<Integer> dices; // 5개의 주사위 눈이 저장될 리스트
	private List<Integer> counts; // 각 숫자가 몇번씩 등장했는지 세어 볼 리스트
	
	private String made;

	public RerollDice() {
		ran = new Random();
		made = "UNCHECKED";
		// 주사위는 5개 이상으로 늘어나지 않기 때문에 컬렉션 용량을 5로 설정한다
		// # ArrayList는 초기 용량이 가득 차게 되면 용량을 1.5배씩 증가시킨다
		dices = new ArrayList<>(NUM_OF_DICE);
		counts = new ArrayList<>(DICE_FACET);

		Collections.addAll(dices, 0,0,0,0,0);
		Collections.addAll(counts, 0,0,0,0,0,0);
	}

	private void count() {
		for (int i = 0; i < DICE_FACET; ++i) {
			int dice_num = i + 1;

			counts.set(i, Collections.frequency(dices, dice_num));
		}
	}

	private String check() {
		// check by count
		if (counts.contains(5)) {
			return "FIVE DICE!!";
		} else if (counts.contains(4)) {
			return "FOUR DICE!!";
		} else if (counts.contains(2) && counts.contains(3)) {
			return "FULL HOUSE!!!";
		}

		// check by dices
		for (Set<Integer> ls : LARGE_CASES) {
			if (dices.containsAll(ls)) {
				return "LARGE STRAIGHT!!";
			}
		}
		for (Set<Integer> ss : SMALL_CASES) {
			if (dices.containsAll(ss)) {
				return "SMALL STRAIGHT!!";
			}
		}



		return "NO MATCHES";
		
		
	}


	public void roll() {
		for (int i = 0; i < NUM_OF_DICE; ++i) {
			dices.set(i, ran.nextInt(DICE_FACET)+1);
		}
		
		count();

		System.out.print(dices + " : ");
		System.out.println(check());
		//System.out.println("각 숫자 등장 횟수 : " + counts);
		
//		System.out.println("You Want ReRoll?");
//		String answer = new Scanner(System.in).next();
//		if (answer.equals("yes")) {
//			System.out.println("Put Number");
//			String num = new Scanner(System.in).next();
//			reroll(num);
//		}
		

	}
	
	public void reroll(String num) {
		// 034 posit {0, 3, 4}
		//System.out.println(dices + " : ");
		//int[] posit = new int[num.length()];
		
		Set<Integer> posit = new HashSet<>(num.length());
		for (int i = 0; i < num.length(); ++i) {
			posit.add((int) num.charAt(i));
			//dices.remove(posit[i]);
		}
		
		for (int i : posit) {
			int change = ran.nextInt(DICE_FACET)+1;
			dices.set(i-1, change);
			System.out.printf("DICE %d HAS CHANGED : %d\n",i, change);
		}
		
		
//		System.out.println(dices + " : ");
		count();
		
		System.out.println(dices + " : ");
		
		//System.out.println(check());

	}
	
	public void print() {
		System.out.print(dices + " : ");
		
		if (made.equals("UNCHECKED")) {
			made = check();
		}
		System.out.println(made);
	}
	
	
	public void reRoll(Set<Integer> rerolls) {
		
		if (rerolls.size() == 0) {
			System.out.println("NOTING");
			return;
		}
		
		made = "UNCHECKED";
		
		for (int i : rerolls) {
			int to_change = ran.nextInt(DICE_FACET) + 1;
			dices.set(i-1, to_change);
			System.out.printf("DICE %d HAS CHANGED : %d\n",i, to_change);
		}
		count();
		print();
	}
	

	public static void main(String[] args) {
		RerollDice dice01 = new RerollDice();

//		for (int i = 0; i < 100; ++i) {
//			dice01.roll();
//		}
		dice01.roll();
		//dice01.reRoll(rerolls);
	}
}
