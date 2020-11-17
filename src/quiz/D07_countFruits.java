package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class D07_countFruits {

	private enum Fruit {
		APPLE, BANANA, ORANGE, KIWI
	}
	
	
	
	
	// ���� ����Ʈ�� �̿��� �� ���Ͽ� ������ ������� ������ Map�� ����
	
	static List<Fruit> fruits;
	static Map<Fruit, Integer> map1;
	
	static {
		fruits = new ArrayList<>();
		
		for (int i = 0; i < 50; ++i) {
			fruits.add(Fruit.values()[(int)(Math.random() * 4)]);
		}

		map1 = new HashMap<>();
		
		for (int i = 0; i < 4; i++) {
			map1.put(Fruit.values()[i], Collections.frequency(fruits, Fruit.values()[i]));
		}
		
		
	}

	
	
	
	public static void main(String[] args) {
		System.out.println(fruits);
		System.out.println(map1);
		
		
		
//		for (int i = 0; i < map1.size(); i++) {
//			System.out.printf("%s�� %d�� �ֽ��ϴ�",map1.g);
//		}
	}
}
