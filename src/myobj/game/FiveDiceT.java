package myobj.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class FiveDiceT {

	private Random ran;
	
	private static int DICE_FACET = 6;
	private static int NUM_OF_DICE = 5;
	
	private final static Set<Set<Integer>> SMALL_CASES;
	private final static Set<Set<Integer>> LARGE_CASES;
	
	static {
		
		LARGE_CASES = new HashSet<>();

		for (int i = 1; i <= 3; ++i) {
			Set<Integer> large = new HashSet<>(5);
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

	
	private List<Integer> dices; // 5���� �ֻ��� ���� ����� ����Ʈ
	private List<Integer> counts; // �� ���ڰ� ����� �����ߴ��� ���� �� ����Ʈ
	
	public FiveDiceT() {
		ran = new Random();
		// �ֻ����� 5�� �̻����� �þ�� �ʱ� ������ �÷��� �뷮�� 5�� �����Ѵ�
		// # ArrayList�� �ʱ� �뷮�� ���� ���� �Ǹ� �뷮�� 1.5�辿 ������Ų��
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
		//System.out.println("�� ���� ���� Ƚ�� : " + counts);
		System.out.println(check());
		
	}
	
	public static void main(String[] args) {
		FiveDiceT dice01 = new FiveDiceT();
		
		for (int i = 0; i < 100; ++i) {
			dice01.roll();
		}
	}

	public void reRoll(int i) {
		// TODO Auto-generated method stub
		
	}
	
}
