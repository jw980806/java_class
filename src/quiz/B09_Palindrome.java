package quiz;

import java.util.Scanner;

public class B09_Palindrome {

	// ����ڷκ��� �ܾ �ϳ� �Է¹ް�
	// �ش� �ܾ ȸ���̶�� "PALINDROME"�� ���
	// ȸ���� �ƴ϶�� "NOT PALINDROME"�� ����غ�����
	
	// �� ��Ī�� �Ǵ� �ܾ ����
	
	public static void main(String[] args) {
		System.out.println("��� �Է��ϼ��� > ");
		String word = new Scanner(System.in).next();
		//for������ Ǯ�����
		int end = word.length()-1;
		for(int i= 0; i < word.length();i++) {
			if(word.charAt(i) != word.charAt(end)) {
				System.out.println("NOT PALINDROME");
				break;
			}else if (i >= end/2) {
				System.out.println("PALINDROME");
				break;
			}
			else
				end--;
		}
		
		//////////////////////////////////////////////////
		
		boolean palin = true;
		for(int i = 0, len = word.length(); i < len/2; ++i) {
			char ch1 = word.charAt(i);
			char ch2 = word.charAt(len - 1 - i);
			
			if (ch1 != ch2) {
				palin = false;
			}
		}
		if (palin) {
			System.out.println("PALINDROME");
		}
		else {
			System.out.println("NOT PALINDROME");
		}
		
		////////////////////////////////////////////////
		
		StringBuilder strb = new StringBuilder(word);
		String reverse = strb.reverse().toString(); // ���±��� ������ ���ڿ��� ������ �ش�
		
		int half = word.length() /2;
		boolean palin2 = true;
		for(int i = 0; i < half; ++i) {
			if(word.charAt(i) != reverse.charAt(i)) {
				palin2 = false;
				break;
			}
		}
		System.out.println(palin2? "PALINDROME":"NOT PALINDROME");
		
		
		
		
	}
}
