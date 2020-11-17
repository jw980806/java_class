import java.util.Arrays;

public class C01_function {

	// 함수 (function)
	// 	- 기능을 미리 정의해두고 나중에 가져다 쓰는 것
	//	- 함수 이름 뒤에 ()를 붙여서 함수를 호출하면 함수의 실행결과가 반환된다
	//	- 나중에 재사용할 가능성이 있는 기능을 미리 만들어 둠으로써 작업의 반복을 줄인다
	
	public static int appleBasket(int appleNum, int basketSize) {
		
		int result;
		if(appleNum % basketSize == 0) {
			result = appleNum / basketSize;
		}else {
			result = appleNum / basketSize + 1;
		}
		
		return result; // 함수 타입이 int이므로 돌려주는 타입이 int여야 한다 
	}

	// ex : 여러 슈퍼의 사과 가격을 입력받으면 가장 싼 가겨을 알려주는 함수
	public static int cheapPrice(int[] prices) {
		int min = 0;
		
		for(int i = 0; i < prices.length; ++i) {
			
			if (i == 0) {
				min = prices[i];
			}else {
				min = Math.min(min, prices[i]);
			}
		}
		return min;
	}
	
	// ex : 사과들의 평균 가격을 알려주는 함수
	public static double avgPrice(int[] prices) {
		int sum = 0;
		for (int i = 0; i < prices.length; ++i) {
			sum += prices[i];
		}
		return sum / (double) prices.length;
	}
	
	// ex : 전달한 사과 가격들을 10000원씩 증가시키는 함수
	public static void raisePrice(int[] prices) {
		for (int i = 0; i < prices.length; ++i) {
			prices[i] += 10000;
		}
		
		// 리턴 타입이 void인 함수는 return하지 않는다
	}
	
	
	public static void main(String[] args) {
		
		int count = appleBasket(25, 10);
		
		count = appleBasket(33, 8);  // 재사용이 간편하다
		
		int[] apples = {1000, 2000, 989, 1100, 990, };
		int[] apples2 = {1500, 2500, 939, 1100, 990, };
		
		System.out.println(avgPrice(apples));
		System.out.println(cheapPrice(apples2));
		
		
		System.out.println("필요한 바구니 개수 : " + count);
		
		
		raisePrice(apples);
		
		System.out.println(Arrays.toString(apples));
		
	}
	
}
