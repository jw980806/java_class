package quiz;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import myobj.Student.Student;
import myobj.comp.MangoComparator;
import myobj.comp.StudentComparatorA;
import myobj.fruit.Mango;

public class D04_MaxMango {

	// Į�θ��� �絵�� �������� �����Ǵ� ���� Ŭ������ �ϳ� �����ϰ� 
	// 100���� ���� �� ���� Į�θ��� ���� ���� �����ϼ���
	
	// ���� Į�θ��� ���� ��� �� ���� �絵�� ���� �ν��Ͻ��� ����
	
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
		
		System.out.println("���� ������ ���� �絵"+most_yammy.dangdo);
		
	}
	
}
