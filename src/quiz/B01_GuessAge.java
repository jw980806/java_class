package quiz;

import java.util.Scanner;

public class B01_GuessAge {

	// ����ڷκ��� ������ �⵵�� ���̸� �Է¹�����
	// �ѱ� ���̸� ����Ͽ� �� ������ �˷��ִ� ���α׷��� ��������
	
	public static void main(String[] args) {
		System.out.println("������ �⵵�� ������ �Է����ּ���");
		int this_year = new Scanner(System.in).nextInt();
		int birth_year = new Scanner(System.in).nextInt();
		
		int k_age = this_year - birth_year + 1;
		System.out.printf("����� �ѱ� ���̴� %d�� �Դϴ�", k_age);
		
	}
}
