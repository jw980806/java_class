package quiz;

import java.util.Arrays;
import java.util.Random;

public class B13_count_random_fruit {

	// ũ�� 100�� �迭�� ���� ���� ���ڿ��� �����غ�����
	// ���� ������ apple, banana, orange, peach, kiwi
	
	// �� ������ �� �� �����ߴ��� ��� ����ϰ� ����غ�����
	
	public static void main(String[] args) {
		
		int[] count = new int[5];
		
		String[] kinds = {"apple", "banana", "orange", "peach", "kiwi"};
		
		int size= 100;
		
		String[] fruits = new String[size];
		
		
		for (int i = 0; i < size; i++) {
			Random rn = new Random();
			int num = rn.nextInt(5);
			if(i > 10 && i % 11 == 0 && i != size-1) {
				fruits[i] = kinds[num] + "\n";				
			}else {				
				fruits[i] =  kinds[num];				
			}
			//count[num] += 1;
		}
		System.out.print(Arrays.toString(fruits));
		System.out.println("\n");
		
//		for(int i = 0; i < 5; i++) {
//			System.out.printf("%s (��)��\t�� %dȸ ���Խ��ϴ�\n",kinds[i],count[i]);
//		}
		
		for (int i = 0; i < 5; i++) {
			for(int j = 0; j < size; j++) {
				if(kinds[i].equals(fruits[j])) {
					count[i] += 1;
				}
			}
			System.out.printf("%s (��)��\t�� %dȸ ���Խ��ϴ�\n",kinds[i],count[i]);
		}
		
		int orange = 2;
		
		System.out.println("�������� ���? > " + count[orange]);
		
		
	}
	
}
