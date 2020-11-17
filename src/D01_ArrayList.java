import java.util.ArrayList;
import java.util.Collections;

public class D01_ArrayList {
	// # Java Collections
	//	- �ڹٿ��� �⺻������ �����ϴ� �ڷᱸ�� �������̽�
	//	- Collections �������̽��� �����ϴ� Ŭ�����δ� List, Set�� �ִ�

	// # java.util.ArrayList
	//	- �迭�� �ٸ��� ũ�Ⱑ �ڵ����� �����Ǵ� �ڷᱸ�� Ŭ����
	//	- �迭�� ������ �����̱� ������ ���������� �����Ϳ� ������ �� ���� �����ϴ�
	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		list.add("ȫ�浿");
		list.add("����ġ");
		list.add("�Ӳ���");
		list.add("�����");

		System.out.println(list);

		// add(index, item) : ���ϴ� ��ġ�� �����͸� �ִ´� (���� �����Ͱ� ��ĭ�� �и�)
		list.add(2, "�̼���");
		list.add(0, 1234);
		list.add(0, new Apple());

		System.out.println(list);

		// ArrayList�� get(index) : �迭ó�� �ε����� �����͸� ���� �� �ִ�
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));

		// ArrayList�� Ÿ���� ���������� ������
		// ��� Ÿ���� �� �� �ִ� ArrayList�� �ȴ�

		// ��� Ÿ���� ����ֱ� ������ ���� �� � Ÿ������ ������ �˱� ���������
		// �� ObjectŸ�� : ��� Ÿ���� �θ�
		Object thing = list.get(2);
		System.out.println(thing);

		// # Ÿ���� ������ ArrayList �����ϱ�
		//	- Ÿ���� �����Ҷ� ����ϴ� <>�� ���׸��̶�� �θ���
		ArrayList<String> fn_list = new ArrayList<>();

		// <>�� Ÿ���� �������ָ� ArrayList�� ��� �޼��� Ÿ���� �ٲ��
		fn_list.add("apple");
		fn_list.add("strawberry");

		System.out.println(fn_list);
		System.out.println(fn_list.get(0));

		// size() : ����Ʈ�� ũ�⸦ ��ȯ
		System.out.println(list.size());
		System.out.println(fn_list.size());

		// remove(index) : ���ϴ� ��ġ�� ������(���, element) �� ����
		//				   (�����ϸ鼭 ������ �������� ��ȯ)
		// remove(item) : ���ϴ� ���� ��� ����

		System.out.println("������ ������ ��ȯ : " + list.remove(2));

		fn_list.add(0,"apple");
		fn_list.add("apple");
		fn_list.add("apple");
		fn_list.add("apple");

		System.out.println(fn_list);

		System.out.println("������ ���� �� ��ȯ�Ǵ� �� : "
				+ fn_list.remove("apple"));
		System.out.println(fn_list);

		int count = 0;
		while(fn_list.remove("apple")) {
			System.out.println("����� �����Ǿ����ϴ�." + ++count);
		}
		System.out.println("������ ��� �������ϴ�." + fn_list);

		System.out.println("- - - - �ݺ��� ���� - - - - ");
		// # ArrayList�� �ݺ����� �Բ� ����ϸ� ���� ���ϴ�
		for(int i = 0, size = list.size(); i < size; i++) {
			System.out.println(list.get(i));
		}
		System.out.println("- - - - �ݺ��� �� - - - - ");

		// # ����Ʈ�� forEach�� ����� �� �ִ�
		for(String fn : fn_list) {
			System.out.println("fruit name : " + fn);
		}

		// # ArrayList + ������
		ArrayList<Person> plist = new ArrayList<>();

		plist.add(new Dentist());
		plist.add(new Doctor());
		plist.add(new Police());

		for(Person p : plist) {
			p.sayHi();
		}

		// # �÷����� Collections�� ��ɵ��� ����� �� �ִ�

		// �ѹ��� ���� �߰��ϱ�
		Collections.addAll(fn_list, "apple","apple","apple",
				"apple","apple","apple","apple","apple","apple");

		System.out.println(fn_list);

		//�÷��ǿ��� ����Ƚ�� ���ϱ�
		System.out.println("apple�� ����Ƚ�� : " + Collections.frequency(fn_list, "apple"));

		// �÷��� �ִ�/�ּҰ� ���ϱ�
		System.out.println(Collections.max(fn_list));
		System.out.println(Collections.min(fn_list));

		// ������� ���� - sort(Collection)
		Collections.sort(fn_list);
		System.out.println(fn_list);

		// �Ųٷ� ���� - reverse(Collection)
		Collections.reverse(fn_list);
		System.out.println(fn_list);

		// �� ����� ��ġ�� ��ü - swap (Collection, i, j )
		Collections.swap(fn_list, 0, fn_list.size() - 1);
		System.out.println(fn_list);

		// nĭ�� ��� ��Ҹ� ��ȯ��Ų��
		for(int i = 0; i < 5; i++) {
			Collections.rotate(fn_list, -1);
			System.out.println("rotate" + i + " :" + fn_list);
		}

		// �������� ��� ��Ҹ� �ڼ��´�
		Collections.shuffle(fn_list);
		System.out.println("suffled : " + fn_list);

		// ���ϴ� ������ �÷��� �ʱ�ȭ
		Collections.fill(fn_list, "banana");
		System.out.println(fn_list);
	}

}
