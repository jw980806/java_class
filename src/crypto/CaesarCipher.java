package crypto;

import java.util.Arrays;

public class CaesarCipher  extends Cipher{

	// # 암호란?
	//	- 비밀 메세지를 주고받기 위한 것 
	//	- 암호화(Encryption) : 평문 (일반 메세지)를 암호문(비밀 메세지)으로 바꾸는 것
	//	- 복호화(Decryption) : 암호문을 평문으로 되돌리는 것
	//	- 키(key)		   : 암호화와 복호화에 사용되는 비밀 값
	
	// # 시저(카이사르) 암호
	//	- 알파벳을 키(key)값만큼 오른쪽으로 이동시키는 암호 방식
	//	- 암호화 : 평문을 키 값만큼 오른쪽으로 이동시킨다
	//	- 복호화 : 암호문을 키 값만큼 왼쪽으로 이동시킨다
	
	public char[] range(){
		//char[] charset = ("ABCDEF").toCharArray();
		
		char alphabet[] = new char[58];

		int big = 25; int small = 57;
		alphabet[26] = ' '; alphabet[27] = '!'; alphabet[28] = '@'; 
		alphabet[29] = '#';alphabet[30] = '$';alphabet[31] = ',';

		for (char i = 'Z'; i >= 'A'; i--) {
			alphabet[big] = i;
			//System.out.println(alphabet[big]);
			big--;
		}
		for (char i = 'z'; i >= 'a'; i--) {
			alphabet[small] = i;
			//System.out.println(alphabet[big]);
			small--;
		}
		return alphabet;
	}
	
	
	int key;
	
	public CaesarCipher(int key) {
		this.key = key % 58;
	}
	
	public String encryption(String plain_text) {
		// 매개변수로 받은 평문을 암호화 하여 리턴하는 함수를 구현해보세요
		char[] alphabet = range();
		
		char[] plainArr = plain_text.toCharArray();
		for (int i = 0; i < plainArr.length; i++) {
			for (int j = 0; j < alphabet.length; j++) {
				if (plainArr[i] == alphabet[j]) {
					int a = j + key;
					if(a >= alphabet.length) {
						a -= alphabet.length;
					}
					plainArr[i] = alphabet[a];
					break;
				}
			}
			System.out.print(plainArr[i]);
		}
		System.out.println();
		
		String result = plainArr.toString();
		return result;
	}
	
	public String decryption(String crypto_text) {
		char[] alphabet = range();

		char[] cryptoArr = crypto_text.toCharArray();
		for (int i = 0; i < cryptoArr.length; i++) {
			for (int j = 0; j < alphabet.length; j++) {
				if (cryptoArr[i] == alphabet[j]) {
					int b = j - key;
					if (b < 0) {
						b += alphabet.length;
					}
					cryptoArr[i] = alphabet[b];
					break;
				}
			}
			System.out.print(cryptoArr[i]);
		}
        System.out.println();
        String result = cryptoArr.toString();
		return result;
		
	}

	public static void main(String[] args) {

		//char[] alphabet = new char[56];
		CaesarCipher text01 = new CaesarCipher(132);
		text01.encryption("Hello, World!");
		text01.decryption("XuBBEpkgEHBtl");
		text01.decryption("Khoorc#Zruog$");
		new CaesarCipher(3).encryption("turn left and fire");

	}



}
