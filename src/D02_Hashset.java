import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D02_Hashset {

	// # Set
	//	- ������ �����س��� Ŭ����
	//	- ���ȣ ���� ���� ������ ���� ������� �ʴ´�
	
	// # Hash
	//	- � ���� �־��� �� ���� ������ �� ���� ���� �����Ǿ���ϴ� �˰���
	//	- ������ �� ���� ���� �̿��ϹǷ� ������ �Ұ����ϴ�
	//	- ������ ������ �������� ã�� ���� �Ұ��ɿ� ������
	//	- �ٽ� ���� ������ ���ư� �� ���� �ܹ��⼺ �˰���
	//	- �ӵ��� ������ ���ȼ��� �پ �˰���
	
	// ��й�ȣ ��
	
	
	public static void main(String[] args) {
		
		HashSet<Integer> even = new HashSet<>();
		
		// Set���� �Ȱ��� �����͸� ������ �� ����.
		even.add(10);
		even.add(20);
		even.add(30);
		even.add(40);
		even.add(50);
		even.add(60);
		
		// Hash�� �̿��ϴ� Ŭ������ ���� �־��� ������� �������� ��������
		System.out.println(even);
		
		// HashSet�� index�� ���� ������ �ϳ��� �������� ����
		for (int i : even) {
			System.out.println("�ϳ��� ������ �ÿ� : " + i);
		}
		
		ArrayList<String> animal_list = new ArrayList<>();
		
		animal_list.add("zibra");
		animal_list.add("zibra");
		animal_list.add("lion");
		animal_list.add("lion");
		animal_list.add("lion");
		animal_list.add("tiger");
		animal_list.add("eagle");
		animal_list.add("eagle");
		
		Collections.shuffle(animal_list);
		System.out.println(animal_list);
		
		
		// # �ٸ� ������ �÷����� Set���� �ս��� ������ �� �ִ�
		// �ߺ��� ���ŵǴ� ȿ���� �ִ�
		Set<String> animal_set = new HashSet<>(animal_list);
		System.out.println(animal_set);
		
		// # �÷����� �迭�� ��ȯ�ϱ�
		Object[] animal_arr = animal_list.toArray();
		
		// String���� ���� �� �ٿ�ĳ������ �ʿ���
		String first_animal = (String) animal_arr[0];
		System.out.println(first_animal);
		
		// # �÷����� �迭�� ��ȯ�ϱ�2
		//	- �̸� ������ �ش� ���׸� �迭�� �����ϴ� ���
		String[] animal_arr2 = new String[animal_set.size()];
		animal_set.toArray(animal_arr2);
		
		first_animal = animal_arr2[0];
		System.out.println(first_animal);
		
		// contains : �÷��ǿ� �ش� ��Ұ� �ִ��� ���θ� ��ȯ
		System.out.println(animal_list.contains("lion"));
		System.out.println(animal_set.contains("lion"));
		
		// size : �÷��� ũ�� ��ȯ
		System.out.println(animal_set.size());
		
		// remove : �÷��� ��� ���� (���� ������ true��ȯ)
		System.out.println(animal_set.remove("lion"));
		
		//# �ٸ� �÷����� �̿��ϴ� �޼����
		Set<Character> alphabet01 = new HashSet<>();
		Set<Character> alphabet02 = new HashSet<>();
		
		Collections.addAll(alphabet01, 'A', 'B', 'C', 'D', 'E');
		Collections.addAll(alphabet02, 'F', 'G', 'H', 'D', 'E');
		
		System.out.println(alphabet01);
		System.out.println(alphabet02);
		
		List<Character> alpha_all = new ArrayList<>();
		
		alpha_all.addAll(alphabet01);
		alpha_all.addAll(alphabet02);
		
		System.out.println(alpha_all);
		
		// 2. removeAll(Collection) : �ٸ� �÷��ǰ� ��ġ�ϴ� ��� ���� �����Ѵ�
		Set<Character> to_remove = new HashSet<>();
		Collections.addAll(to_remove, 'A','D');
		
		alpha_all.removeAll(to_remove);
		System.out.println(alpha_all);
		
		// 3. retainAll(collection) : ������ �÷��ǰ� ��ġ�ϴ� ���� �����Ѵ�
		List<Character> to_retain = new ArrayList<>();
		
		to_retain.add('E');
		to_retain.add('G');
		
		alpha_all.retainAll(to_retain);
		System.out.println(alpha_all);
		
		// 4. containsAll(collection) : ������ �÷����� ��� ��Ұ� ���ԵǾ� �ִ��� Ȯ���Ѵ�
		Collections.addAll(alpha_all, 'A', 'B', 'C', 'D');
		
		Set<Character> must_contain = new HashSet<>();
		
		must_contain.add('A');
		must_contain.add('B');
		must_contain.add('C');
		must_contain.add('D');
		must_contain.add('Z');
		
		System.out.println(alpha_all + "��" + must_contain + "�� ���ԵǾ� �ֳ���?" +alpha_all.containsAll(must_contain));
		
		
	}
}
