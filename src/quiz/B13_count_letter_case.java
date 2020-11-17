package quiz;

public class B13_count_letter_case {

	// ����ڷκ��� ������ �ϳ� �Է¹޾Ҵ� ġ��
	// �ش� ���忡 � ���ĺ��� ��� �����ߴµ� ��� ����غ�����
	// �빮��, �ҹ���, ���ڰ� ��� ���� ����˴ϴ�
	
	public static void main(String[] args) {
		String msg = "The Quick Brown 2352 �������� banana tasty apple too!";
		
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
				System.out.printf("%c�� ������ Ƚ���� %d���Դϴ�.\n", i +'a' ,small[i]);
			}
			if(big[i] > 0) {
				System.out.printf("%c�� ������ Ƚ���� %d���Դϴ�.\n", i +'A' ,big[i]);
			}
		}
		for(int i = 0; i < 10; i++) {
			if(num[i] > 0) {
				System.out.printf("%c�� ������ Ƚ���� %d���Դϴ�.\n", i + '0' ,num[i]);
			}
		}

	}

}
