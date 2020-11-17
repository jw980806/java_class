
public class A01_Escape {


	// # Escape 문자
	// - 특수한 기능을 가진 문자.
	// - 앞에 \(역슬래시)가 붙어서 뒤의 문자와 합쳐져 특수한 기능을 한다.
	// - 두 문자를 합쳐서 하나의 문자로 인식한다.

	// main() 함수에 오타가 있으면 가장 최근에 실행했던 main()을 실행한다.
	public static void main(String[] args) {

		// \n : 줄바꿈의 기능을 가진 특수한 문자.
		System.out.println("안녕하세요, \n반갑습니다.");

		// \t : Tab 키의 기능을 가진 특수문자, 가지런히 줄 맞출 때 사용
		System.out.println("안녕\t하세요, \t반갑습니다.\n");

		// Tab키는 줄을 쉽게 맞출 떄 유용하다.
		System.out.println("이름\t 가격\t 평점");
		System.out.println("국대\t8,000\t 4.5");
		System.out.println("엽떡\t9,000\t 4.3\n");

		// \\ : 그냥 역슬래시를 출력하고 싶을 때 사용한다.
		// \가 들어가면 Escape 문자 처리가 되서 에러남
		// ex> C:\Users\Admin\MyGames\를 출력하고 싶은 경우
		System.out.println("C:\\Users\\Admin\\MyGames\\\n");
		
		// \" : 그냥 큰따옴표를 출력하고 싶을 때 사용한다 ('도 마찬가지로 \')
		//  ex> 저녁은 "지옥에서 먹는다"
		System.out.println("저녁은 \"지옥\"에서 먹는다");
	}
}
