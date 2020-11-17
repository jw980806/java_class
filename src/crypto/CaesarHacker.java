package crypto;

import java.util.Scanner;

public class CaesarHacker {

	// ��ȣ���� charset�� �˰����� ������ȣ ������� �˰��ִٰ� ������ ���·�
	// ��ȣ���� �̿��Ͽ� ���� �����غ�����
	
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
