package quiz;

import java.util.Scanner;

public class B05_CheckWord {

	// ����ڷκ��� �ܾ �ϳ� �Է¹ް� 
	// ù��° �ܾ�� ������ �ܾ ��ġ�ϸ� "OK"�� ���
	// �ƴ϶�� "NOT OK"�� ����غ�����
	
	public static void main(String[] args) {
		
		System.out.println("�ܾ �Է����ּ���");
		String word = new Scanner(System.in).next();
		int end = word.length()-1;
		//System.out.println(end);
		if (word.charAt(0) == word.charAt(end))
			System.out.println("OK");
		else
			System.out.println("NOT OK");

	}

}
