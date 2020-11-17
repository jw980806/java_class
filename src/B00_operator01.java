
public class B00_operator01 {

	// 연산자 (operator)
	//  - 연산(계산) 할 때 쓰는 것
	//  - +, -, *, / 등

	public static void main(String[] args) {

		// 산술 연산자
		int a = 8, b =5;
		double c = 5.0;

		// 연산의 우선순위는 알고 있던대로 진행된다. (곱하기, 나누기는 먼저 연산)
		System.out.println("a + b : "+ (a + b));
		System.out.println("a - b : "+ (a - b));
		System.out.println("a * b : "+ a * b);

		// 정수끼리의 나누기는 몫만 나온다. 
		System.out.println("a / b : "+ a / b);

		// 정수와 실수의 나누기는 정확한 계산을 한다.
		System.out.println("a / c : "+a/c);

		// % : 나머지 연산
		System.out.println("a % b : "+ a % b);

		// Math.pow() : 제곱 함수
		System.out.println("a의 b승 : "+Math.pow(a, b));
		// Math.sqrt() : 제곱근
		System.out.println(Math.sqrt(2));
		//Math.abs() : 절대값
		System.out.println(Math.abs(-20));
		//Math.round() : 반올림
		System.out.println(Math.round(1.234));

		// ^ : 제곱이 아니다.(비트연산 XOR)
		System.out.println("a ^ b : "+( a ^ b ));
	}
}
