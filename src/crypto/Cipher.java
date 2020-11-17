package crypto;


abstract public class Cipher {

	// 자식 클래스들의 형태를 미리 결정한 뒤
	// 자식 클래스들이 메서드를 오버라이드 하여 사용하게 만든다
	abstract public String encryption(String plain);
	
	abstract public String decryption(String crypto);
	
}
