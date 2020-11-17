package quiz;

import java.util.Arrays;

public class test1 {

	public static void main(String[] args) {
		// 2 -> 10
		String num = "1111";
		int end = num.length()-1;
		int sum10 = 0;
		char[] sum16 = new char[(end+1)/4];
		int a = 0;

		for (int i= 0; i < num.length()-1; i++) {
			char nums = num.charAt(i);
			
			if (nums == '1') {
				sum10 += Math.pow(2, end);
				--end;

				if (i == num.length()-2) {
					sum10 += 1;
				}
			}
			System.out.println(sum10);
			
			if (i != 0 && i % 3 == 0) {
				sum16[a] = (char)(sum10 + 48);
				System.out.println(sum16[a]);
				a++;
				sum10 = 0;
			}
			
		}
		System.out.println(Arrays.toString(sum16));
		
		
		
	}
}
