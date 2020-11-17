package quiz;

import java.util.Scanner;

public class B04_appleQuiz {

	// 사과를 10개씩 담을 수 있는 바구니가 있을 때
	// 사용자가 사과의 개수를 입력하면  사과를 모두 남기위해 필요한 바구니의 개수를 출력해보세요
	
	
	public static void main(String[] args) {
		System.out.println("사과의 개수를 입력하세요");
		int apple = new Scanner(System.in).nextInt();
		//int apple = 11;
		// final : 수정 불가능
		final double BASKET_SIZE = 10;
		int basket = 0;
		//int cal= apple/BASKET_SIZE;
		if(apple > 0) {
//			if(apple < 10)
//				basket=1;
//			else
//				basket = apple % BASKET_SIZE == 0 ? cal : cal+1;
//			//basket = apple < 10 ? 1 : apple/basket_size + 1;
//			System.out.printf("바구니의 개수는 %d개 입니다", basket);
			
			basket = (int)Math.ceil(apple/BASKET_SIZE);
			System.out.printf("바구니의 개수는 %d개 입니다", basket);
		}else {
			System.out.println("사과가 없습니당");
		}
		
		

	}

}
