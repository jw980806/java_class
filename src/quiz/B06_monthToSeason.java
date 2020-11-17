package quiz;

import java.util.Scanner;

public class B06_monthToSeason {

	// 사용자로부터 달을 입력받으면 해당하는 계절을 출력해보세요
	// switch-case문을 반드시 이용해주세용
	
	public static void main(String[] args) {
	
		System.out.println("현재의 달을 입력해주세요");
		int month = new Scanner(System.in).nextInt();
		
		switch (month) {
		case 3: case 4: case 5:
			System.out.println("봄이 왔어용(♡°▽°♡)");
			break;
		case 6: case 7: case 8:
			System.out.println("여름 이네용(〜￣▽￣)〜");
			break;
		case 9: case 10: case 11:
			System.out.println("가을 이여요(♡°▽°♡)");
			break;
		case 12: case 1: case 2:
			System.out.println("겨울이라 너무 싫어ヽ(`⌒´メ)ノ");
			break;
		default:
			System.out.println("올바른 달을 입력해주세요 ;^;");
		}
	}
}
