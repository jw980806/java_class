package crypto;

;

public class TranspositionCipher {

	// # ��ġ��ȣ
	//	- �޼����� key�� ��ŭ�� ���̷� ���� �� �ٸ� �������� �о ��ȣȭ �ϴ� ���

	// ex>

	// plain : Common sense is not so common.
	// key   : 8

	// 0 1 2 3 4 5 6 7
	//------------------
	// C o m m o n   s
	// e n s e   i s  
	// n o t   s o   c
	// o m m o n .

	// crypto : Cenoonommstmme oo snnio. s s c

	int key;

	public TranspositionCipher(int key) {
		this.key = key;
	}

	public String encryption(String plain_text) {
		char[] text = plain_text.toCharArray();

		int range = text.length / key + 1;
		char[][] trans = new char[range][key];
		String[] colSum = new String[key];

		int a = 0;
		for (int i = 0; i < range; i++) {
			
			for (int j = 0; j < key; j++) {
				//System.out.println("?");
				if (a >= text.length) {
					trans[i][j] = 0;
					break;
				}else {
					trans[i][j] = text[a];
				}
				System.out.print(trans[i][j]);
				a++;
				
				if (a % key == 0 && j != 0) {
					System.out.println();
					continue;
				}

			}
		}
		System.out.println("\n");
		
		for(int i = 0; i < key; i++) {
			colSum[i] = "";
			for(int j = 0; j < range; ++j) {
				colSum[i] += trans[j][i];
			}
			System.out.print(colSum[i]);
		}
		
		String result = colSum.toString();
		return result;
	}
	
	// ��������
	public String decryption(String crypto_text) {
		char[] text = crypto_text.toCharArray();

		int range = text.length / key +1;
		char[][] trans = new char[key][range];
		String[] colSum = new String[key];
		
		

		int a = 0;
		for (int i = 0; i < key; i++) {
			for (int j = 0; j < range; j++) {
				if (a >= text.length) {
					trans[i][j] = 0;
					break;
				}else {
					trans[i][j] = text[a];
				}
				System.out.print(trans[i][j]);
				a++;
				
				if (a % range == 0 && j != 0) {
					System.out.println();
					continue;
				}

			}
		}
		System.out.println("\n");
		
		for(int i = 0; i < range; i++) {
			colSum[i] = "";
			for(int j = 0; j < key; ++j) {
				colSum[i] += trans[j][i];
			}
			System.out.print(colSum[i]);
		}
		
		String result = colSum.toString();
		return result;
	}

	public static void main(String[] args) {

		TranspositionCipher text01 = new TranspositionCipher(8);
		text01.encryption("Common sense is not so common.");
		System.out.println();
		System.out.println();
		text01.decryption("Cimosom nmn.oo nt    ss eo n  sc eo  m ");
	}


}
