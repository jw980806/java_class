import java.util.Arrays;

public class C01_function {

	// �Լ� (function)
	// 	- ����� �̸� �����صΰ� ���߿� ������ ���� ��
	//	- �Լ� �̸� �ڿ� ()�� �ٿ��� �Լ��� ȣ���ϸ� �Լ��� �������� ��ȯ�ȴ�
	//	- ���߿� ������ ���ɼ��� �ִ� ����� �̸� ����� �����ν� �۾��� �ݺ��� ���δ�
	
	public static int appleBasket(int appleNum, int basketSize) {
		
		int result;
		if(appleNum % basketSize == 0) {
			result = appleNum / basketSize;
		}else {
			result = appleNum / basketSize + 1;
		}
		
		return result; // �Լ� Ÿ���� int�̹Ƿ� �����ִ� Ÿ���� int���� �Ѵ� 
	}

	// ex : ���� ������ ��� ������ �Է¹����� ���� �� ������ �˷��ִ� �Լ�
	public static int cheapPrice(int[] prices) {
		int min = 0;
		
		for(int i = 0; i < prices.length; ++i) {
			
			if (i == 0) {
				min = prices[i];
			}else {
				min = Math.min(min, prices[i]);
			}
		}
		return min;
	}
	
	// ex : ������� ��� ������ �˷��ִ� �Լ�
	public static double avgPrice(int[] prices) {
		int sum = 0;
		for (int i = 0; i < prices.length; ++i) {
			sum += prices[i];
		}
		return sum / (double) prices.length;
	}
	
	// ex : ������ ��� ���ݵ��� 10000���� ������Ű�� �Լ�
	public static void raisePrice(int[] prices) {
		for (int i = 0; i < prices.length; ++i) {
			prices[i] += 10000;
		}
		
		// ���� Ÿ���� void�� �Լ��� return���� �ʴ´�
	}
	
	
	public static void main(String[] args) {
		
		int count = appleBasket(25, 10);
		
		count = appleBasket(33, 8);  // ������ �����ϴ�
		
		int[] apples = {1000, 2000, 989, 1100, 990, };
		int[] apples2 = {1500, 2500, 939, 1100, 990, };
		
		System.out.println(avgPrice(apples));
		System.out.println(cheapPrice(apples2));
		
		
		System.out.println("�ʿ��� �ٱ��� ���� : " + count);
		
		
		raisePrice(apples);
		
		System.out.println(Arrays.toString(apples));
		
	}
	
}
