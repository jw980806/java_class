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
			System.err.println("RadixError : ��밡���� ������ 2���� 36�Դϴ�");
			return null;
		}
		
		int pow = num.length() - 1;
	    
		long real_value = 0;
		
		for (int i = pow; i > -1; --i) {
			char digit = num.charAt(pow - i);
			int value = getValue(digit);
			
			// 8�����ε� 8�̻��� ���ڰ� ������ ����
			if (value >= base_from) {
				System.err.println("base_from �̻��� ���� ���� ���ڰ� �ֽ��ϴ�");
				return null;
			}

			System.out.println(digit);
			System.out.println("\t���� �� : " + value);
			System.out.println("\t" + Math.pow(base_from, i) + "�� �ڸ�");
			
			real_value += value * Math.pow(base_from, i);
		}
		System.out.println(base_from + "���� ���ڿ� \"" + num + "\"�� ���� ������"
				+ real_value + "�Դϴ�");
		
		StringBuilder result = new StringBuilder();
		
		// 123456�� 10���� 123456���� ��ȯ�ϴ� ���
		
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
