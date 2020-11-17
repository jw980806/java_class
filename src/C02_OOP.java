import java.util.Scanner;

import myobj.fruit.Banana;
import myobj.vehicle.*;

public class C02_OOP {

	// # 객체지향 프로그래밍 (OOP : Object Oriented Programming)
	//	- 세상에 존재하는 모든 것들을 변수와 함수로 표현하려는 프로그래밍
	//	- 변수와 함수를 무분별하게 사용하기 보다는 현실에 존재하는 객체처럼 보이도록 하여 가독성을 올린다 
	//	- 객체 : 세상에 존재하는 모든 개념을 말한다
	//	- 메서드 : 객체 변수에 영향을 미치는 함수
	
	// 강의실 -> 인원 수(변수) , 최대 수용인원(상수)
	//   사람이 들어옴 사람이 나감
	
	// 사과의 변수 : 크기 , 색, 수확 날짜, 당도, 보유 칼로리
	// 사과의 메서드 : 먹는다(크기, 칼로리 변화), 갈변(색, 당도 변화), 던진다(보유한 데미지에 따라 히트 폭이 다름)
	
	// # 클래스
	//	- 객체를 프로그래밍 언어로 표현한 것 
	//	- 클래스는 객체의 설계도이다. (정의한 시점에서는 실체가 없다)
	//	- 클래스를 통해 생성하는 실제 객체를 '인스턴스'라고 부른다
	//	- 클래스는 참조형 변수 타입이다
	//	  (만약 사과 클래스를 만든다면 사과 타입을 사용할 수 있게 된다)
	
	
	// 1. myobj.fruit 패키지에 클래스를 하나 정의하고 인스턴스를 생성해보세요
	
	// 2. vehicle 패키지에 클래스를 하나 정의하고 인스턴스를 생성해보세용
	
	// # 각 클래스는 변수 3개 이상 메서드 1개 이상
	
	
	public static void main(String[] args) {
		
		// Scanner 설계도로 실체(Scanner의 인스턴스)를 만들어 그 실체의 주소를 변수 sc에 저장
		Scanner sc = new Scanner(System.in);
		Apple apple01 = new Apple();
		Apple apple02 = new Apple();
		Apple apple03 = new Apple();
		
		// 클래스 타입 배열을 만든 시점에서는 인스턴스가 생성되지 않았다 (배열의 실체만 생성됨)
		Apple[] appleBox = new Apple[10];
		for (int i=0; i < appleBox.length; i++) {
			appleBox[i] = new Apple();
		}
		
		apple01.birthday = "2020/10/29";
		apple01.size = 10;
		apple01.calorie = apple01.size * 10;
		apple01.color = "red";
		apple01.sweet = 7;
		apple02.sweet = 10;
		apple03.sweet = 8;
		
		apple01.eat();
		apple02.eat();
		apple03.eat();
		
		Banana banana01 = new Banana();
		banana01.size = 5;
		banana01.color = 0;
		banana01.neglect(4);
		banana01.neglect(1);
		
		banana01.bargaining(5000);

	}

}


class Apple {
	
	// # 인스턴스 변수
	//	- 모든 인스턴스마다 각자 다른 값을 가지고 있는 변수
	//	- 필드, 멤버 변수 ,인스턴스 변수
	int size;
	int sweet;
	int calorie;
	int damage;
	String color;
	String birthday;
	
	// # 인스턴스 메서드
	//	- 인스턴스 변수를 활용하는 메서드
	//	- 기능 , 메서드
	void eat() {
		System.out.println("\n사과를 먹었습니다!");
		System.out.println(this.sweet + "만큼 기분이 좋아졌습니다");
		this.size -= 1;
		this.calorie -= 10;
		System.out.printf("크기 : %d , 보유 칼로리 : %d\n",this.size, this.calorie);
	}
	
	
	
}