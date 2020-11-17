package quiz;

public class C01_functionQuiz {

	// # ���� �Լ��� �����غ�����

	// 1. ������ ���ڰ� ���ĺ��̸� true�� ��ȯ
	public static boolean alphabet(char ch) {
		return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
	}
	
	// 2. ������ ���ڰ� 3�� ����̸� true
	public static boolean three(int num) {
		return num % 3 == 0;
	}
	
	// 3. ���ڸ� �� �� �����ϸ� �L�� "¦���Դϴ�"
	public static String two(int num2) {
		return num2 % 2 == 0 ? "¦���Դϴ�" : "Ȧ���Դϴ�";
	}
	
	// 4. ������ ���ڰ� �Ҽ����� �ƴ��� �ĺ����ִ� �Լ� (boolean)
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
	
	
	// 5. ���ڸ� �����ϸ� �ش� ������ ���丮�� ����� ��ȯ�ϴ� �Լ�
	//		factorial : (n)*(n-1)*(n-2)...3*2*1
	public static int factorial(int num4) {
		
		int result = 1;
		
		for (int i = num4; i > 0; --i ) {
			result *= i;
		}
		return result;
	}
	
	// ��� �Լ� : �ڱ� �ڽ��� �θ��� �Լ� (���� ������, �б� �E��, �Ӹ� ����)
	public static int recursive_factorial(int num) {
		
		if (num == 1) {
			return 1;
		}
		
		return num * recursive_factorial(num - 1);
		
	}
	
	
	// 6. ���� �ΰ�(a, b)�� �����ϸ� a�� b������ ��ȯ�ϴ� �Լ�
	//		(0������ 1�� ��ȯ�ؾ���, Math.pow����)
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
