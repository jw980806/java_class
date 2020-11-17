

// # 주석 (Comment)
//   - 프로그래머가 하고 싶은 말을 메모해두는 것
//   - 주석은 프로그램 설명에 영향을 미치지 않는다

// 한줄만 주석처리 된다

/*
 여러줄 주석처리가 가능 
 */

/**
 문서화 주석입니당
 (이클립스가 이 설명을 읽어준다)
 */

// Ctrl + [+,-] : 글자 크기 조절
// Ctrl + M : 현재 창 크기 최대/최소화

// Ctrl + Z : 전에 한일 취소하기
// Ctrl + Y : 방금 취소한거 취소하기


// public class의 이름은 반드시 파일명과 같아야한다
// 빨간줄에 커서대고 F2누르면 정보 확인 가능
public class A00_Hello {

	// # main()함수
	//   - 프로그램의 시작 지점
	//   - main함수의 범위는 중괄호로 결정된다
	public static void main(String[] args) {
		
		// # System.out.println()함수
		//     - ()안에 전달한 데이터를 콘솔에 출력하는 함수
		
		// # 함수란?
		//     - 어떤 단어 뒤에 ()가 붙어있는것은 모두 함수라고 부름
		
		// # 콘솔이란?
		//     - 글자만 나오는 검은 화면 (옛날 컴퓨터 화면)
		//     -이클립스에서는 테스트용으로 하얀바탕의 콘솔 제공
		//     - 실제로 우리가 작성한 프로그램을 검은 화면에서 실행하면 검은 화면에 출력된다
		System.out.println("Hello, World!"); // Ctrl + F11
		System.out.println("tired...");
		System.out.println("┌──────────────────────────────────────┐");
		System.out.println("│		                       │");
		System.out.println("│    |) |)		               │");
		System.out.println("│  (  . . )  {소듕한 별을 찾아서...★}       │");
		System.out.println("│   ( >☆<)                             │");
		System.out.println("│									   │");
		System.out.println("│      1. Start Game  {가자..!}   	   │");
		System.out.println("│      2. Exit	{갈꼬야...? ;^;}	  	   │");
		System.out.println("│									   │");
		System.out.println("└──────────────────────────────────────┘");
		
		// # 자바의 데이터들
		// 1. "" 사이에 적기 : 문자열 (String)
		System.out.println("ABCDEFG아에이오우우우우우우~~!!");
		
		// 2. 그냥 숫자 : 정수 (int, Integer)
		System.out.println(123456);
		System.out.println(123+456);
		
		// 3. 소수 : 실수 (Double, Float)
		System.out.println(123.1234567); // 안붙이면 double
		System.out.println(123.123456f);
		
		// 4. ''사이에 적는 것 : 문자 (Character)
		//   ※ 작은 따옴표에는 문자를 여러개 넣으면 에러가 발생한다
		System.out.println('歇');
		
		// ※ 다른 타입 + 정수 가능
		// 1. 문자열 + 정수는 이어붙임
		System.out.println("123"+456);
		
		// 2. 실수+ 정수는 실수가 된당
		System.out.println(123.0+456);
		
		// 3. 문자 + 정수는 숫자가 된당
		System.out.println('한'+90);
	}
	
}
