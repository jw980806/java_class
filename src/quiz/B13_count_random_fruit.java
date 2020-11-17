package quiz;

import java.util.Arrays;
import java.util.Random;

public class B13_count_random_fruit {

	// 크기 100의 배열에 랜덤 과일 문자열을 저장해보세요
	// 과일 종류는 apple, banana, orange, peach, kiwi
	
	// 각 과일이 몇 번 등장했는지 모두 기록하고 출력해보세요
	
	public static void main(String[] args) {
		
		int[] count = new int[5];
		
		String[] kinds = {"apple", "banana", "orange", "peach", "kiwi"};
		
		int size= 100;
		
		String[] fruits = new String[size];
		
		
		for (int i = 0; i < size; i++) {
			Random rn = new Random();
			int num = rn.nextInt(5);
			if(i > 10 && i % 11 == 0 && i != size-1) {
				fruits[i] = kinds[num] + "\n";				
			}else {				
				fruits[i] =  kinds[num];				
			}
			//count[num] += 1;
		}
		System.out.print(Arrays.toString(fruits));
		System.out.println("\n");
		
//		for(int i = 0; i < 5; i++) {
//			System.out.printf("%s (은)는\t총 %d회 나왔습니다\n",kinds[i],count[i]);
//		}
		
		for (int i = 0; i < 5; i++) {
			for(int j = 0; j < size; j++) {
				if(kinds[i].equals(fruits[j])) {
					count[i] += 1;
				}
			}
			System.out.printf("%s (은)는\t총 %d회 나왔습니다\n",kinds[i],count[i]);
		}
		
		int orange = 2;
		
		System.out.println("오랜지가 몇번? > " + count[orange]);
		
		
	}
	
}
