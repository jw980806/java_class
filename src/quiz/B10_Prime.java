package quiz;

import java.util.Scanner;

public class B10_Prime {

	// ����ڷκ��� ���ڸ� �Է¹�����
	// 1���� �Է��� ���� ���̿� �����ϴ� �Ҽ��� ��� ����غ�����
	// �Ҽ��� ����� 1�� ���� �ڽŹۿ� ���� ����
	
	public static void main(String[] args) {
		//System.out.println(9%3);
		System.out.println("0 �̻��� ���ڸ� �Է����ּ���");
		int num = new Scanner(System.in).nextInt();

		int sosu = 0;
		for(int i = 2; i < num; i++) {
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if(i % j == 0) {
					sosu++;
				}
			}
			if (sosu == 0) {
				System.out.print(i+ " ");
			}
			sosu=0;
		}
		
//		boolean sosu = true;
//		for(int i = 2; i < num; i++) {
//			for (int j = 2; j <= i; j++) {
//				if(i % j == 0) {
//					sosu++;
//				}
//			}
//		}
		
		
		
		
	}

}
