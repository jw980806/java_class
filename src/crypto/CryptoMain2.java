package crypto;

import java.util.Scanner;

public class CryptoMain2 {

	int key;
	static String text;


	public static void main(String[] args) {
		
//		System.out.println("-----------------------------");
//		System.out.println("1. �޼��� ����\n" + "2. ��ȣ�� ����\n" + "3. Ű�� ����\n" 
//		+ "4. ��ȣ �˰��� ����\n" + "5. ����\n" + ">");
//		int choice = new Scanner(System.in).nextInt();
//		
//		
//		
//		while(true) {
//			if (choice == 1) {
//				System.out.println("�޼����� �Է��ϼ���");
//				String str = new Scanner(System.in).nextLine();
//				text = str;
//			} else if(choice == 2) {
//				
//			}
//		}
		
		String user_input = "Caesar";
		int user_input_key = 8;
		
		Cipher cipher = null;
		
		if (user_input.equals("Caesar")) {
			cipher = new CaesarCipher(user_input_key);
		} else if (user_input.equals("Transposition")) {
			cipher = new dasfsA(user_input_key);
		}
		
		String result = cipher.encryption("ABCDEFG ABCDEFG ABCDEFG ABCDEFG");
		
		System.out.println(result);
		
		
	}
	
}
