
public class C04_static {
	
	// # static (정적 영역, 클래스 영역)
	//	- 같은 클래스의 모든 인스턴스가 공동으로 사용하는 영역이다.
	//	- static 영역은 클래스 당 하나이기 때문에 클래스 이름에 .을 찍고 사용하는 것을 권장
	//    (.을 찍어도 어차피 다 같은 값을  보기 때문에)
	//	- static 영역의 변수/ 메서드는 인스턴스가 생기기전에도 호출할 수 있다
	// 인스턴스가 존재하지 않을 때도 static이 사용될 가능성이 있기 때문에
	// static 메서드에서는 instance자원을 사용할 수 없다 (반대는 가능)
	
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
	
	// 각 카드마다 다른 값을 가지고 있어야하는 변수 (인스턴스)
	String shape;
	int number;
	
	// 카드의 크기는 모든 카드에서 반드시 같아야한다
	// -> 인스턴스 영역을 사용하면 공간이 아까웡 -> 정적 영역을 사용!
	static int width;
	static int height;
	
	// 생성자 대신 static block에서 초기화를 진행하는 것이 좋다
	static {
		width = 100;
		height = 200;
		System.out.println("static block called");
	}
	
	// instance block
	{
		System.out.println("instance block called");
	}
	
	// myobj 패키지 내부에 static 변수와 메서드를 가진 클래스를 하나 설게해보세요
	// 원산지 지역코드 금지, 가로세로 금지
	
	
	public Card(String shape, int number) {
		this.shape = shape;
		this.number = number;
		System.out.println("constructor called");
		// 생성자에서 static을 초기화 하는 경우
		// 초기화 되기 전의 필드를 사용할 위험이 있다!
		//width = 100;
		//height = 200;
	}
	
	// static method : static 변수만 활용할 수 있는 메서드
	//	- 매개변수만 사용하거나 static 변수만 사용 가능
	//	- 인스턴스와 무관하게  항상 일정한 기능을 구현할 때 사용한다
	public static void changeCardSize(int width, int height) {
	    // static 메서드에서는 this가 존재하지 않는다
		// (아직 인스턴스가 생성되지 않았으므로)
		Card.width = width;
		Card.height = height;
	}
	
	public static int[] getCardSize() {
		return new int[] {width, height};
	}
	
	
	
	
}





