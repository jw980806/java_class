package quiz;

public class B09_printAlphabet {

	// �ݺ����� �̿��Ͽ� A���� Z���� �⏋
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
