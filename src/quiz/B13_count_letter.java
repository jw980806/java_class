package quiz;

public class B13_count_letter {

	// 사용자로부터 문장을 하나 입력받았다 치고
	// 해당 문장에 어떤 알파벳이 몇번 등장했는디 세어서 출력해보세요
	// 대소문자 구분x
	
	public static void main(String[] args) {

		String msg = "The Quick Brown Fox Jumps Over a Lazy Dog";
		
		// 내가 푼거
//		msg = msg.toUpperCase();
//		char[] msgArr = new char[msg.length()];
//		
//		int start = 0;
//		int count= 0;
//		
//		for(int i = start; i < msgArr.length; i++) {
//			char ch1 = msg.charAt(i);
//			for (int j = 0; j < msgArr.length; j++) {
//				char ch2 = msg.charAt(j);
//				if(ch1 >= 'A' && ch1 <= 'Z') {
//					//msgArr[i] = ch;
//					if(ch1 == ch2) {
//						count++;
//						
//					}
//				}
//			}
//			msgArr[i] = (char)(ch1+count);
//			System.out.printf("%s %d개\n",ch1,count);
//			count = 0;
//		}
		
		////////////////////////////////////////////////////////////강사님
		
		msg = msg.toUpperCase();
		
		int[] count = new int[26];
		
		for(int i = 0; i < msg.length(); ++i) {
			
			char ch = msg.charAt(i);
			
			if(ch >= 'A' && ch <= 'Z')
				count[ch - 'A'] += 1;
			
		}
		
		for(int i = 0; i < 26; ++i) {
			if(count[i] > 0) {
				System.out.printf("%c가 등장한 횟수는 %d번입니다.\n", i +'a' ,count[i]);
			}
		}
		

	}

}
