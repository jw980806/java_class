package crypto;

import java.util.Scanner;

public class CryptoMain2 {

	int key;
	static String text;


	public static void main(String[] args) {
		
//		System.out.println("-----------------------------");
//		System.out.println("1. 메세지 설정\n" + "2. 암호문 설정\n" + "3. 키값 설정\n" 
//		+ "4. 암호 알고리즘 선택\n" + "5. 실행\n" + ">");
//		int choice = new Scanner(System.in).nextInt();
//		
//		
//		
//		while(true) {
//			if (choice == 1) {
//				System.out.println("메세지를 입력하세요");
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
