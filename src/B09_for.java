
public class B09_for {

	public static void main(String[] args) {
		// # 반복문
		//	- for, while, do-while(x), for each
		//	- 똑같은 코드를 여러번 반복하고 싶을 때 사용한다
		
		for(int i = 0; i < 50;) {
			System.out.println("Hi" + ++i);
		}
		
		for(int i = 900; i > 0; i -= 100) {
			System.out.println(i);
		}
		
		int num = 0;
		for(; num < 10;) {
			System.out.println("If you want, write");
			++num;
		}
		
		for(int month = 1; month <= 12; ++month) {
			switch (month) {
			case 1: case 2: case 12:
				System.out.println("겨울입니당");
				break;
			default:
				System.out.println("겨울이 아닙니당. 귀찮습니당");
				break;
			}
		}
		
		num = 0;
		for(;;) {
			System.out.println(num++);
			if (num == 20)
				break;
		}
		
		
		for(int i = 0; i < 100; ++i) {
			System.out.printf("%-3d", i);
			if (i % 10 !=  9)
				continue;
			System.out.println();
		}
		
		// 반복문으로 총합 구하기
		int sum = 0;
		for(int i = 80; i <=333; ++i) {
			if(i % 3 == 0)
				sum += i;
		}
		System.out.println(sum);
		
		
	}
}
