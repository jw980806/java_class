package quiz;

import java.util.Scanner;

public class B11_reverse_number {

	// ����ڷκ��� ������ �ϳ� �Է¹ް� 
	// �� ������ ���� �ڸ����� ������� ����غ�����
	
	public static void main(String[] args) {
		
		
		System.out.print("Number reverse > ");
		int num = new Scanner(System.in).nextInt(); // int�� 10�ڸ��� ���� Ŀ�� ����
		//int num = 123456789;
		int len = (int)(Math.log10(num)+1);
		
		//System.out.println(len);
		//int i = 0;
		
		int i = 0;
		int a = 10;
		int b = 1;
		while(i < len) {
			System.out.print(num % a / b);
			a *= 10;
			b *= 10;
			if(num % a / b == 0) {
				break;
			}
		}
		
		///////////////////////////////////////////////////////////////////////////
		// ����� �ؼ�
		System.out.println();
		
		int user = 1687295;
		
		while (true) {
			System.out.print(user % 10);
			user /= 10;
			
			if (user <= 0) {
				break;
			}
		}

		
		
		
		
	}
}
