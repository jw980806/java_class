package quiz;

import java.util.Random;
import java.util.Scanner;

public class B13_31game {

	// 1. ��ǻ�Ϳ� ����� �����ư��鼭 ���ڸ� �����Ѵ� (1,2,3) int
	
	// 2. ��ǻ�ʹ� �������� ���ڸ� �����Ѵ�
	
	// 3. �������� 31�� �θ��� ��� Ȥ�� ��ǻ�Ͱ� �й��Ѵ�
	
	
	public static void main(String[] args) {
	
		
		
		String[] who = {"Computer", "User"};
		
		Random rn = new Random();
		String first = who[rn.nextInt(2)];
		
		System.out.printf("������ '%s'�Դϴ�!\n",first);
		
		int[] deck = {1,2,3};
		
		int count = 0;
		int choice = deck[rn.nextInt(3)];
		
		
		// ��ǻ�Ͱ� ���� ��� count�� ���� ���� ���� �� ����
		if(first.equals("Computer")) {
			//lose++;
			count += choice;
			System.out.printf("Computer deck > %d / Count > %d\n", choice, count);
		}
		
		while(true) {
			// ������ ���� �Է��ϸ� ���� �޾� count�� ����
			System.out.println("\n���ڸ� �Է����ּ���(1,2,3 ��)");
			int num = new Scanner(System.in).nextInt();
			
			// ���� ������ ��� ���ڸ� �Է��ϸ� ���ڿ��� ������ ���ư� (?)
			
			if(num >= 1 && num < 4) {
				count += num;
				
				if(count >= 31) {
					System.out.printf("\nCount > %d, User Lose �Ф�",count);
					break;
				}else {
					System.out.printf("User deck > %d / Count > %d\n", num, count);
				}
				
				// ��ǻ���� ���� count+
				count += choice;
				if(count >= 31) {
					System.out.printf("\nCount > %d, Computer Lose �Ф�",count);
					break;
				}else {
					System.out.printf("Computer deck > %d / Count > %d\n", choice, count);
				}

			}else {
				System.out.println("�ùٸ��� ���� �Է��Դϴ�.");
			}
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}
}
