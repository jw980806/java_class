package quiz;

import java.awt.font.NumericShaper.Range;
import java.util.Arrays;

public class C01_functionQuiz2 {

	// 1. 최소값과 최대값을 매개변수로 받으면 그 사이의 모든 값을 포함하는 
	//	  int배열을 생성하여 반환하는 range함수를 만들어보세요 (최소값 이상, 최대값 미만)
	
	// 2. 최대값을 매개변수로 전달 받으면, 0부터 최대값 미만의 모든 값을 포함하
	//    int배열을 생성하여 반환하는 range2함수를 만들어보세요
	
	public static int[] range(int min, int max) {
		
		if(min > max) {
			int temp = min;
			min = max;
			max = temp;
		}
		
		int[] num_list = new int[max - min];
		
		for(int i = 0; i < num_list.length; i++) {
			if(min < max) {
				num_list[i] = min;
				++min;
			}
		}
		
		return num_list;
	}
	
	
	public static int[] range(int end) {
		
		int start = 0;
		
		if(start > end) {
			int temp = start;
			start = end;
			end = temp;
		}
		
		int[] num_list2 = new int[end - start];
		
		for(int i = start; i < end; i++) {
			num_list2[i] = i;
		}
		return num_list2;
		
	}
	
	// 3. 문자열 배열을 전달받으면 해당 배열을 모두 "/"를 붙여 이어붙이는 join 함수를 만들어보세요
	//    apple banana -> apple/banana


	public static String[] join(String[] str) {
		
		String[] join_str = new String[1];
		
		for (int i = 0; i < str.length; i++) {
		    if(i == 0) {
		    	join_str[0] = str[i]+"/";
		    }else if (i != str.length-1) {
				join_str[0] += str[i]+"/";
			}else {
				join_str[0] += str[i];
			}
		}
		return join_str;
	}
	

	
	// 4. 문자열 타입의 숫자(num), 원래 진법(base_from), 바꾸려는 진법(base_to)를 전달받으면 
	//    base_from의 진법이었던 num을 base_to 진법의 문자열로 변환하여 반환하는 함수를 만들어보세요
	//    # 만약 진법이 잘못된경우 null을 반환합니다
	
	public static String two(String num, int base_to) {
		String two = null;
		
		int end = num.length()-1;
		int sum10 = 0;
		String sum16 = "";
		String sum8 = "";

		for (int i= 0; i < num.length()-1; i++) {
			char nums = num.charAt(i);
			if (nums == '1') {
				sum10 += Math.pow(2, end);
				--end;

				if (i == num.length()-2) {
					sum10 += 1;
				}
			}
			
			if(base_to == 16) {
				if (i % 3 == 0) {
					sum16 += (char)sum10;
					sum10 = 0;
				}
			}else if (base_to == 8) {
				if (i % 2 == 0) {
					sum16 += (char)sum10;
					sum10 = 0;
				}
			}

		}
		
		
		
		return two;
	}
	public static String eight(String num, int base_to) {
		String eight = null;

		if (base_to == 2) {

		} else if (base_to == 10) {

		} else if (base_to == 16) {

		}
		
		return eight;
	}
	public static String ten(String num, int base_to) {
		String ten = null;

		if (base_to == 2) {

		} else if (base_to == 8) {

		} else if (base_to == 16) {

		}
		return ten;
	}
	public static String sixteen(String num, int base_to) {
		String sixteen = null;
		
		if (base_to == 2) {

		} else if (base_to == 8) {

		} else if (base_to == 10) {

		}
		return sixteen;
	}
	
	
	public static String change(String num, int base_from, int base_to) {
		
		String result = null;

		if (base_from == 2) {
			result = two(num,base_to);
		} else if (base_from == 8) {
			result = eight(num,base_to);
		} else if (base_from == 10) {
			result = ten(num,base_to);
		} else if (base_from == 16) {
			result = sixteen(num,base_to);
		} 
		
		return result;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		// # 함수의 오버로딩
		//	- 같은 함수 이름으로 다양한 형태의 함수를 정의할 수 있다
		//	- 다른 형태의 함수로 인정받기 위해서는 매개변수의 개수 혹은 타입이 달라야한다
		
		// # println은 다양한 매개변수 타입을 받을 수 있도록 오버로딩 되어있다
		
		System.out.println(Arrays.toString(range(10,2)));
		
		System.out.println(Arrays.toString(range(10)));
		
		String[] str = {"apple","banana","orange","kiwi"};
		System.out.println(Arrays.toString(join(str)));

	}

}
