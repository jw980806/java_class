package quiz;

import java.util.Scanner;

public class B01_wonToDollar {

	// �ѱ� ���� �Է��ϸ�
	// �޷� ���Ž� �󸶸� �ްԵǴ��� ������ִ� ���α׷��� ��������
	// (ȯ���� �˻�, �Ҽ� ��°�ڸ����� ���, ȯ�� ������ 1.75%)
	
	public static void main(String[] args) {
		System.out.println("ȯ���� �ݾ��� �Է����ּ���!(��)");
		int k_money = new Scanner(System.in).nextInt();
		double dollar =k_money / 1138.96;
		double susu = dollar * 0.0175;
	    //System.out.println(dollar + " "+susu);
		
		// dollar = dollar * (100 - 1.75) / 100;
		//1,139.10
		System.out.printf("ȯ���� �ݾ� : %.2f�޷�", dollar-susu);
	}
}
