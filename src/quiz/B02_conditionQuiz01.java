package quiz;


public class B02_conditionQuiz01 {

	/*
		[ 알맞은 비교연산을 만들어보세요 ]
		    
		1. int형 변수 a가 10보다 크고 20보다 작을 때 true
		2. int형 변수 b가 짝수일 때 true		
		3. int형 변수 c가 7의 배수일 때 true
		4. int형 변수 hour가 0미만 24이상이 아니고, 12이상일 때 true
		5. int형 변수 d와 e의 차이가 30일 때 true		
		6. int형 변수 year가 400으로 나누어 떨어지거나 
		   또는 4로 나누어 떨어지고 100으로 나누어떨어지지 않을 때 true
		7. 민수가 철수보다 2살 많으면 true
		8. 민수가 철수보다 생일이 3달 빠르면 true  
 		9. boolean형 변수 powerOn이 false일 때 true
		10. 문자열 참조변수 str이 "yes"일 때 true
		11. 삼각형 A가 직각삼각형이면 true
		
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
		System.out.println("불이 꺼져있으면 true : " + !powerOn);
		
		System.out.println("\n(10)");
		String str = "yes";
		String str2 = new String("yes");
		System.out.println(str2 == "yes");  // 주소값으로 가져오기 때문에
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
