import java.util.Random;

public class B12_random {

	
	public static void main(String[] args) {
		
		// # java���� ������ ���� �����ϱ�
		
		// 1. Math.random()
		//	- doubleŸ���� 0<= x < 1�� ���� �Ҽ��� �����Ѵ�
		//	- �� �Ҽ��� �̿��Ͽ� ���ϴ� ���ڸ� ���� ����� �� �ִ�
		
		// # ���ϴ� ���ڸ� ����� ���� (ex : 80 ~ 100)
		//	(1) ���ϴ� ������ ������ ���Ѵ�
		//	(2) ���ϴ� ���� �� ���� ���� ���ڸ� ���Ѵ�
		//	(3) �Ҽ��� �Ʒ��� �����Ѵ�
		for(int i = 0; i < 10; i++) {
			System.out.println((int)(Math.random() * 21 + 80));
		}
		
		// 2. Random Ŭ������ �̿�
		//  - ������ �� ���ϴ� �õ��ȣ�� ������ �� �ִ�
		//  - ���� �õ� ���㷯 �Ļ��ϸ� ���� ���� ���´�
		//  - �õ� ��ȣ�� �������� ������ �������� �õ尡 ���õȴ�
		
		// # ���ο� ���� �õ� ����
		Random ran = new Random();
		Random ran2 = new Random();
		
		// # Random.nextInt(bound) 
		//  - 0 ~ bound �̸��� ������ ��ȯ�Ѵ�
		//  - bound�� �������� ������ int���� ��ü���� ���� ������ ���õȴ�
		System.out.println("ran : " + ran.nextInt(30)); // 0 ~ 29
		System.out.println("ran : " + ran.nextInt()); // int ��ü ���� �� ����
		System.out.println("ran2 : " + ran.nextInt(21) + 80); // 80 ~ 100
		
		
		
		
		
		
		
		
		
		// ���� : 3000�̻� 5000 ������ ���� ������ 100�� �����ϰ� 
		
//		int max = -3000;
//		int min = 5000;
//		
//		for(int i = 0; i < 100; i++) {
//			int random = (int)(Math.random() * 2001 + 3000);
//			//System.out.println(random);
//			if (random > max) {
//				max = random;
//			}else if(random < min) {
//				min = random;
//			}
//		}
//		System.out.printf("max > %d / min > %d",max, min);
		
		int max = 0, min = 0;
		for(int i = 0; i < 100; i++) {
			int random = (int)(Math.random() * 2001 + 3000);
			
			if (i == 0) {
				max = random;
				min = random;
			}else {
				// max = max < num ? num : max;
				max = Math.max(max, random);
				// min = min > num ? num : min;
				min = Math.min(min, random);
			}
		}
		
		
		
		
	}
}
