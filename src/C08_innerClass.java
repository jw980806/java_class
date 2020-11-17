
public class C08_innerClass {

	// �ɷ��� ���ο� Ŭ���� ����ϱ�
	public static void main(String[] args) {
		AppleBox box = new AppleBox(20);
		
		System.out.println(box.box[0].color);
		
		// �ܺο��� �ٸ� Ŭ������ ���� Ŭ���� ����ϱ� (���� ����)
		AppleBox.Apple apple01 = new AppleBox(10).new Apple();
		
		System.out.println(apple01);
	}
}

// # outer class
//	- ���� �����ڿ� default�� public�� ����� �� �ִ�
class AppleBox {
	
	Apple[] box;
	
	
	public AppleBox(int size) {
		box = new Apple[size];
		for (int i = 0; i < box.length; i++) {
			// ���� Ŭ���� ������ Ŭ�����̱� ������ this�� �����ϰ� ��� �� �� �ִ�
			box[i] = this.new Apple();
		}
	}
	
	// # inner class
	//	- ���������ڸ� �����Ӱ� ����� �� �ִ�
	//	- AppleBox�� �ν��Ͻ��� ����� ������ inner class Apple�� �������� �ʴ´�
	//	- outer class�� �ʵ忡 ���� �޶����� Ŭ������ �ۼ��� �� �ִ�
	
	class Apple {
		String color;
		int size;
	}
}