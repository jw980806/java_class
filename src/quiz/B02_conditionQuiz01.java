package quiz;


public class B02_conditionQuiz01 {

	/*
		[ �˸��� �񱳿����� �������� ]
		    
		1. int�� ���� a�� 10���� ũ�� 20���� ���� �� true
		2. int�� ���� b�� ¦���� �� true		
		3. int�� ���� c�� 7�� ����� �� true
		4. int�� ���� hour�� 0�̸� 24�̻��� �ƴϰ�, 12�̻��� �� true
		5. int�� ���� d�� e�� ���̰� 30�� �� true		
		6. int�� ���� year�� 400���� ������ �������ų� 
		   �Ǵ� 4�� ������ �������� 100���� ����������� ���� �� true
		7. �μ��� ö������ 2�� ������ true
		8. �μ��� ö������ ������ 3�� ������ true  
 		9. boolean�� ���� powerOn�� false�� �� true
		10. ���ڿ� �������� str�� "yes"�� �� true
		11. �ﰢ�� A�� �����ﰢ���̸� true
		
	 */
	
	public static void main(String[] args) {
		
		int a = 16;
		int b = 349;
		int c = 50;
		
		System.out.println("(1,2,3)");
		System.out.println(a > 10 && a < 20);
		System.out.println(b % 2 == 0);
		System.out.println(c % 7 == 0);
		
		System.out.println("\n(4)");
		int hour = 12;
		System.out.println(!(hour < 0 && hour >= 24) && hour >= 12);
		
		System.out.println("\n(5)");
		int d= -34; int e = -4;
		System.out.println(d-e == 30 || e-d == 30);
		System.out.println(Math.abs(d - e) == 30);
		
		System.out.println("\n(6)");
		int year = 2020;
		System.out.println(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
		
		System.out.println("\n(7,8)");
		int minsu_y = 1998; int minsu_m = 8;
		int chul_y = 2001; int chul_m = 3;
		System.out.println(chul_y - minsu_y == 2);
		System.out.println(minsu_m - chul_m == 3);
		
		System.out.println("\n(9)");
		boolean powerOn = false;
		System.out.println("���� ���������� true : " + !powerOn);
		
		System.out.println("\n(10)");
		String str = "yes";
		String str2 = new String("yes");
		System.out.println(str2 == "yes");  // �ּҰ����� �������� ������
		System.out.println(str.equals("yes"));
		
		System.out.println("\n(11)");
//		int RIGHT_ANGLE = 90;
//		int a_1 = 20; int a_2 = 70; int a_3 = 90;
//		System.out.println(( a_1 != 0 && a_2 != 0 && a_3 != 0 )&& a_1 + a_2 + a_3 == 180 
//				&&(a_1 == RIGHT_ANGLE || a_2 == RIGHT_ANGLE || a_3 == RIGHT_ANGLE));
		
		double x = 3.0; double y = 4.0; double z = 6.0;
		System.out.println(Math.pow(x, 2)+ Math.pow(y, 2) == Math.pow(z, 2)
				|| Math.pow(y, 2)+ Math.pow(z, 2) == Math.pow(x, 2)
				|| Math.pow(z, 2)+ Math.pow(x, 2) == Math.pow(y, 2));
		
		

	}

}
