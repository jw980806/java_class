package quiz;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class D07_PhoneBook {

	// # HashMap�� �̿��� phone_book�� �����غ�����
	
	// 1. �׷�/ ��ȭ��ȣ / �̸��� �����ؾ��մϴ�
	// 2. �׷��̸��� Ű������ ������ �ش� �׷��� ��ȭ��ȣ ����� ���´�
	// 3. ��ȭ��ȣ ��Ͽ� ��ȭ��ȣ�� Ű�� ������ �̸��� ���´�
	
	
	// # �����ؾ� �� �޼���
	
	// 1. ���ο� �׷��� �߰��ϴ� �޼���
	// 2. �����ϴ� �׷쿡 ���ο� ��ȭ��ȣ�� ����ϴ� �޼���
	// 3. ��ϵ� ��� ��ȭ��ȣ�� �������� ����ϴ� �޼ҵ�
	// 4. �̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ��ȭ��ȣ�� ��µǴ� �޼ҵ�
	// 5. ��ȭ��ȣ�� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ��ȭ��ȣ�� ��µǴ� �޼���
	
	static HashMap<String, HashMap<String, String>> phone_book;
	static HashMap<String, String> group_person;
	
	static {
		phone_book = new HashMap<>();
		phone_book.put("�п�", new HashMap<>());
		
		group_person = phone_book.get("�п�");
		group_person.put("010-1234-1234", "�踻��");
		group_person.put("010-5678-5678", "�踻��");
		group_person.put("010-3234-6534", "�����");
		group_person.put("010-3485-2364", "�̸���");
		group_person.put("010-6347-2379", "�ƿ��Ŷ�");
	}
	
	
	
	public void newGroup(String group, String number, String name) {
		phone_book.put(group, new HashMap<>());
		HashMap<String, String> gruops = phone_book.get(group);
		gruops.put(number, name);
		System.out.println(gruops);
	}
	
	public void newNumber(String choice, String number, String name) {
		//phone_book.containsKey("�п�")
		if (phone_book.containsKey(choice)) {
			group_person.put(number, name);
		} else {
			System.out.println("�ùٸ� �׷���� �Է����ּ���");
		}
	}
	
	public void printNumber() {
		
		
	}

//	// # containsKey
//	System.out.println(map1.containsKey("������ ����"));
//	System.out.println(map1.containsKey("������ ���� "));
//	
//	// # containsValue
//	System.out.println(map1.containsValue("5��"));
	
	public void partOfName(String part) {
//		int count = 0;
//		for (String temp : group_person.values()) {
//			for (int i = 0; i < temp.length(); i++) {
//				if (temp.charAt(i) == part.charAt(i)) {
//					count++;
//				}
//			}
//			if(count == part.length()) {
//				System.out.println(group_person.get(temp)); // ������ value->key �ؾߴ�
//			}
//			
//		}
		
		// Ű������ �����ͼ� ������ ��� �ƴϸ� ���� Ű�� �Ѿ
		
	}
	
	public void partOfNum(String part) {
	}
	
	
	
	
	

	public static void main(String[] args) {

		// �ߺ��Ǵ� Ű���� �����ϱ⿡ Ű������ �̸����ٴ� ��ȭ��ȣ�� ����ϴ� ���� ����
//		gruop_person.put("010-1234-1234", "�踻��");
//		gruop_person.put("010-5678-5678", "�踻��");
//		gruop_person.put("010-3234-6534", "�����");
//		gruop_person.put("010-3485-2364", "�̸���");
//		gruop_person.put("010-6347-2379", "�ƿ��Ŷ�");

		//System.out.println(group_person.get("010-1234-1234"));
		
		
		D07_PhoneBook a = new D07_PhoneBook();
		//a.partOfName("�踻");
		a.newGroup("������", "02-456-1687", "¥���");
		System.out.println(phone_book.get("������"));
		a.partOfName("�ƿ�");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
