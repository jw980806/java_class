package quiz;

import java.util.Scanner;

public class B10_NextPrime {

	// ����ڷκ�Ŀ ���ڸ� �Է¹�����
	// �Է¹��� ������ �� ũ�ų� ���� ���� �Ҽ�ň ã�Ƽ� ����غ�����
	
	public static void main(String[] args) {
		
		System.out.println("Number > ");
		int num = new Scanner(System.in).nextInt();
		//int num = 8;
		
		//int range = num * 5;
		
		for(int i = num; true;) {
			int sosu = 0;
			for(int j = 2; j <= i; j++) {
				if(i % j == 0) {
					sosu++;
				}
			}
			if(sosu == 1) {
				System.out.print("�Է¹��� ������ �� ũ�ų� ���� ���� �Ҽ� > "+i);
				break;
			}else {
				i++;
			}
			sosu =0;
		}
	}
}
