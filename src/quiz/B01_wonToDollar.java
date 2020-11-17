package quiz;

import java.util.Scanner;

public class B01_wonToDollar {

	// 한국 돈을 입력하면
	// 달러 구매시 얼마를 받게되는지 계산해주는 프로그램을 만들어보세요
	// (환율은 검색, 소수 둘째자리까지 출력, 환전 수수료 1.75%)
	
	public static void main(String[] args) {
		System.out.println("환전할 금액을 입력해주세요!(￦)");
		int k_money = new Scanner(System.in).nextInt();
		double dollar =k_money / 1138.96;
		double susu = dollar * 0.0175;
	    //System.out.println(dollar + " "+susu);
		
		// dollar = dollar * (100 - 1.75) / 100;
		//1,139.10
		System.out.printf("환산한 금액 : %.2f달러", dollar-susu);
	}
}
