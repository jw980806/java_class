package quiz;

public class B03_charQuiz {

	
	/*
	 	[�˸��� ���ǽ��� ��������]
	 	
	 	1. char�� ���� a�� 'q'�Ǵ� 'Q'�� �� true
	 	2. char�� ���� b�� �����̳� ���� �ƴ� �� true
	 	3. char�� ���� c�� ����('0'~'9')�� �� true
	 	4. char�� ���� d�� ������(�빮�� �Ǵ� �ҹ���)�� �� true
	 	5. char�� ���� e�� �ѱ��϶� true
	 	6. char�� ���� f�� �Ϻ��� �϶� true
	 	
	 */
	
	public static void main(String[] args) {
		
		System.out.println("(1)");
		char a = 'a';
		System.out.println(a == 'q' || a == 'Q');
		
		System.out.println("(2)");
		char b = ' ';
		System.out.println(!(b == ' ' || b == '\t'));
		
		System.out.println("(3)");
		char c = '0';
		System.out.println(c >= 48 && c <= 57);
		
		System.out.println("(4)");
		char d = '��';
		System.out.println((d >= 'a' && d <= 'z') || (d >= 'A' && d <= 'Z'));
		
		//����
		// http://www.hipenpal.com/tool/characters-to-unicode-charts-in-korean.php?unicode=110&nowpage=112
		System.out.println("(5)");
		char e = '��';
		//�ѱ� �ڸ� : 0x1100 ~ 0x11FF , 0xAC00 ~ 0xD7A3
		System.out.println((e >= 12593 && e < 12687)|| (e >= 44032 && e <= 55215)); // ����, ����
		
		System.out.println("(6)");
		char f = '��';
		// �϶󰡳�, ��Ÿī�� : 0x3041 ~ 0x309F , 0x30A0 ~ 0x30FF
		System.out.println(f >= '��' && f <= '��');
		System.out.println(f >= 12353 && f <= 12447); //���󰡳�
		System.out.println(f >= 12449 && f <= 12543 ); //��Ÿī��

	}

}
