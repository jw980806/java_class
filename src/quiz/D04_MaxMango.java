package quiz;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import myobj.Student.Student;
import myobj.comp.MangoComparator;
import myobj.comp.StudentComparatorA;
import myobj.fruit.Mango;

public class D04_MaxMango {

	// 칼로리와 당도가 랜덤으로 설정되는 망고 클래스를 하나 생성하고 
	// 100개의 망고 중 가장 칼로리가 높은 망고를 선택하세요
	
	// 만약 칼로리가 같은 경우 더 높은 당도를 가진 인스턴스를 선택
	
	public static void main(String[] args) {
		List<Mango> basket = new LinkedList<>();
		
		for (int i = 0; i < 100; i++) {
			basket.add(new Mango());
		}
		
		
		
		
		
//		Collections.sort(basket, new MangoComparator());
		System.out.println(basket);
//		System.out.println(basket.get(basket.size()-1));
		
		System.out.println(Collections.max(basket, new MangoComparator()));
		
		Mango most_yammy = Collections.max(basket);
		
		System.out.println("가장 맛나는 망고 당도"+most_yammy.dangdo);
		
	}
	
}
