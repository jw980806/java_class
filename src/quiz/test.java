package quiz;

import java.util.Random;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {

//		int x = 1;
//		int sum = 0;
//
//		while (x < 11) {
//			int x2 = 1;
//			while(x2 <= x) {
//				System.out.print(x2 + " ");
//				sum += x2++;
//			}
//			System.out.println("-> " + sum);
//			x++;
//		}

//		System.out.println("");
//
//				System.out.println("���ڸ� �Է����ּ���");
//				int num = new Scanner(System.in).nextInt();
//				
//				int a = 0;
//				int b = 1;
//				int c = 1;
//
//				for (int i = 1; i < num; i++) {
//					//System.out.print(c+ " ");
//					c = a + b;
//					//System.out.printf("%d��° �Ǻ���ġ ���� %d�Դϴ�",num, c);
//					a = b;
//					b = c;
//				}System.out.printf("\n%d��° �Ǻ���ġ ���� %d�Դϴ�",num, c);


//		Scanner s = new Scanner(System.in);
//		System.out.print("���� �Է� : ");
//		int j=s.nextInt();
//
//		int num1,num2,sum2;
//		num1=0; // ù��°�� �ι�° ���� 1�̾�� �ϹǷ� �ʱⰪ�� 0��
//		num2=1; // 1�� �ش�
//		sum2=1; // ù��° 1�� �׳� �ʱⰪ���� ����
//
//		for(int i=0; i<j; i++)
//		{
//			System.out.print(sum2+" ");
//			sum2=num1+num2; // �� ���� ���� ��
//			num1=num2;
//			num2=sum2; // �ι�° �����ڿ� ���� ���� �־��ش�.
//		}

	
//		for (int dan = 1; dan <= 9; dan++) {
//			for (int gop = 2; gop < 10; gop++) {
//				System.out.printf("%d x %d = %3d ", gop, dan, gop*dan);
//			}System.out.println();
//		}
//		
		// 
		
//		Random rn = new Random();
//		for(int i=0; i<10;i++) {
//			System.out.println(rn.nextInt(101));
//		}
//		System.out.println();
//		for(int i=0; i <5; i++) {
//			System.out.println((int)((Math.random()+1)*50));
//		}
		
		// ����ڷκ��� ���ڸ� �Է¹ް� 1���� �Է��� ���� ���̿� �����ϴ�
		// �Ҽ��� ��� Ǯ���غ�����
		// �� �Ҽ� : ����� 1�� �ڱ� �ڽŹۿ� ���� ����
		// �� ��� : � ���ڸ� ������ �� ������ �������� ��
		
		// 1. ��� ����� �� �ٽ� �Է¹޵��� �����
		// 2. ����ڰ� ���� 0���ϸ� �Է��ϸ� ���α׷� �����ϱ�
		
		//System.out.println(3/2);
		
		
//		for(;;) {
//			System.out.println("\n���ڸ� �Է����ּ���");
//			int num = new Scanner(System.in).nextInt();
//			//int prime = 0;       
//			if(num > 0) {
//				for(int i =2; i <= num; i++) {
//					for(int j = 2; j <= i; j++) {
//						if(i == 2) {
//							System.out.print("2 ");
//							break;
//						}
//						else if(i % j == 0) {
//							break;
//						}else {
//							System.out.printf("%d ",i);
//							break;
//						}
//					}
//				}
//			}else {
//				System.out.println("���α׷� ����");
//				break;
//			}System.out.println();
//		}
		
		
		// 1000���� 9999���� ���� ���ڸ� 100�� �����ϰ� 
		// ���Դ� ���� �� ���� ū ���� ���� ���� ���� ����غ�����
		
//		for(int i = 0; i < 10; i++) {
//			Random rn = new Random();
//			
//		}
//		����ڰ� �ð��� ���� ������� �Է��Ѵ�.
//		9�� 10�� �����̶�� "����"��, 9�� 10�� ���Ķ�� "����"��, ���� 3�� ���Ķ�� "�Ἦ"�� ����Ѵ�.
//		���������� ���� �ð� �Ǵ� ���� �Էµȴٸ� "����"�� ����Ѵ�.
//		(��, �ð��� 24�ð����� �Է¹޴´�)
		
//		System.out.println("�ð��� ���� �Է����ּ���");
//		int hour = new Scanner(System.in).nextInt();
//		int minute = new Scanner(System.in).nextInt();
//		
//		if (hour < 0 || hour > 24 || minute < 0 || minute >59) {
//			System.out.println("����");
//		} else if (hour >= 15) {
//			System.out.println("�Ἦ");
//		} else if (hour >= 9 && minute >= 10) {
//			System.out.println("����");
//		} else {
//			System.out.println("����");
//		}
		
//		1. intŸ�� ���� a�� Ȧ���� �� true
//		2. charŸ�� ���� ch�� �����ڰ� �ƴ� �� true
//		3. booleanŸ�� ���� complete�� false�� �� true
//		4. StringŸ�� �������� str�� "yes"�� �� true
//		5. StringŸ�� �������� command�� 8������ �� true
//		6. StringŸ�� �������� command�� �� ��° ���ڰ� ��/�ҹ��� ������� q�϶� true
		
//		int a = 1;
//		System.out.println(a % 2 != 0);
//		
//		char ch = 'a';
//		System.out.println(!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) );
//		
//		boolean complete = false;
//		System.out.println(!complete);
//		
//		String str = "no";
//		System.out.println(str.equals("yes"));
//		
//		String command = "asQfghjk";
//		System.out.println(command.length() == 8);
//		
//		
//		System.out.println(command.charAt(2) == 'q' || command.charAt(2) == 'Q');
		
		
//		��ǻ�Ͱ� 0���� 1000 ������ ������ �����ϸ�
//		����ڰ� ���ڸ� �Է��Ͽ� ������ ���ߴ� ������ ��������
//
//		����ڰ� ���ڸ� �Է����� �� ��Ȳ���� �˸��� ������ ����ؾ� �մϴ�
//		����ڰ� ������ ���ڰ� ���亸�� ���� ������ ��� - UP!
//		����ڰ� ������ ���ڰ� ���亸�� ���� ������ ��� - DOWN!
//		����ڰ� ������ ������ - ����!
//
//		���� ����� �����̾��� ���ڿ� ���±����� �� �õ�Ƚ���� ����ؾ� �մϴ�.
//		����� > 5
//		UP!
//		����� > 577
//		DOWN!
//		����� > 400
		
//		Random rn = new Random();
//		int answer = rn.nextInt(1001);
//		int count = 0;
//		
//		System.out.println("���� ����! �����ϰ� �����ø� 90000(��(��)��!)�� �Է����ּ���!");
//		while(true) {
//			System.out.print("����� > ");
//			int user = new Scanner(System.in).nextInt();
//			
//			if (user == 90000) {
//				break;
//			} else if (user == answer) {
//				System.out.println("����\n");
//				++count;
//				break;
//			} else if (user > answer && user <= 1000) {
//				System.out.println("Down!");
//				++count;
//			} else if (user < answer && user >= 0) {
//				System.out.println("UP!");
//				++count;
//			} else {
//				System.err.println("0���� 1000 ������ ���ڸ� �Է����ּ���!");
//			}
//
//		}
//		System.out.printf("���� ����!\n���� : %d\n�õ�Ƚ�� : %d", answer, count);
		
//		for (int i = 1; i < 53; i+=13) {
//			System.out.printf("%d %d %d %d %d\n", i, i+9, i+10, i+11, i+12);
//		}
//		
		
		
		
	
	
	
	
	
	
	
	
	
	}

}
