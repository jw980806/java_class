package myobj.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class FiveDice {

	// �������� 5���� �ֻ����� ���������� 

	// Ǯ�Ͽ콺 (���� ���ڰ� 2/3��)
	// ���� ��Ʈ����Ʈ (1234/2345/3456)
	// ���� ��Ʈ����Ʈ (12345/23456)
	// 4���̽� (���� ���� 4��)
	// 5���̽� (���� ���� 5��)

	// �� �����ϴ� Ŭ������ �ۼ��ϰ� �׽�Ʈ�غ�����
	
//	public void print(ArrayList<Integer> dice) {
//		
//		
//		
//	}
	static int[] num = {1,2,3,4,5,6};
	static int[] count = new int[6];
	//public static ArrayList<Integer> dice_deck()
	
	public static String result() {
		Random rn = new Random();
		ArrayList<Integer> dice = new ArrayList<>();
		
		while (dice.size() < 5) {
			dice.add(rn.nextInt(6)+1);
		}
		
		System.out.println("Deck : "+dice);
		
		for (int i = 0; i < num.length; ++i) {
			for (int j = 0; j < dice.size(); ++j) {
				if(num[i] == dice.get(j)) {
					++count[i];
				}
			}
		}
		System.out.println(Arrays.toString(count));
		
		String result = "NO PAIR";
		
		int counts = 0;
		int five = 0;
		int four = 0;
		int three = 0;
		int two = 0;
		
		// �ݺ��� �̻��� ����
		for (int i = 0; i < count.length; ++i) {
			
			
			if (count[i] >= 1) {
				++counts;
			} else {
				counts=0;
			}
			
			
			//i >= 3 && i < 6 && counts == 4 && counts != 5 && count[5] != 1
			if (counts == 4) {
				if (count[4] != 1) {
					result = "���� ��Ʈ����Ʈ!";
					break;
				} else if (i == 4 && count[5] != 1 && counts != 5) {
					result = "���� ��Ʈ����Ʈ!";
					break;
				}
			} else if (i >= 4 && i < 6 && counts == 5) {
				result = "���� ��Ʈ����Ʈ!";
				break;
			}
			
			
			if (count[i] == 5) {
				++five;
			} else if (count[i] == 4) {
				++four;
			} else if (count[i] == 3) {
				++three;
			}else if (count[i] == 2) {
				++two;
			}
			
		}

		if(five == 1){
			result = "5���̽�!!";
		} else if (four == 1) {
			result = "4���̽�!";
		} else if (three == 1 && two == 1) {
			result = "Ǯ�Ͽ콺!";
		}
		
		//System.out.println(result);

		//
		//
		Arrays.fill(count, 0);

		return result;
	}

	
}
