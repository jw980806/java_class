package quiz;

import java.util.Scanner;

public class B11_count_369_clap {

	// ����ڷκ��� ���� �ϳ��� �Է¹ް�
	// �ش� ���ڱ��� 369 ������ ����ȴٸ�
	// �ڼ��� �� ��� �ľ��ϴ��� �������
	
	public static void main(String[] args) {
		
		//int num = 14;
		System.out.println("���ڸ� �Է��ϼ���");
//		int num = new Scanner(System.in).nextInt();
		
//		int start = 1;
//		int count = 0;
//		int clap = 0;
//		int again;
//		
//		while(start <= num) {
//			again = start;
//			int temp = 0;
//			
//			while (again > 0) {
//				if (again == 3 || again == 6 || again == 9 ) {
//					count++;
//					clap++;
//				}
//				
//				System.out.println(again + " " + clap);
//				again /= 10;
//			}
//			start++;
//		}
//		System.out.println(count);
		
		// ���ڿ��� ����ϴ� ���
		
//		int user = 333;
//		int clap = 0;
//		for (int i =1; i <= user; ++i) {
//			String check = "" + i;
//			int len = check.length();
//			
//			for (int j = 0; j < len; ++j) {
//				if (check.charAt(j) == '3'||
//						check.charAt(j) == '6'||
//						check.charAt(j) == '9') {
//					++clap;
//				}
//			}
//		} System.out.println(clap);
		
		
		// ���α׷� ����ð� ����
		long start_time = System.currentTimeMillis();
		
		
		// ���ڸ� �̿��ϴ� ���
		
		int user2 = new Scanner(System.in).nextInt();
		int clap2 = 0;
		
		boolean debugMode = true;
		
		for(int i = 1; i <= user2; ++i) {
			int check = i;
			
			if (debugMode) System.out.printf("%d : ",i);
			while (check != 0) {
				int digit = check % 10;
				if( digit % 3 == 0 && digit != 0) {
					++clap2;
					if(debugMode)System.out.print("¦");
					
				}
				check /= 10;
			}
			if(debugMode)System.out.println();
			
			
		}System.out.println(clap2 + "ȸ");
		
		long end_time = System.currentTimeMillis();
		System.out.println("�ɸ� �ð� : "+ (end_time-start_time)); //ms
		

		
		
		
		
		
		
		//////////////////////�ٸ���
		//System.out.println(3%9);
//		while(i <= num) {
//			if (i % 10 == 9) {
//				count += 3;
//				System.out.print(i+"(¦¦¦) ");
//				System.out.println();
//			}else if (i % 10 == 6) {
//				count += 2;
//				System.out.print(i+"(¦¦) ");
//			}else if (i % 10 == 3) {
//				count+=1;
//				System.out.print(i+"(¦) ");
//			}
//			i++;
//		}
//		System.out.printf("\n�ڼ��� %d�� �������ϴ�!",count);
		
		
	}
	
}
