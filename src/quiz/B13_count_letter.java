package quiz;

public class B13_count_letter {

	// ����ڷκ��� ������ �ϳ� �Է¹޾Ҵ� ġ��
	// �ش� ���忡 � ���ĺ��� ��� �����ߴµ� ��� ����غ�����
	// ��ҹ��� ����x
	
	public static void main(String[] args) {

		String msg = "The Quick Brown Fox Jumps Over a Lazy Dog";
		
		// ���� Ǭ��
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
//			System.out.printf("%s %d��\n",ch1,count);
//			count = 0;
//		}
		
		////////////////////////////////////////////////////////////�����
		
		msg = msg.toUpperCase();
		
		int[] count = new int[26];
		
		for(int i = 0; i < msg.length(); ++i) {
			
			char ch = msg.charAt(i);
			
			if(ch >= 'A' && ch <= 'Z')
				count[ch - 'A'] += 1;
			
		}
		
		for(int i = 0; i < 26; ++i) {
			if(count[i] > 0) {
				System.out.printf("%c�� ������ Ƚ���� %d���Դϴ�.\n", i +'a' ,count[i]);
			}
		}
		

	}

}
