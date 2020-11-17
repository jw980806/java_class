package quiz;

public class B03_charQuiz {

	
	/*
	 	[알맞은 조건식을 만들어보세요]
	 	
	 	1. char형 변수 a가 'q'또는 'Q'일 때 true
	 	2. char형 변수 b가 공백이나 탭이 아닐 때 true
	 	3. char형 변수 c가 문자('0'~'9')일 때 true
	 	4. char형 변수 d가 영문자(대문자 또는 소문자)일 때 true
	 	5. char형 변수 e가 한글일때 true
	 	6. char형 변수 f가 일본어 일때 true
	 	
	 */
	
	public static void main(String[] args) {
		
		System.out.println("(1)");
		char a = 'a';
		System.out.println(a == 'q' || a == 'Q');
		
		System.out.println("(2)");
		char b = ' ';
		System.out.println(!(b == ' ' || b == '\t'));
		
		System.out.println("(3)");
		char c = '0';
		System.out.println(c >= 48 && c <= 57);
		
		System.out.println("(4)");
		char d = '한';
		System.out.println((d >= 'a' && d <= 'z') || (d >= 'A' && d <= 'Z'));
		
		//참고
		// http://www.hipenpal.com/tool/characters-to-unicode-charts-in-korean.php?unicode=110&nowpage=112
		System.out.println("(5)");
		char e = 'ㅍ';
		//한글 자모 : 0x1100 ~ 0x11FF , 0xAC00 ~ 0xD7A3
		System.out.println((e >= 12593 && e < 12687)|| (e >= 44032 && e <= 55215)); // 자음, 모음
		
		System.out.println("(6)");
		char f = 'ん';
		// 하라가나, 가타카나 : 0x3041 ~ 0x309F , 0x30A0 ~ 0x30FF
		System.out.println(f >= 'あ' && f <= 'ん');
		System.out.println(f >= 12353 && f <= 12447); //히라가나
		System.out.println(f >= 12449 && f <= 12543 ); //가타카나

	}

}
