
public class C08_innerClass {

	// 믈래스 내부에 클래스 사용하기
	public static void main(String[] args) {
		AppleBox box = new AppleBox(20);
		
		System.out.println(box.box[0].color);
		
		// 외부에서 다른 클래스의 내부 클래스 사용하기 (거의 안함)
		AppleBox.Apple apple01 = new AppleBox(10).new Apple();
		
		System.out.println(apple01);
	}
}

// # outer class
//	- 접근 제어자에 default와 public만 사용할 수 있다
class AppleBox {
	
	Apple[] box;
	
	
	public AppleBox(int size) {
		box = new Apple[size];
		for (int i = 0; i < box.length; i++) {
			// 같은 클래스 내부의 클래스이기 때문에 this를 생략하고 사용 할 수 있다
			box[i] = this.new Apple();
		}
	}
	
	// # inner class
	//	- 접근제어자를 자유롭게 사용할 수 있다
	//	- AppleBox의 인스턴스가 생기기 전에는 inner class Apple이 존재하지 않는다
	//	- outer class의 필드에 따라 달라지는 클래스를 작성할 수 있다
	
	class Apple {
		String color;
		int size;
	}
}