
public class B06_switch {

	public static void main(String[] args) {
		
		// # switch-case문
		//	- ()의 연산 결과에 따라 실행할 코드를 결정한다
		//	- if문으로 완벽하게 대체 가능하당
		
		int a = 10;
		
		switch(a%2) {
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
			break;
		default:
			System.out.println("대체 뭘쓴거야 ㄷㄷ");
		}
		
		String word = "apple";
		switch(word.charAt(0)) {
		case 'A': case 'a':
			System.out.println("a로 시작하는 단어입니다");
			break;
		case 'B': case 'b':
			System.out.println("b로 시작하는 단어입니다");
			break;
		case 'C': case 'c':
			System.out.println("c로 시작하는 단어입니다");
			break;
		default:
			System.out.println("위의 케이스가 모두 아닙니다");
		}
	}
}
