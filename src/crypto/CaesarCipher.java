package crypto;

import java.util.Arrays;

public class CaesarCipher  extends Cipher{

	// # ��ȣ��?
	//	- ��� �޼����� �ְ�ޱ� ���� �� 
	//	- ��ȣȭ(Encryption) : �� (�Ϲ� �޼���)�� ��ȣ��(��� �޼���)���� �ٲٴ� ��
	//	- ��ȣȭ(Decryption) : ��ȣ���� ������ �ǵ����� ��
	//	- Ű(key)		   : ��ȣȭ�� ��ȣȭ�� ���Ǵ� ��� ��
	
	// # ����(ī�̻縣) ��ȣ
	//	- ���ĺ��� Ű(key)����ŭ ���������� �̵���Ű�� ��ȣ ���
	//	- ��ȣȭ : ���� Ű ����ŭ ���������� �̵���Ų��
	//	- ��ȣȭ : ��ȣ���� Ű ����ŭ �������� �̵���Ų��
	
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
		// �Ű������� ���� ���� ��ȣȭ �Ͽ� �����ϴ� �Լ��� �����غ�����
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
