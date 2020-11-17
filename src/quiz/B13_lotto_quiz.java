package quiz;

import java.util.Arrays;
import java.util.Random;

//import java.util.Random;

public class B13_lotto_quiz {

	// 1부터 45사이의 중복없는 랜덤 숫자 6개로 이루어진 배열을 생성해 보세요
	
	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		//int count = 0;
		
//		for(int i = 0; i < lotto.length; i++) {
//			//int num = (int)(Math.random()*1+45);
//			Random ran = new Random();
//			int num = ran.nextInt(45)+1;
//			if(i == 0) {
//				lotto[i] = num;
//			}else {
//				for(int j = 0; j < i; ) {
//					if(num == lotto[j]) {
//						num = ran.nextInt(45)+1;
//					}else {
//						j++;
//					}
//					lotto[i] = num;
//					
//				}
//			}
//		}
//		System.out.println(Arrays.toString(lotto));
		
		/////////////////////////////////////////////////////
		
		Random ran = new Random();
		
		int[] number = new int[45];
		
		for (int i = 0; i < number.length; ++i) {
			number[i] = i + 1;
		}
		
		// shuffle
		for (int i = 0; i < 50; ++i) {
			int random_index = ran.nextInt(44) +1;
			
			int temp = number[0];
			number[0] = number[random_index];
			number[random_index] = temp;
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.print(number[i] + ", ");
		}
		System.out.println();
		
		
		// 중복숫자 제외
//		int i = 0;
//		
//		while (i != 6) {
//			int random_index = ran.nextInt(45);
//			
//			if(number[random_index] != -1) {
//				lotto[i] = number[random_index];
//				number[random_index] = -1;
//				++i;
//			}
//		}
//		System.out.println(Arrays.toString(number));
		
		
		
		
	}

}
