// Scanner를 사용할 때는 import가 필요하다.
import java.util.Scanner;

// Java에서 다른 패키지의 클래스를 사용하기 위해서는 import가 필요하다.
//  - import 패키지 명.클래스 명;
import quiz.A01_printQuiz;

public class B01_Scanner {
	public static void main(String[] args) {
		A01_printQuiz.main(null);

		// Scanner
		//  - 외부에서 프로그램으로 입력을 받을 때 사용하는 클래스

		// 1. 사용 할 스캐너를 생성 
		//    (콘솔로 입력 받을 때는 System.in을 매개변수로 전달한다.)
		Scanner sc = new Scanner(System.in);

		// 2. 사용자에게 안내문을 출력해준다.
		System.out.println("input integer only > ");

		// 3. 원하는 타입의 입력을 기다린다.
		//    (sc.nextInt()에서 사용자의 입력을 기다리기 위해 프로그램이 멈춘다.)
		int num = sc.nextInt();
		// double dbl = sc.nextDouble();
		// short srt = sc.nextShort();
		// String str = sc.nextLine(); // 줄 전체를 문자열로 읽어들인다.


		// 4. 받은 값을 마음대로 사용한다.
		System.out.println("입력받은 값은 '" + num + "' 입니다.");
		System.out.println("입력받은 값의 일의자리 숫자는 " + num % 10 + "입니다.");
		System.out.println("입력받은 값의 십의 자리 숫자는 "+ num % 100 /10 +"입니다.");

		int y = 1;
		int sum = 0; 
		int sum2 = 0;
		while (y < 11) {
			sum += y++;
			sum2 += sum;
		}
		System.out.println(sum2);
		
		int x = 1;
		int sum3 =0;
		while (x < 11) {
			//System.out.println(x);
			int x2 =1;
			while (x2 <= x) {
				System.out.print(x2 + " ");
				sum3 += x2++;
			}
			System.out.println("-> " + sum3);
			++x;
		}
	}
}
