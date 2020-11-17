package quiz;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import myobj.game.*;

public class D02_FiveDice {

	// 랜덤으로 5개의 주사위를 굴린다음에 

	// 풀하우스 (같은 숫자가 2/3개)
	// 스몰 스트레이트 (1234/2345/3456)
	// 라지 스트레이트 (12345/23456)
	// 4다이스 (같은 숫자 4개)
	// 5다이스 (같은 숫자 5개)

	// 를 구분하는 클래스를 작성하고 테스트해보세용

	// 다른 파일에 작성하고여기서는 갖다 쓰기만 할 것



	public static void main(String[] args) throws InterruptedException {

		//		for(int i=0; i < 100; ++i) {
		//			System.out.println(FiveDice.result() + "\n");
		//		}

		RerollDice dice01 = new RerollDice();
		Scanner sc = new Scanner(System.in);
		
		//while(true) {
		dice01.roll();

		System.out.println("바꾸기 테스트 > ");
		
		Set<Integer> rerolls = new HashSet<>();
		int i = -1;
		while ((i = sc.nextInt()) != -1) {
			rerolls.add(i);
		}
		System.out.println("다시 굴려야하는 인덱스 : " + rerolls);
		dice01.reRoll(rerolls);
		
		Thread.sleep(2000);
		//}

	}
}
