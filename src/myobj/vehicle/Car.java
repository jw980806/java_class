package myobj.vehicle;

public class Car {

	int size;
	String oil_kind;
	int oil_L;
	
	void drive(int h) {
		System.out.println("���� ���� %d�ð��� ����߽��ϴ�");
		this.oil_L -= h * 50;
		System.out.println("�⸧�� %dL���ҽ��ϴ�!");
		if (oil_L < 50) {
			System.out.println("�⸧�� �����ϴ�! �ֿ�Ҹ� �����ϼ���!");
		}
	}
	
	void size(int size) {
		this.size = size;
		if (size < 3) {
			System.out.println("������");
		} else if(size < 6) {
			System.out.println("������");
		} else {
			System.out.println("������");
		}
	}
	
}
