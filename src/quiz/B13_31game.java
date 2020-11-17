package quiz;

import java.util.Random;
import java.util.Scanner;

public class B13_31game {

	// 1. 컴퓨터와 사람이 번갈아가면서 숫자를 선택한다 (1,2,3) int
	
	// 2. 컴퓨터는 랜덤으로 숫자를 선택한다
	
	// 3. 마지막에 31을 부르는 사람 혹은 컴퓨터가 패배한다
	
	
	public static void main(String[] args) {
	
		
		
		String[] who = {"Computer", "User"};
		
		Random rn = new Random();
		String first = who[rn.nextInt(2)];
		
		System.out.printf("선공은 '%s'입니다!\n",first);
		
		int[] deck = {1,2,3};
		
		int count = 0;
		int choice = deck[rn.nextInt(3)];
		
		
		// 컴퓨터가 선일 경우 count에 랜덤 값을 더한 후 시작
		if(first.equals("Computer")) {
			//lose++;
			count += choice;
			System.out.printf("Computer deck > %d / Count > %d\n", choice, count);
		}
		
		while(true) {
			// 유저가 값을 입력하면 값을 받아 count에 저장
			System.out.println("\n숫자를 입력해주세요(1,2,3 중)");
			int num = new Scanner(System.in).nextInt();
			
			// 덱의 범위를 벗어난 숫자를 입력하면 문자열이 나오고 돌아감 (?)
			
			if(num >= 1 && num < 4) {
				count += num;
				
				if(count >= 31) {
					System.out.printf("\nCount > %d, User Lose ㅠㅠ",count);
					break;
				}else {
					System.out.printf("User deck > %d / Count > %d\n", num, count);
				}
				
				// 컴퓨터의 랜덤 count+
				count += choice;
				if(count >= 31) {
					System.out.printf("\nCount > %d, Computer Lose ㅠㅠ",count);
					break;
				}else {
					System.out.printf("Computer deck > %d / Count > %d\n", choice, count);
				}

			}else {
				System.out.println("올바르지 않은 입력입니다.");
			}
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}
}
