package again;

import java.util.Scanner;

public class B11_369 {
	
	// ����ڷκ��� ���� �ϳ��� �Է¹ް�
	// �ش� ���ڱ��� 369 ������ ����ȴٸ�
	// �ڼ��� �� ��� �ľ��ϴ��� �������
	
	public static void main(String[] args) {

		System.out.println("���ڸ� �Է����ּ���");
		int range = new Scanner(System.in).nextInt();
		
		int clap = 0;
		
		for (int i=1; i<= range; i++) {
			System.out.printf("%d :", i);
			int check = i;
			while(check != 0) {
				int digit = check % 10;
				if (digit % 3 == 0 && digit != 0) {
					++clap;
					System.out.print("¦");
				}
				check /= 10;
			}
			System.out.println();
		}
		System.out.printf("�ڼ� ģ Ƚ�� : %d", clap);
		
		
	}
}
