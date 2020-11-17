
public class A04_varNaming {
	public static void main(String[] args) {

		// # 변수를 사용해야 하는 이유
		// 1. 값을 한번에 변경할 수 있다.(2번 이상 사용 될 값은 변수를 사용하는 것이 좋다.)
		// 2. 값에 의미를 부여해서 소스 코드의 가독성을 높일 수 있다.(변수의 이름을 잘 짓는 것이 매우 중요하다.)

		int price = 8000;
		System.out.println("가격은: "+price+"원 입니다.");
		System.out.println("가격은: "+8000+"원 입니다.");


		int apple_num = 5; //사과의 개수
		int apple_price = 478; //사과 한 개의 가격
		int apple_cal = 52; //사과 한개의 칼로리
		System.out.println("사과의 개수는: "+apple_num);
		System.out.println("총 가격: "+apple_price*apple_num+"원 입니다.");
		System.out.println("총 칼로리: "+apple_cal*apple_num+"kcal 입니다.");

		/*
		   # 권장되는 변수 작명 규칙 (개발자들의 문화)

		    (1) snake_case
		      - 두 단어 이상을 이어붙인 변수명을 사용할 때 _를 활용한다.
		      - apple_cal, minsu_eng_score
		      - C/C++ 스타일

		    (2) camelCase (낙타 표기법)
		     - 두 단어 이상을 이어붙인 변수명을 사용할 때 대문자를 활용한다.
		     - appleNum, appleCal, userName
		     - Java 스타일

		    (3) 변수의 첫 글자는 소문자를 사용한다.(클래스의 첫 글자는 대문자를 사용한다.)

		    (4) 값이 변하지 않을 변수 (상수)의 이름은 모두 대문자를 사용한다.
		     - MAX_SCORE = 100, PI

		    (5) 변수의 값이 어떤 값인지 추측할 수 있는 단어를 사용하는 것이 좋다.


		   # 필수적인 변수의 작명 규칙 (안지키면 컴파일 에러)

		     (1) 변수명 첫글자는 숫자가 될 수 없다.
		       ex> 1st, 2nd

		     (2) 변수 사이에는 공백을 사용할 수 없다.

		     (3) 특수문자는 _와 $만 사용할 수 있다.
		       ex> @apple, b@anana, #id

		     (4) 이미 자바에서 문법적으로 사용하고 있는 단어들(예약어)은 사용할 수없다.
		       ex> public, static, void, int

		 */
	}
}
