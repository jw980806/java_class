package quiz;

import java.util.Scanner;

public class B01_celToFahr {

	// ����ڷκ��� ���� �µ��� �Է¹����� ȭ���µ��� ��ȯ�Ͽ� ������ִ� ���α׷��� 
	// ���弼��(��ȯ������ �˻�, ����� �Ҽ� ù°�ڸ�����)
	
	public static void main(String[] args) {
		System.out.println("���� �����µ��� �Է��� �ּ���");
		double c = new Scanner(System.in).nextDouble();
		double f = c * 1.8 + 32;
		
		System.out.printf("��: %.1f -> ��: %.1f", c, f );
		
		
	}
}
