import java.util.Arrays;

public class B13_Array {

	// 배열
	//  - 같은 타입의 변수를 한번에 여러개 선언하는 방법
	//  - 인덱스를 활용해 해당 번째의 값에 접근할 수 있다
	//  - 배열은 한번 크기가 정해지면 크기를 변경할 수 없다
	//  - 배열은 초기화가 자동으로 되어있다 ( 정수 : 0, 실수 : 0.0, boolean : false, 참조형 : null)
	
	public static void main(String[] args) {
		// 변수 100개를 쉽게 만드는 방법
		int[] a = new int[100];
		String[] fruits = new String[10];
		System.out.println(fruits[0]);
		
		a[0] = 10;
		a[1] = 55;
		a[99] = 53; // 100개를 만들었다면 인덱스는 99번 까지 있다
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[99]);
		
		// # 배열을 선언하는 방법
		//  1. 타입[] 배열이름 = new 타입[배열크기];
		//  2. 타입[] 배열이름 = {값1, 값2, 값3,...};
		//  3. 타입[] 배열이름 = new 타입[] {값1, 값2, 값3, ..}
		
		String[] colors = {"red", "blue", "green", "yellow"};
		
		System.out.println(colors[0]);
		
		boolean[] testResult = new boolean[] {
				true, false, true, true, true, false
		};   // 1 >0 1 == 0l
		
		// # Arrays.toString(arr) : 전달받은 함수를 보기 좋은 문자열로 반환한다
		//String  result = Arrays.toString(;);
		System.out.println(java.util.Arrays.toString(colors));
		
		
		// # 배열과  반복문 활용하기
		System.out.printf ("colors 배열 길이 : " ,colors.length);
		
		for(int index = 0; index < colors.length; ++index) {
			System.out.printf("%d번째 색깔 : %s\n", index, colors[index]);
		}
		
		// # String을 char형 배열로 변환하기
		String msg = "hello, wolrd!";
		
		char[] msgArr = msg.toCharArray();
				
		for(int i = 0; i < msgArr.length; ++i) {
			System.out.println(msgArr[i]);
		}
		System.out.println();
		
;

	}

}
