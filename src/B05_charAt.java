import java.util.Scanner;

public class B05_charAt {

	public static void main(String[] args) {
		System.out.println("피곤해서 쥬금 ^ㅠ^");
		
		// # "문자열".charAt(index)
		//	- 문자열에서 원하는 번째의 문자를 꺼내는 함수
		//	- 이 함수의 실행 결과는 char타입이다 (반환타입이 char타입이다)
		//	- 첫번째 문자가 0번 문자다
		
		// Math.round() - 반환 타입
		
		// # "문자열".length()
		//	- 문자열이 몇 글자로 이루어져 있는지를 알려준다
		//	- 반환타입 int
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아무거나 입력해보셉욥 > ");
		String word = sc.next();
		//String word2 = sc.nextLine();
		
		char a = word.charAt(0);
		System.out.println(a);
		System.out.println(word.charAt(1));
		//System.out.println(word2);
	}
}
