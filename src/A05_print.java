import java.util.Random;

public class A05_print {

	public static void main(String[] args) {
		
		// # 콘솔에 출력하기 위한 여러가지 함수들
		
		// 1. print()
		//	- 줄을 바꾸지 않고 출력한다
		System.out.print("hi");
		System.out.print("hi");
		
		// 2. println()
		//	- 줄을 자동으로 바꾸며 출력한다 (맨 뒤에 \n이 붙는다)
		// 암것도 () 안에 넣지 않으면 \n만 출력된다
		System.out.println("편리1");
		System.out.println("편리2");
		
		// 3. printf()
		//	- 서식 문자를 이용해 출력할 수 있는 함수
		//	- 자동 줄바꿈 없음
		
		// 2020년 10월 20일
		int year = 2020;
		int month = 10;
		int day = 20;
		System.out.printf("%d년 %d월 %d일\n",year,month,day);
		
		// # printf()에 이용되는 서식 문자들
		// %d	  : 정수
		// %f	  : 실수
		// %s	  : 문자열
		// %c	  : 문자
		// %o     : 8진수 정수
		// %x, %X : 16진수 정수	// 0123456789ABCDEF
		System.out.printf("%d년 %d월 %d일의 원/달러 환율 : %.2f\n", 2020, 8, 13, 1200.33);
		System.out.printf("%s님의 신용등급은 '%c'등급입니다.\n", "홍길동", 'A');
		System.out.printf("%d[%c], %x(16), %o(8)\n", 65,65,65,65);
		int num = 13;
		System.out.printf("10진수 %d는 8진수로는 %o,16진수로는 %X입니다.\n",num, num, num);

		// # 서식문자의 옵션들
		// -d만 넣어야 하는건 아님

		// # alt + 방향키 : 블록 이동
		
		// %숫자d : 숫자만큼 칸을 확보한 뒤 오른쪽 정렬하여 출력한다.
		System.out.printf("최종점수 : %d점\n", 9);
		System.out.printf("최종점수 : %5d점\n", 9);
		System.out.printf("최종점수 : %10d점\n", 123456);
		System.out.printf("최종점수 : %10d점\n", 9);
		System.out.printf("최종점수 : %15f점\n", 13.123);

		// %-숫자d : 숫자만큼 칸을 확보한 뒤 값을 왼쪽 정렬하여 출력한다.
		System.out.printf("%s : 10살\n", "나이");
		System.out.printf("%-10s : 10살\n", "나이");
		System.out.printf("%-15s : 10살\n", "나이");
		System.out.printf("%-20s : 10살\n", "나이");

		// %0숫자d : 숫자만큼 칸을 확보한 뒤 빈 칸을 0으로 채워 출력한다.
		System.out.printf("2 X 1 = %02d\n", 2 * 1);
		System.out.printf("2 X 5 = %03d\n", 2 * 5);
		System.out.printf("%010f\n", 123.123); // 소수점 뒷자리 6자리가 우선시 된다
		System.out.printf("%020f\n", 123.123); // 뒷자리 6칸을 채운 이후에 앞에 붙는다
		
		// %+숫자d : 양수 앞에도 부호를 붙이게 된다
		System.out.printf("오늘은 섭씨 '%+d℃'입니다.\n",20);

		// %.숫자f : 소수점 아래 자릿수를 설정한다. 반올림 해줌
		System.out.printf("평균 점수: %.3f\n", 99.87564321);
		System.out.printf(".20\t: %.20f\n", 123.123);

		// String.format() : 서식을 이용해 원하는 문자열을 쉽게 생성할 수 있다.
		String format = "%d년 %d월 %d일의 원/달러 환율 : %.2f\n";
		String todayCurrency = String.format(format, 2020, 5, 13, 999.85);
		System.out.print(todayCurrency);
		
		
	}
}
