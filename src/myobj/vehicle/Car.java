package myobj.vehicle;

public class Car {

	int size;
	String oil_kind;
	int oil_L;
	
	void drive(int h) {
		System.out.println("운전 한지 %d시간이 경과했습니다");
		this.oil_L -= h * 50;
		System.out.println("기름이 %dL남았습니다!");
		if (oil_L < 50) {
			System.out.println("기름이 없습니다! 주우소를 경유하세요!");
		}
	}
	
	void size(int size) {
		this.size = size;
		if (size < 3) {
			System.out.println("소형차");
		} else if(size < 6) {
			System.out.println("중형차");
		} else {
			System.out.println("대형차");
		}
	}
	
}
