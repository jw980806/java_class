package quiz;

import java.util.Scanner;

public class B04_appleQuiz {

	// ����� 10���� ���� �� �ִ� �ٱ��ϰ� ���� ��
	// ����ڰ� ����� ������ �Է��ϸ�  ����� ��� �������� �ʿ��� �ٱ����� ������ ����غ�����
	
	
	public static void main(String[] args) {
		System.out.println("����� ������ �Է��ϼ���");
		int apple = new Scanner(System.in).nextInt();
		//int apple = 11;
		// final : ���� �Ұ���
		final double BASKET_SIZE = 10;
		int basket = 0;
		//int cal= apple/BASKET_SIZE;
		if(apple > 0) {
//			if(apple < 10)
//				basket=1;
//			else
//				basket = apple % BASKET_SIZE == 0 ? cal : cal+1;
//			//basket = apple < 10 ? 1 : apple/basket_size + 1;
//			System.out.printf("�ٱ����� ������ %d�� �Դϴ�", basket);
			
			basket = (int)Math.ceil(apple/BASKET_SIZE);
			System.out.printf("�ٱ����� ������ %d�� �Դϴ�", basket);
		}else {
			System.out.println("����� �����ϴ�");
		}
		
		

	}

}
