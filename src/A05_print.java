import java.util.Random;

public class A05_print {

	public static void main(String[] args) {
		
		// # �ֿܼ� ����ϱ� ���� �������� �Լ���
		
		// 1. print()
		//	- ���� �ٲ��� �ʰ� ����Ѵ�
		System.out.print("hi");
		System.out.print("hi");
		
		// 2. println()
		//	- ���� �ڵ����� �ٲٸ� ����Ѵ� (�� �ڿ� \n�� �ٴ´�)
		// �ϰ͵� () �ȿ� ���� ������ \n�� ��µȴ�
		System.out.println("��1");
		System.out.println("��2");
		
		// 3. printf()
		//	- ���� ���ڸ� �̿��� ����� �� �ִ� �Լ�
		//	- �ڵ� �ٹٲ� ����
		
		// 2020�� 10�� 20��
		int year = 2020;
		int month = 10;
		int day = 20;
		System.out.printf("%d�� %d�� %d��\n",year,month,day);
		
		// # printf()�� �̿�Ǵ� ���� ���ڵ�
		// %d	  : ����
		// %f	  : �Ǽ�
		// %s	  : ���ڿ�
		// %c	  : ����
		// %o     : 8���� ����
		// %x, %X : 16���� ����	// 0123456789ABCDEF
		System.out.printf("%d�� %d�� %d���� ��/�޷� ȯ�� : %.2f\n", 2020, 8, 13, 1200.33);
		System.out.printf("%s���� �ſ����� '%c'����Դϴ�.\n", "ȫ�浿", 'A');
		System.out.printf("%d[%c], %x(16), %o(8)\n", 65,65,65,65);
		int num = 13;
		System.out.printf("10���� %d�� 8�����δ� %o,16�����δ� %X�Դϴ�.\n",num, num, num);

		// # ���Ĺ����� �ɼǵ�
		// -d�� �־�� �ϴ°� �ƴ�

		// # alt + ����Ű : ��� �̵�
		
		// %����d : ���ڸ�ŭ ĭ�� Ȯ���� �� ������ �����Ͽ� ����Ѵ�.
		System.out.printf("�������� : %d��\n", 9);
		System.out.printf("�������� : %5d��\n", 9);
		System.out.printf("�������� : %10d��\n", 123456);
		System.out.printf("�������� : %10d��\n", 9);
		System.out.printf("�������� : %15f��\n", 13.123);

		// %-����d : ���ڸ�ŭ ĭ�� Ȯ���� �� ���� ���� �����Ͽ� ����Ѵ�.
		System.out.printf("%s : 10��\n", "����");
		System.out.printf("%-10s : 10��\n", "����");
		System.out.printf("%-15s : 10��\n", "����");
		System.out.printf("%-20s : 10��\n", "����");

		// %0����d : ���ڸ�ŭ ĭ�� Ȯ���� �� �� ĭ�� 0���� ä�� ����Ѵ�.
		System.out.printf("2 X 1 = %02d\n", 2 * 1);
		System.out.printf("2 X 5 = %03d\n", 2 * 5);
		System.out.printf("%010f\n", 123.123); // �Ҽ��� ���ڸ� 6�ڸ��� �켱�� �ȴ�
		System.out.printf("%020f\n", 123.123); // ���ڸ� 6ĭ�� ä�� ���Ŀ� �տ� �ٴ´�
		
		// %+����d : ��� �տ��� ��ȣ�� ���̰� �ȴ�
		System.out.printf("������ ���� '%+d��'�Դϴ�.\n",20);

		// %.����f : �Ҽ��� �Ʒ� �ڸ����� �����Ѵ�. �ݿø� ����
		System.out.printf("��� ����: %.3f\n", 99.87564321);
		System.out.printf(".20\t: %.20f\n", 123.123);

		// String.format() : ������ �̿��� ���ϴ� ���ڿ��� ���� ������ �� �ִ�.
		String format = "%d�� %d�� %d���� ��/�޷� ȯ�� : %.2f\n";
		String todayCurrency = String.format(format, 2020, 5, 13, 999.85);
		System.out.print(todayCurrency);
		
		
	}
}
