import java.util.Scanner;

public class B11_while {

	public static void main(String[] args) {
		
		// # while
		//	- for���� ������ �ణ �ٸ� �ݺ��� 
		// 	- �ʱⰪ�� �������� ��ġ�� ���������� �ʴ�
		//	- �������� ��ġ�� ���� �ݺ��� ����� �޶��� �� �ִ�
		// 	- ()���� ������ ���ε��� {]���� ������ �ݺ��Ѵ�
		
		// # while���� ���� �⺻���� ����
		int i = 0;
		while (i < 10) {
			System.out.println("hello, world! " + i);
			++i;
		}
		
		
		int j = 0;
		for(; j < 10;) {
			System.out.println("hello, world! " + j);
			++j;
		}
		
		// While���� ����ϰԲ� ����� Ŭ������
		// - has, next���� ���ľ ���� �Լ��� ������ �ִ�
		// - Ex > Scanner
		
		// System.in : �ܼ��� ���� �Է��ϴ� ��� (inputStream)
		// System.in ��� ���ڿ��� ���� ��ĳ�ʿ� �Է�
		Scanner sc1 = new Scanner("apple banana orange");
		Scanner sc2 = new Scanner("dog cat rat bird");
		Scanner sc3 = new Scanner("I Love You");
		
		// sc1�� ���� ������ �ִ� ���� ���
		while (sc1.hasNext()) {
			System.out.println(sc1.next());
		}
		while (sc3.hasNext()) {
			System.out.println(sc3.next());
		}
		
		// while���� ���� ���α׷� �����ϱ�
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. ����ϱ�");
			System.out.println("2. �����ϱ�");
			
			int cmd = sc.nextInt();
			
			switch(cmd) {
			case 1:
				System.out.println("����մϴ�");
				break;
			case 2:
				System.out.println("�����մϴ�");
				System.exit(0);
				break;
			default:
				System.out.println("�ùٸ� ������ �ƴմϴ�");
				break;
			}
		}

	}

}
