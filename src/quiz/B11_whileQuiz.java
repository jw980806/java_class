package quiz;

public class B11_whileQuiz {

	// while���� �̿��Ͽ�
	
	// 1. 1���� 100������ 3�� ����� ������ ���غ�����
	
	// 2. 200���� 1���� ����غ�����
	
	// 3. 1���� 200������ ������ 2�� ����� �ƴϰ� 3�� ����� �ƴ� ���ڵ��� ������ ���غ�����
	
	public static void main(String[] args) {
		
		int i = 1;
		int total = 0;
		while (i <= 100) {
			if(i % 3 == 0) {
				total += i;
			} i++;
		}System.out.println(total);
		
		
		System.out.println();
		
		int j = 200;
		while (j > 0) {
			System.out.printf("%3d ",j);
			j--;
			if(j % 10 == 0) {
				System.out.println();
			}
		}
		
		System.out.println();
		
		int k = 1;
		int total2 = 0;
		while (k <= 200) {
			if ((k % 2 != 0) && (k % 3 != 0)) {
				total2 += k;
			}k++;
		}System.out.print(total2);
		
		
		
		
	}
	
}
