import abstracts.GatchaCount;
import abstracts.ShopCount;

// # �߻� Ŭ����
//	- Ŭ���� ���ο� �߻� �޼��带 ���� Ŭ����

// # �߻� �޼���
//	- �Լ� ���¸� �������� 
//	- �ڽ� Ŭ���������������̵� ���� ������ ������ ������ �߻��Ѵ�
//	- �ڽ� Ŭ������ ���� ������ �ش� �޼��尡 100% �����ϴ� ���� �����Ѵ�
//	- �� ĳ���� ���� �� �ڽ� Ŭ�������� ������ �ڵ带 ����ϰ� �ȴ�

public class C06_abstract{
	public static void main(String[] args) {

		GatchaCount gatchas = new GatchaCount();
		String result = gatchas.cal(5540);
		System.out.println(result);
		
//		ShopCount shops = new ShopCount();
//		String result2 = shops.cal(1540);
//		System.out.println(result2);
	}


}

// abstract Ŭ������ �װ��� ��ӹ޴� Ŭ������ �����غ�����
// (abstract�޼��尡 �ݵ�� �����ؾ���)
