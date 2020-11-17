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
			System.err.println("이미 존재하는 그룹명입니다. [" + groupName + "]");
			return false;
		} else {
			phonebook_map.put(groupName, new HashMap<>());
			System.out.println("새로운 그룹이 추가되었습니다");
			return true;
		}
	}
	
	/** 전화번호 등록 성공시 true */
	public boolean addPhoneNumber(String groupName, String tel, String name) {
		
		if (!phonebook_map.containsKey(groupName)) {
			System.err.println("존재하지 않는 그룹명입니다. [" + groupName + "]");
			return false;
		}
		
		HashMap<String, String> group = phonebook_map.get(groupName);
		// HashMap<String, className> group -> calssName : 클래스를 새로 만들어 회원 정보 틀을 만들어놓고서 한번에 가져오고거 가져갈수 있게 
		
		if(group.containsKey(tel)) {
			System.out.println("해당 정보가 수정되었습니다");
		} else {
			System.out.println("새로운 번호를 추가했습니다");
		}

		phonebook_map.get(groupName).put(tel, name);
		return true;

	}

	private boolean str_contains(String check, String flag) {
		char[] chk = check.toCharArray();
		char[] fr = flag.toCharArray();
		
		char ch1 = fr[0];
		
		// chk : 전체 문자열
		// fr : 부분 문자열
		
		// 부분 문자열의 맨 앞글자가 chk에 있는지 먼저 검사
		// 찾으면 해당 부분부터 모든 fr이 일치하면 true
		
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

	// 이름의 일부를 입력하면 일치하는 모든 전화번호가 출력되는 메소드

	
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
	
	// 전화번호의 일부를 입력하면 일치하는 모든 전화번호가 출력되는 메서드
	public Set<List<String>> searchByPhoneNumber(String phone_grag) {
		
		
		
		
		
		return null;
	}
	
	
	
	public static void main(String[] args) {

		PhoneBook a = new PhoneBook();
		
		
//		boolean result = a.str_contains("010-1234-1234", "1234");
//		System.out.println(result);
		
		a.addGroup("학교");
//		a.addGroup("학교");
//		a.addGroup("학원");
//		
		a.addPhoneNumber("학교", "02-123-1532", "김길동");
		a.addPhoneNumber("학교", "02-123-1532", "홍길동");
		a.addPhoneNumber("학교", "02-642-7521", "임길동");
		a.addPhoneNumber("학교", "02-853-1538", "최길동");
		a.addPhoneNumber("학교", "02-964-4732", "고길동");
//		a.addPhoneNumber("학원", "02-9765-3627", "유현석");
//		
//		System.out.println(a.phonebook_map);
		System.out.println(a.searchByName("동"));
		
	}
}
