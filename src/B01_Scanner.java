// Scanner�� ����� ���� import�� �ʿ��ϴ�.
import java.util.Scanner;

// Java���� �ٸ� ��Ű���� Ŭ������ ����ϱ� ���ؼ��� import�� �ʿ��ϴ�.
//  - import ��Ű�� ��.Ŭ���� ��;
import quiz.A01_printQuiz;

public class B01_Scanner {
	public static void main(String[] args) {
		A01_printQuiz.main(null);

		// Scanner
		//  - �ܺο��� ���α׷����� �Է��� ���� �� ����ϴ� Ŭ����

		// 1. ��� �� ��ĳ�ʸ� ���� 
		//    (�ַܼ� �Է� ���� ���� System.in�� �Ű������� �����Ѵ�.)
		Scanner sc = new Scanner(System.in);

		// 2. ����ڿ��� �ȳ����� ������ش�.
		System.out.println("input integer only > ");

		// 3. ���ϴ� Ÿ���� �Է��� ��ٸ���.
		//    (sc.nextInt()���� ������� �Է��� ��ٸ��� ���� ���α׷��� �����.)
		int num = sc.nextInt();
		// double dbl = sc.nextDouble();
		// short srt = sc.nextShort();
		// String str = sc.nextLine(); // �� ��ü�� ���ڿ��� �о���δ�.


		// 4. ���� ���� ������� ����Ѵ�.
		System.out.println("�Է¹��� ���� '" + num + "' �Դϴ�.");
		System.out.println("�Է¹��� ���� �����ڸ� ���ڴ� " + num % 10 + "�Դϴ�.");
		System.out.println("�Է¹��� ���� ���� �ڸ� ���ڴ� "+ num % 100 /10 +"�Դϴ�.");

		int y = 1;
		int sum = 0; 
		int sum2 = 0;
		while (y < 11) {
			sum += y++;
			sum2 += sum;
		}
		System.out.println(sum2);
		
		int x = 1;
		int sum3 =0;
		while (x < 11) {
			//System.out.println(x);
			int x2 =1;
			while (x2 <= x) {
				System.out.print(x2 + " ");
				sum3 += x2++;
			}
			System.out.println("-> " + sum3);
			++x;
		}
	}
}
