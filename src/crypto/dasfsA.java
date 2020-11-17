package crypto;

public class dasfsA extends Cipher{

	int key;
	public dasfsA(int key) {
		this.key = key;
	}
	
	public String encryption(String plain) {
		StringBuilder[] builders = getBuilders(key);
		
		int len = plain.length();
		for(int i = 0; i < len; i++) {
			builders[i % key].append(plain.charAt(i));
		}
		
		return joinBuilders(builders);
	}
	
	private String joinBuilders(StringBuilder[] builders) {
		StringBuilder result = new StringBuilder();
		
		for (StringBuilder builder : builders) {
			result.append(builder);
		}
		return result.toString();
	}

	private StringBuilder[] getBuilders(int columnSize) {
		StringBuilder[] builders = new StringBuilder[columnSize];
		
		// �߸��� �ҽ�
//		for (StringBuilder builder : builders) {
//			builder = new StringBuilder();
		// �ӽ÷� ���� ���� �ӽú����� ����. -> for���� ������ �����
//		}
		
		for (int i = 0; i < builders.length; i++) {
			builders[i] = new StringBuilder();
		}
		
		return builders;
	}
	
	public String decryption(String crypto) {
		int len = crypto.length();
		int columnSize = len % key > 0? len / key + 1 : len / key;
		int numOfBlanks = key - len % key;
		int numOfFull = key - numOfBlanks;
		
		StringBuilder[] builders = getBuilders(columnSize);
		
		// ������ �ݺ��ɶ����� FullLine�� ��� �÷���ŭ �ε��� ����
		// �ƴѰ�� �÷� -1��ŭ �ε��� ����
		for (int column = 0; column < columnSize; ++column) {
			int crypto_index = column;
			for (int row = 0; row < key; ++row) {
				builders[column].append(crypto.charAt(crypto_index));
				
				if (row < numOfFull) {
					crypto_index += columnSize;
				} else {
					crypto_index += columnSize - 1;
				}
				
				// �̰� ���ϸ� �ڿ� s �ٴµ� ������ ���ڿ�
				// �߰��� index�� ������ �÷��̸鼭 ���ÿ� ������ fullline�� ���
				if (column == columnSize-1 && row == numOfFull-1) {
					break;
				}
				
				if (crypto_index >= len) {
					break;
				}
			}		
		}
		
		return joinBuilders(builders);
	}
	
	
	
	
	public static void main(String[] args) {
		String crypto = new dasfsA(8)
				.encryption("Common sense is not so common.");
		System.out.println(crypto);
		
		String plain = new dasfsA(8)
				.decryption("Cenoonommstmme oo snnio. s s c");
		System.out.println(plain);
	}

}
