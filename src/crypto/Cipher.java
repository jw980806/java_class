package crypto;


abstract public class Cipher {

	// �ڽ� Ŭ�������� ���¸� �̸� ������ ��
	// �ڽ� Ŭ�������� �޼��带 �������̵� �Ͽ� ����ϰ� �����
	abstract public String encryption(String plain);
	
	abstract public String decryption(String crypto);
	
}
