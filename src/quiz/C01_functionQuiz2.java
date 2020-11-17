package quiz;

import java.awt.font.NumericShaper.Range;
import java.util.Arrays;

public class C01_functionQuiz2 {

	// 1. �ּҰ��� �ִ밪�� �Ű������� ������ �� ������ ��� ���� �����ϴ� 
	//	  int�迭�� �����Ͽ� ��ȯ�ϴ� range�Լ��� �������� (�ּҰ� �̻�, �ִ밪 �̸�)
	
	// 2. �ִ밪�� �Ű������� ���� ������, 0���� �ִ밪 �̸��� ��� ���� ������
	//    int�迭�� �����Ͽ� ��ȯ�ϴ� range2�Լ��� ��������
	
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
	
	// 3. ���ڿ� �迭�� ���޹����� �ش� �迭�� ��� "/"�� �ٿ� �̾���̴� join �Լ��� ��������
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
	

	
	// 4. ���ڿ� Ÿ���� ����(num), ���� ����(base_from), �ٲٷ��� ����(base_to)�� ���޹����� 
	//    base_from�� �����̾��� num�� base_to ������ ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �Լ��� ��������
	//    # ���� ������ �߸��Ȱ�� null�� ��ȯ�մϴ�
	
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
		
		// # �Լ��� �����ε�
		//	- ���� �Լ� �̸����� �پ��� ������ �Լ��� ������ �� �ִ�
		//	- �ٸ� ������ �Լ��� �����ޱ� ���ؼ��� �Ű������� ���� Ȥ�� Ÿ���� �޶���Ѵ�
		
		// # println�� �پ��� �Ű����� Ÿ���� ���� �� �ֵ��� �����ε� �Ǿ��ִ�
		
		System.out.println(Arrays.toString(range(10,2)));
		
		System.out.println(Arrays.toString(range(10)));
		
		String[] str = {"apple","banana","orange","kiwi"};
		System.out.println(Arrays.toString(join(str)));

	}

}
