package crypto;

public class CryptoMain {
	
	int key;
	private String result;
	String plain_text;

	public CryptoMain(int key) {
		this.key = key;
	}
	
	public String choiceResult(int choice,String text) {
		this.plain_text = text;
		if(choice == 0) {
			CaesarCipher str = new CaesarCipher(key);
			result = str.encryption(text);
		} else if(choice == 1) {
			String str = new dasfsA(key).encryption(text);
			result = str;
			System.out.println(result);
		} else if(choice == 2) {
			CaesarCipher str = new CaesarCipher(key);
			result = str.decryption(text);
		} else if(choice == 3) {
			String str = new dasfsA(key).decryption(text);
			result = str;
			System.out.println(result);
		}
		return result;
	}

	public static void main(String[] args) {
		
		// 사용자가 메세지와 키값을 설정하고 원하는 암호 알고리즘으로
		// 암호화/복호화 작업을 할 수 있는 프로그램을 만들어보세요
		// 0 = 시저 암호 / 1 = transposition암호 / 2 = 시저 암호 복호화 / 3 = transposition암호 복호화
		
		
		CryptoMain text01 = new CryptoMain(8);
		text01.choiceResult(0,"Hello, World!");
		System.out.println();
		text01.choiceResult(1,"Common sense is not so common.");
		System.out.println();
		text01.choiceResult(2,"Pmttwhc$wztld");
		System.out.println();
		text01.choiceResult(3,"Cenoonommstmme oo snnio. s s c");
		
//		String crypto = new dasfsA(8)
//				.encryption("Common sense is not so common.");
//		System.out.println(crypto);
		//text01.encryption("Common sense is not so common.");
		
		
	}
}
