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
		
		// ����ڰ� �޼����� Ű���� �����ϰ� ���ϴ� ��ȣ �˰�������
		// ��ȣȭ/��ȣȭ �۾��� �� �� �ִ� ���α׷��� ��������
		// 0 = ���� ��ȣ / 1 = transposition��ȣ / 2 = ���� ��ȣ ��ȣȭ / 3 = transposition��ȣ ��ȣȭ
		
		
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
