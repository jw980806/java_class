package quiz;

public class C01_1_functionQuiz2 {

	public static char[] digits = "0123456789ABCDEFGHIJKQRSTUVZ".toCharArray();
	
	public static char getSymbol(int value) {
		return digits[value];
	}
	
	public static int getValue(char digit) {
		
		for (int i = 0; i < digits.length; i++) {
			
			if (digits[i] == digit) {
				return i;
			}
		}
		return -1;
	}
	
	
	public static String convert_base(String num, int base_from, int base_to) {
		num = num.toUpperCase();
		
		if (base_from < 2 || base_from > 36 || base_to < 2 || base_to > 36) {
			System.err.println("RadixError : 사용가능한 진법은 2부터 36입니다");
			return null;
		}
		
		int pow = num.length() - 1;
	    
		long real_value = 0;
		
		for (int i = pow; i > -1; --i) {
			char digit = num.charAt(pow - i);
			int value = getValue(digit);
			
			// 8진법인데 8이상의 숫자가 있으면 에러
			if (value >= base_from) {
				System.err.println("base_from 이상의 값을 지닌 문자가 있습니다");
				return null;
			}

			System.out.println(digit);
			System.out.println("\t실제 값 : " + value);
			System.out.println("\t" + Math.pow(base_from, i) + "의 자리");
			
			real_value += value * Math.pow(base_from, i);
		}
		System.out.println(base_from + "진법 문자열 \"" + num + "\"의 값은 실제로"
				+ real_value + "입니다");
		
		StringBuilder result = new StringBuilder();
		
		// 123456을 10진수 123456으로 변환하는 방법
		
		while (real_value > 0) {
			result.append(getSymbol((int)real_value % base_to));
			real_value /= base_to;
		}
		
		return result.reverse().toString();
	}
	
	public static void main(String[] args) {
		
		System.out.println(convert_base("123",10,2));
		System.out.println(convert_base("ABCDEF",16,8));
		//System.out.println(convert_base("123",2,2));

	}

}
