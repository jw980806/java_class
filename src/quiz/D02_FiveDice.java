package quiz;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import myobj.game.*;

public class D02_FiveDice {

	// �������� 5���� �ֻ����� ���������� 

	// Ǯ�Ͽ콺 (���� ���ڰ� 2/3��)
	// ���� ��Ʈ����Ʈ (1234/2345/3456)
	// ���� ��Ʈ����Ʈ (12345/23456)
	// 4���̽� (���� ���� 4��)
	// 5���̽� (���� ���� 5��)

	// �� �����ϴ� Ŭ������ �ۼ��ϰ� �׽�Ʈ�غ�����

	// �ٸ� ���Ͽ� �ۼ��ϰ��⼭�� ���� ���⸸ �� ��



	public static void main(String[] args) throws InterruptedException {

		//		for(int i=0; i < 100; ++i) {
		//			System.out.println(FiveDice.result() + "\n");
		//		}

		RerollDice dice01 = new RerollDice();
		Scanner sc = new Scanner(System.in);
		
		//while(true) {
		dice01.roll();

		System.out.println("�ٲٱ� �׽�Ʈ > ");
		
		Set<Integer> rerolls = new HashSet<>();
		int i = -1;
		while ((i = sc.nextInt()) != -1) {
			rerolls.add(i);
		}
		System.out.println("�ٽ� �������ϴ� �ε��� : " + rerolls);
		dice01.reRoll(rerolls);
		
		Thread.sleep(2000);
		//}

	}
}
