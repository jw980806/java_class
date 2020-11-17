package quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
	
	HashMap<String, HashMap<String, String>> phonebook_map;
	
	public PhoneBook() {
		phonebook_map = new HashMap<>();
	}
	
	public boolean addGroup(String groupName) {
		if (phonebook_map.containsKey(groupName)) {
			System.err.println("�̹� �����ϴ� �׷���Դϴ�. [" + groupName + "]");
			return false;
		} else {
			phonebook_map.put(groupName, new HashMap<>());
			System.out.println("���ο� �׷��� �߰��Ǿ����ϴ�");
			return true;
		}
	}
	
	/** ��ȭ��ȣ ��� ������ true */
	public boolean addPhoneNumber(String groupName, String tel, String name) {
		
		if (!phonebook_map.containsKey(groupName)) {
			System.err.println("�������� �ʴ� �׷���Դϴ�. [" + groupName + "]");
			return false;
		}
		
		HashMap<String, String> group = phonebook_map.get(groupName);
		// HashMap<String, className> group -> calssName : Ŭ������ ���� ����� ȸ�� ���� Ʋ�� �������� �ѹ��� ��������� �������� �ְ� 
		
		if(group.containsKey(tel)) {
			System.out.println("�ش� ������ �����Ǿ����ϴ�");
		} else {
			System.out.println("���ο� ��ȣ�� �߰��߽��ϴ�");
		}

		phonebook_map.get(groupName).put(tel, name);
		return true;

	}

	private boolean str_contains(String check, String flag) {
		char[] chk = check.toCharArray();
		char[] fr = flag.toCharArray();
		
		char ch1 = fr[0];
		
		// chk : ��ü ���ڿ�
		// fr : �κ� ���ڿ�
		
		// �κ� ���ڿ��� �� �ձ��ڰ� chk�� �ִ��� ���� �˻�
		// ã���� �ش� �κк��� ��� fr�� ��ġ�ϸ� true
		
		for (int i = 0; i < chk.length; i++) {
			if (chk[i] == ch1) {
				int cnt = 0;
				for (int j = 0; j < fr.length; j++) {
					if (chk[i+j] == fr[j]) {
						++cnt;
					} else {
						break;
					}
				}
				if (cnt == fr.length)
					return true;
			}
		}
		return false;
		
		//return check.contains(flag);
		
	}

	// �̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ��ȭ��ȣ�� ��µǴ� �޼ҵ�

	
	public Set<List<String>> searchByName(String name_flag) {
		
		Set<List<String>> to_return = new HashSet<>();
		
		for (HashMap<String, String> groupMap : phonebook_map.values()) {
			
			for (String phoneNumber : groupMap.keySet()) {
				String name = groupMap.get(phoneNumber);
				
				//name.contains(name_flag);
				
				
				if (str_contains(name, name_flag)) {
					List<String> found = new ArrayList<>();
					found.add(name);
					found.add(phoneNumber);
					
					to_return.add(found);
				}
				
//				for (int i = 0; i < name.length(); i++) {
//					for (int j = 0; j < name_flag.length(); j++) {
//						
//					}
//				}
			}
		}
		
		return to_return;
	}
	
	// ��ȭ��ȣ�� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ��ȭ��ȣ�� ��µǴ� �޼���
	public Set<List<String>> searchByPhoneNumber(String phone_grag) {
		
		
		
		
		
		return null;
	}
	
	
	
	public static void main(String[] args) {

		PhoneBook a = new PhoneBook();
		
		
//		boolean result = a.str_contains("010-1234-1234", "1234");
//		System.out.println(result);
		
		a.addGroup("�б�");
//		a.addGroup("�б�");
//		a.addGroup("�п�");
//		
		a.addPhoneNumber("�б�", "02-123-1532", "��浿");
		a.addPhoneNumber("�б�", "02-123-1532", "ȫ�浿");
		a.addPhoneNumber("�б�", "02-642-7521", "�ӱ浿");
		a.addPhoneNumber("�б�", "02-853-1538", "�ֱ浿");
		a.addPhoneNumber("�б�", "02-964-4732", "��浿");
//		a.addPhoneNumber("�п�", "02-9765-3627", "������");
//		
//		System.out.println(a.phonebook_map);
		System.out.println(a.searchByName("��"));
		
	}
}
