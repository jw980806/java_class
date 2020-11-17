package quiz;

public class B09_printAlphabet {

	// 반복문을 이용하여 A부터 Z까지 출룍
	public static void main(String[] args) {
		for(char upper = 'A'; upper <= 'Z'; upper++) {
			System.out.print(upper+ " ");
		}
		
		
		
		System.out.println();
		
		for(char low_r = 'z'; low_r >= 'a'; low_r--) {
			System.out.print(low_r + " ");
		}
	}
}
