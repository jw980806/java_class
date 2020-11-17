package myobj.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class FiveDice {

	// 랜덤으로 5개의 주사위를 굴린다음에 

	// 풀하우스 (같은 숫자가 2/3개)
	// 스몰 스트레이트 (1234/2345/3456)
	// 라지 스트레이트 (12345/23456)
	// 4다이스 (같은 숫자 4개)
	// 5다이스 (같은 숫자 5개)

	// 를 구분하는 클래스를 작성하고 테스트해보세용
	
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
		
		// 반복문 이상함 고쳐
		for (int i = 0; i < count.length; ++i) {
			
			
			if (count[i] >= 1) {
				++counts;
			} else {
				counts=0;
			}
			
			
			//i >= 3 && i < 6 && counts == 4 && counts != 5 && count[5] != 1
			if (counts == 4) {
				if (count[4] != 1) {
					result = "스몰 스트레이트!";
					break;
				} else if (i == 4 && count[5] != 1 && counts != 5) {
					result = "스몰 스트레이트!";
					break;
				}
			} else if (i >= 4 && i < 6 && counts == 5) {
				result = "라지 스트레이트!";
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
			result = "5다이스!!";
		} else if (four == 1) {
			result = "4다이스!";
		} else if (three == 1 && two == 1) {
			result = "풀하우스!";
		}
		
		//System.out.println(result);

		//
		//
		Arrays.fill(count, 0);

		return result;
	}

	
}
