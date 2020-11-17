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
//				System.out.println("숫자를 입력해주세요");
//				int num = new Scanner(System.in).nextInt();
//				
//				int a = 0;
//				int b = 1;
//				int c = 1;
//
//				for (int i = 1; i < num; i++) {
//					//System.out.print(c+ " ");
//					c = a + b;
//					//System.out.printf("%d번째 피보나치 수는 %d입니다",num, c);
//					a = b;
//					b = c;
//				}System.out.printf("\n%d번째 피보나치 수는 %d입니다",num, c);


//		Scanner s = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		int j=s.nextInt();
//
//		int num1,num2,sum2;
//		num1=0; // 첫번째와 두번째 값이 1이어야 하므로 초기값을 0과
//		num2=1; // 1로 준다
//		sum2=1; // 첫번째 1은 그냥 초기값으로 설정
//
//		for(int i=0; i<j; i++)
//		{
//			System.out.print(sum2+" ");
//			sum2=num1+num2; // 두 값을 더한 후
//			num1=num2;
//			num2=sum2; // 두번째 연산자에 더한 값을 넣어준다.
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
		
		// 사용자로부터 숫자를 입력받고 1부터 입력한 숫자 사이에 존재하는
		// 소수를 모두 풀력해보세요
		// ※ 소수 : 약수가 1과 자기 자신밖에 없는 숫자
		// ※ 약수 : 어떤 숫자를 나눴을 때 나누어 떨어지는 수
		
		// 1. 모두 출력한 후 다시 입력받도록 만들기
		// 2. 사용자가 숫자 0이하를 입력하면 프로그램 종료하기
		
		//System.out.println(3/2);
		
		
//		for(;;) {
//			System.out.println("\n숫자를 입력해주세요");
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
//				System.out.println("프로그램 종료");
//				break;
//			}System.out.println();
//		}
		
		
		// 1000부터 9999까지 랜덤 숫자를 100번 생성하고 
		// 나왔던 숫자 중 가장 큰 수와 가장 작은 수를 출력해보세요
		
//		for(int i = 0; i < 10; i++) {
//			Random rn = new Random();
//			
//		}
//		사용자가 시간과 분을 순서대로 입력한다.
//		9시 10분 이전이라면 "정상"을, 9시 10분 이후라면 "지각"을, 오후 3시 이후라면 "결석"을 출력한다.
//		정상적이지 않은 시간 또는 분이 입력된다면 "에러"를 출력한다.
//		(단, 시간은 24시간제로 입력받는다)
		
//		System.out.println("시간과 분을 입력해주세요");
//		int hour = new Scanner(System.in).nextInt();
//		int minute = new Scanner(System.in).nextInt();
//		
//		if (hour < 0 || hour > 24 || minute < 0 || minute >59) {
//			System.out.println("에러");
//		} else if (hour >= 15) {
//			System.out.println("결석");
//		} else if (hour >= 9 && minute >= 10) {
//			System.out.println("지각");
//		} else {
//			System.out.println("정상");
//		}
		
//		1. int타입 변수 a가 홀수일 때 true
//		2. char타입 변수 ch가 영문자가 아닐 때 true
//		3. boolean타입 변수 complete가 false일 때 true
//		4. String타입 참조변수 str이 "yes"일 때 true
//		5. String타입 참조변수 command가 8글자일 때 true
//		6. String타입 참조변수 command의 세 번째 글자가 대/소문자 관계없이 q일때 true
		
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
		
		
//		컴퓨터가 0부터 1000 사이의 정답을 생성하면
//		사용자가 숫자를 입력하여 정답을 맞추는 게임을 만들어보세요
//
//		사용자가 숫자를 입력했을 때 상황별로 알맞은 정보를 출력해야 합니다
//		사용자가 선택한 숫자가 정답보다 낮은 숫자인 경우 - UP!
//		사용자가 선택한 숫자가 정답보다 높은 숫자인 경우 - DOWN!
//		사용자가 정답을 맞춘경우 - 정답!
//
//		게임 종료시 정답이었던 숫자와 여태까지의 총 시도횟수를 출력해야 합니다.
//		사용자 > 5
//		UP!
//		사용자 > 577
//		DOWN!
//		사용자 > 400
		
//		Random rn = new Random();
//		int answer = rn.nextInt(1001);
//		int count = 0;
//		
//		System.out.println("게임 시작! 종료하고 싶으시면 90000(그(ㅜ)만!)을 입력해주세요!");
//		while(true) {
//			System.out.print("사용자 > ");
//			int user = new Scanner(System.in).nextInt();
//			
//			if (user == 90000) {
//				break;
//			} else if (user == answer) {
//				System.out.println("정답\n");
//				++count;
//				break;
//			} else if (user > answer && user <= 1000) {
//				System.out.println("Down!");
//				++count;
//			} else if (user < answer && user >= 0) {
//				System.out.println("UP!");
//				++count;
//			} else {
//				System.err.println("0부터 1000 사이의 숫자를 입력해주세요!");
//			}
//
//		}
//		System.out.printf("게임 종료!\n정답 : %d\n시도횟수 : %d", answer, count);
		
//		for (int i = 1; i < 53; i+=13) {
//			System.out.printf("%d %d %d %d %d\n", i, i+9, i+10, i+11, i+12);
//		}
//		
		
		
		
	
	
	
	
	
	
	
	
	
	}

}
