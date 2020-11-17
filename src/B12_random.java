import java.util.Random;

public class B12_random {

	
	public static void main(String[] args) {
		
		// # java에서 무작위 숫자 생성하기
		
		// 1. Math.random()
		//	- double타입의 0<= x < 1인 랜덤 소수를 생성한다
		//	- 이 소수를 이용하여 원하는 숫자를 만들어서 사용할 수 있다
		
		// # 원하는 숫자를 만드는 절차 (ex : 80 ~ 100)
		//	(1) 원하는 숫자의 갯수를 곱한다
		//	(2) 원하는 숫자 중 가장 작은 숫자를 더한다
		//	(3) 소수점 아래를 삭제한다
		for(int i = 0; i < 10; i++) {
			System.out.println((int)(Math.random() * 21 + 80));
		}
		
		// 2. Random 클래스를 이용
		//  - 생성할 때 원하는 시드번호를 선택할 수 있다
		//  - 같은 시드 번허러 셍상하면 같은 값이 나온다
		//  - 시드 번호를 전달하지 않으면 무작위로 시드가 선택된다
		
		// # 새로운 랜덤 시드 생성
		Random ran = new Random();
		Random ran2 = new Random();
		
		// # Random.nextInt(bound) 
		//  - 0 ~ bound 미만의 정수를 반환한다
		//  - bound를 전달하지 않으면 int범위 전체에서 랜덤 정수가 선택된다
		System.out.println("ran : " + ran.nextInt(30)); // 0 ~ 29
		System.out.println("ran : " + ran.nextInt()); // int 전체 범위 중 선택
		System.out.println("ran2 : " + ran.nextInt(21) + 80); // 80 ~ 100
		
		
		
		
		
		
		
		
		
		// 연습 : 3000이상 5000 이하의 랜덤 정수를 100번 생성하고 
		
//		int max = -3000;
//		int min = 5000;
//		
//		for(int i = 0; i < 100; i++) {
//			int random = (int)(Math.random() * 2001 + 3000);
//			//System.out.println(random);
//			if (random > max) {
//				max = random;
//			}else if(random < min) {
//				min = random;
//			}
//		}
//		System.out.printf("max > %d / min > %d",max, min);
		
		int max = 0, min = 0;
		for(int i = 0; i < 100; i++) {
			int random = (int)(Math.random() * 2001 + 3000);
			
			if (i == 0) {
				max = random;
				min = random;
			}else {
				// max = max < num ? num : max;
				max = Math.max(max, random);
				// min = min > num ? num : min;
				min = Math.min(min, random);
			}
		}
		
		
		
		
	}
}
