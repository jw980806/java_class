package quiz;

import java.util.Scanner;

public class B10_GCD {

	// �� ���ڸ� �Է¹����� �� ������ �ִ� ������� ���غ�����
	// �ִ� ������� �� ������ ����� �� ���� ū �����
	
	public static int gcd(int p, int q)
	{
		
		if (q == 0) return p;
		return gcd(q, p%q);
	}
	
	public static void main(String[] args) {
//		System.out.println("���ڸ� �ΰ� �Է��ϼ���");
//		int num1 = new Scanner(System.in).nextInt();
//		int num2 = new Scanner(System.in).nextInt();

		int num1 = 15;
		int num2 = 45;
		
		if(num1 < num2) {
			int temp = num2;
			num2 = num1;
			num1 = temp;
		}

//		for(int j = num1; j >= 1 ; j--) {
//			int gcd = 0;
//			if(num1 % j == 0 && num2 % j == 0) {
//				gcd += j;
//				System.out.println(gcd);
//				break;
//			}
//		}
		
		// ��Ŭ���� �˰���
		
		int n = -1;
		
		for(; n != 0;) {
			n = num1 % num2;
			num1 = num2;
			num2 = n;
		}
		System.out.println("�ִ� ������� " + num1 + "�Դϴ�");

		
		
		


		

		
		
		
		
	}
}
