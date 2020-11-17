package quiz;

public class C01_functionQuiz {

	// # 다음 함수를 정의해보세요

	// 1. 전달한 문자가 알파벳이면 true를 반환
	public static boolean alphabet(char ch) {
		return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
	}
	
	// 2. 전달한 숫자가 3의 배수이면 true
	public static boolean three(int num) {
		return num % 3 == 0;
	}
	
	// 3. 숫자를 한 개 전달하면 묹열 "짝수입니다"
	public static String two(int num2) {
		return num2 % 2 == 0 ? "짝수입니다" : "홀수입니다";
	}
	
	// 4. 전달한 숫자가 소수인지 아닌지 파별해주는 함수 (boolean)
	public static boolean prime(int num3) {
		
		if(num3 == 1) {
			return false;
		}
		
		double sqrt = Math.sqrt(num3);
		
		for(int i = 2; i <= sqrt; ++i) {
			if(num3 % i == 0) {
				return false;
			}
		}
		return true;

//		int sosu = 0;
//		
//		boolean isPrime = false;
//		
//		if(num3 == 2) {
//			isPrime = true;
//			return isPrime;
//		}
//		for(int i = 2; i < num3; i++) {
//			
//			if(num3 % i == 0) {
//				sosu++;
//			}
//			if (sosu == 0) {
//				isPrime = true;
//			}
//		}
//		return isPrime;
	}
	
	
	// 5. 숫자를 전달하면 해당 숫자의 팩토리얼 결과를 반환하는 함수
	//		factorial : (n)*(n-1)*(n-2)...3*2*1
	public static int factorial(int num4) {
		
		int result = 1;
		
		for (int i = num4; i > 0; --i ) {
			result *= i;
		}
		return result;
	}
	
	// 재귀 함수 : 자기 자신을 부르는 함수 (성능 안좋음, 읽기 힒듬, 머리 아픔)
	public static int recursive_factorial(int num) {
		
		if (num == 1) {
			return 1;
		}
		
		return num * recursive_factorial(num - 1);
		
	}
	
	
	// 6. 숫자 두개(a, b)를 전달하면 a의 b제곱을 반환하는 함수
	//		(0제곱은 1은 반환해야함, Math.pow금지)
	public static int pow(int num5, int num6) {
		
		int result = 1;
		
		for(int i = 1; i <= num6; i++) {
			result *= num5;
		}
		return result;
		
	}
	

	public static int recursive_pow(int a, int b) {
		int result = a;
		int count = b;
		
		if(count == 1) {
			return result;
		}
		
		return result * recursive_pow(a, count-1);
		
	}
	

	public static int recursive_powT(int a, int b) {
		if(b == 0) {
			return 1;
		}
		return a * recursive_pow(a, b-1);
		
	}
	
	
	
	public static void main(String[] args) {
		
		boolean ch = alphabet('0');
		System.out.println(ch);
		
		boolean num = three(6);
		System.out.println(num);
		
		String num2 = two(42);
		System.out.println(num2);
		
		boolean num3 = prime(6);
		System.out.println(num3);
		
		int num4 = factorial(5);
		System.out.println(num4);
		
		int num56 = pow(3,3);
		System.out.println(num56);
		
		System.out.println(recursive_factorial(5));
		
		System.out.println(recursive_pow(3,3));
	}
	
}
