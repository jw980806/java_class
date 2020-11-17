
public class C04_static {
	
	// # static (���� ����, Ŭ���� ����)
	//	- ���� Ŭ������ ��� �ν��Ͻ��� �������� ����ϴ� �����̴�.
	//	- static ������ Ŭ���� �� �ϳ��̱� ������ Ŭ���� �̸��� .�� ��� ����ϴ� ���� ����
	//    (.�� �� ������ �� ���� ����  ���� ������)
	//	- static ������ ����/ �޼���� �ν��Ͻ��� ����������� ȣ���� �� �ִ�
	// �ν��Ͻ��� �������� ���� ���� static�� ���� ���ɼ��� �ֱ� ������
	// static �޼��忡���� instance�ڿ��� ����� �� ���� (�ݴ�� ����)
	
	public static void main(String[] args) {
		System.out.println(Card.width);
		System.out.println(Card.height);
		
		Card s1 = new Card("Spade", 1);
		//Card h1 = new Card("Heart", 1);
		
		System.out.println(Card.width);
		System.out.println(Card.height);
	}
}

class Card {
	
	// �� ī�帶�� �ٸ� ���� ������ �־���ϴ� ���� (�ν��Ͻ�)
	String shape;
	int number;
	
	// ī���� ũ��� ��� ī�忡�� �ݵ�� ���ƾ��Ѵ�
	// -> �ν��Ͻ� ������ ����ϸ� ������ �Ʊ�� -> ���� ������ ���!
	static int width;
	static int height;
	
	// ������ ��� static block���� �ʱ�ȭ�� �����ϴ� ���� ����
	static {
		width = 100;
		height = 200;
		System.out.println("static block called");
	}
	
	// instance block
	{
		System.out.println("instance block called");
	}
	
	// myobj ��Ű�� ���ο� static ������ �޼��带 ���� Ŭ������ �ϳ� �����غ�����
	// ������ �����ڵ� ����, ���μ��� ����
	
	
	public Card(String shape, int number) {
		this.shape = shape;
		this.number = number;
		System.out.println("constructor called");
		// �����ڿ��� static�� �ʱ�ȭ �ϴ� ���
		// �ʱ�ȭ �Ǳ� ���� �ʵ带 ����� ������ �ִ�!
		//width = 100;
		//height = 200;
	}
	
	// static method : static ������ Ȱ���� �� �ִ� �޼���
	//	- �Ű������� ����ϰų� static ������ ��� ����
	//	- �ν��Ͻ��� �����ϰ�  �׻� ������ ����� ������ �� ����Ѵ�
	public static void changeCardSize(int width, int height) {
	    // static �޼��忡���� this�� �������� �ʴ´�
		// (���� �ν��Ͻ��� �������� �ʾ����Ƿ�)
		Card.width = width;
		Card.height = height;
	}
	
	public static int[] getCardSize() {
		return new int[] {width, height};
	}
	
	
	
	
}





