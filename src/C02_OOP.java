import java.util.Scanner;

import myobj.fruit.Banana;
import myobj.vehicle.*;

public class C02_OOP {

	// # ��ü���� ���α׷��� (OOP : Object Oriented Programming)
	//	- ���� �����ϴ� ��� �͵��� ������ �Լ��� ǥ���Ϸ��� ���α׷���
	//	- ������ �Լ��� ���к��ϰ� ����ϱ� ���ٴ� ���ǿ� �����ϴ� ��üó�� ���̵��� �Ͽ� �������� �ø��� 
	//	- ��ü : ���� �����ϴ� ��� ������ ���Ѵ�
	//	- �޼��� : ��ü ������ ������ ��ġ�� �Լ�
	
	// ���ǽ� -> �ο� ��(����) , �ִ� �����ο�(���)
	//   ����� ���� ����� ����
	
	// ����� ���� : ũ�� , ��, ��Ȯ ��¥, �絵, ���� Į�θ�
	// ����� �޼��� : �Դ´�(ũ��, Į�θ� ��ȭ), ����(��, �絵 ��ȭ), ������(������ �������� ���� ��Ʈ ���� �ٸ�)
	
	// # Ŭ����
	//	- ��ü�� ���α׷��� ���� ǥ���� �� 
	//	- Ŭ������ ��ü�� ���赵�̴�. (������ ���������� ��ü�� ����)
	//	- Ŭ������ ���� �����ϴ� ���� ��ü�� '�ν��Ͻ�'��� �θ���
	//	- Ŭ������ ������ ���� Ÿ���̴�
	//	  (���� ��� Ŭ������ ����ٸ� ��� Ÿ���� ����� �� �ְ� �ȴ�)
	
	
	// 1. myobj.fruit ��Ű���� Ŭ������ �ϳ� �����ϰ� �ν��Ͻ��� �����غ�����
	
	// 2. vehicle ��Ű���� Ŭ������ �ϳ� �����ϰ� �ν��Ͻ��� �����غ�����
	
	// # �� Ŭ������ ���� 3�� �̻� �޼��� 1�� �̻�
	
	
	public static void main(String[] args) {
		
		// Scanner ���赵�� ��ü(Scanner�� �ν��Ͻ�)�� ����� �� ��ü�� �ּҸ� ���� sc�� ����
		Scanner sc = new Scanner(System.in);
		Apple apple01 = new Apple();
		Apple apple02 = new Apple();
		Apple apple03 = new Apple();
		
		// Ŭ���� Ÿ�� �迭�� ���� ���������� �ν��Ͻ��� �������� �ʾҴ� (�迭�� ��ü�� ������)
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
	
	// # �ν��Ͻ� ����
	//	- ��� �ν��Ͻ����� ���� �ٸ� ���� ������ �ִ� ����
	//	- �ʵ�, ��� ���� ,�ν��Ͻ� ����
	int size;
	int sweet;
	int calorie;
	int damage;
	String color;
	String birthday;
	
	// # �ν��Ͻ� �޼���
	//	- �ν��Ͻ� ������ Ȱ���ϴ� �޼���
	//	- ��� , �޼���
	void eat() {
		System.out.println("\n����� �Ծ����ϴ�!");
		System.out.println(this.sweet + "��ŭ ����� ���������ϴ�");
		this.size -= 1;
		this.calorie -= 10;
		System.out.printf("ũ�� : %d , ���� Į�θ� : %d\n",this.size, this.calorie);
	}
	
	
	
}