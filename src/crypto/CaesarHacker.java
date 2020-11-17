package crypto;

import java.util.Scanner;

public class CaesarHacker {

	// 암호문과 charset과 알고리즘이 시저암호 방식임을 알고있다고 가정한 상태로
	// 암호문을 이용하여 평문을 추출해보세요
	
	static char[] charset = ("ABCDEFGHIJKLMNOPQRSTUVWXYZ"
			+ " !@#$<abcdefghijklmnopqrstuvwxyz").toCharArray();
	static String hijacked = "XuBBEpkgEHBtl";
	
	public static void main(String[] args) {
		
		for (int key = 0; key < charset.length; ++key) {
			CaesarCipher cipher = new CaesarCipher(key);
			System.out.println(cipher.decryption(hijacked));
		}
		
	}
	
	
}
