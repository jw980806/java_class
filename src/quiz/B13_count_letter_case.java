package quiz;

public class B13_count_letter_case {

	// 사용자로부터 문장을 하나 입력받았다 치고
	// 해당 문장에 어떤 알파벳이 몇번 등장했는디 세어서 출력해보세요
	// 대문자, 소문자, 숫자가 모두 따로 집계됩니당
	
	public static void main(String[] args) {
		String msg = "The Quick Brown 2352 후후하하 banana tasty apple too!";
		
		int[] small = new int[26];
		int[] big = new int[26];
		int[] num = new int[10];
		
		for(int i = 0; i < msg.length(); i++) {
			char ch = msg.charAt(i);

			if(ch >= 'A' && ch <= 'Z') {
				big[ch - 'A'] += 1;
			}else if(ch >= 'a' && ch <= 'z') {
				small[ch - 'a'] += 1;
			}else if(ch >= '0' && ch <= '9') {
				num[ch-'0'] += 1;
			}
		}
		
		for(int i = 0; i < 26; i++) {
			if(small[i] > 0) {
				System.out.printf("%c가 등장한 횟수는 %d번입니다.\n", i +'a' ,small[i]);
			}
			if(big[i] > 0) {
				System.out.printf("%c가 등장한 횟수는 %d번입니다.\n", i +'A' ,big[i]);
			}
		}
		for(int i = 0; i < 10; i++) {
			if(num[i] > 0) {
				System.out.printf("%c가 등장한 횟수는 %d번입니다.\n", i + '0' ,num[i]);
			}
		}

	}

}
