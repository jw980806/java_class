package quiz;

import java.util.Scanner;

public class B09_forQuizBasic {

	// ����ڰ� ���ڸ� �Է����� ��
	// 1. 10���� �Է��� ���ڱ����� �� ���� ���غ�����
	// 2. 1���� �Է��� ���� ������ 3�� ����� ��� ����ϰ� �� ���ִ��� ����ϼ���


	public static void main(String[] args) {
		
		System.out.println("1. ���ڸ� �Է��ϼ���");
		int num = new Scanner(System.in).nextInt();
		int sum = 0;

		if(num < 10) {
			for(int i = num; i <= 10; i++) {
				sum += i;
				//System.out.println(sum);
			}
			System.out.println("���� : "+sum);
		}else {
			for(int i = 10; i <= num; ++i) {
				sum += i;
			}
			System.out.println("���� : "+sum);
		}


		System.out.println("\n2. ���ڸ� �Է��ϼ���");
		int num2 = new Scanner(System.in).nextInt();
		int count = 0;
		int start = 1;
		int end = num2;
		
		if(start > end) {
			int temp = start;
			start = end;
			end = temp;
		}
		
		for (int i = start; i <= end; i++) {
			if (i % 3 == 0) {
				System.out.printf("%d ",i);
				count++;
			}else {
				continue;
			}
		}System.out.println("\ncount: "+count);



	} 
}
