package quiz;

import java.util.Scanner;

public class B04_scoreToGrade {
	
	// return() : main()�� ����
	// System.exit(0); : ���α׷��� ����
	
	public static void main(String[] args) {
		System.out.println("������ �Է����ּ���(������ ����)");
		int num = new Scanner(System.in).nextInt();
		if(num >=0 && num <=100) {
			if(num >= 90)
				System.out.println("����� ������ A�Դϴ�");
			else if (num >= 80)
				System.out.println("����� ������ B�Դϴ�");
			else if(num >= 70)
				System.out.println("����� ������ C�Դϴ�");
			else if(num >= 60)
				
				System.out.println("����� ������ D�Դϴ�");
			else
				System.out.println("����� ������ F�Դϴ�");
		}else {
			System.out.println("�ùٸ� ������ �Է����ּ���");
		}
	}
}
