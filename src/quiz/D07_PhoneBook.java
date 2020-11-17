package quiz;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class D07_PhoneBook {

	// # HashMap을 이용한 phone_book을 구현해보세요
	
	// 1. 그룹/ 전화번호 / 이름을 저장해야합니다
	// 2. 그룹이름을 키값으로 넣으면 해당 그룹의 전화번호 목록이 나온다
	// 3. 전화번호 목록에 전화번호를 키로 넣으면 이름이 나온다
	
	
	// # 구현해야 할 메서드
	
	// 1. 새로운 그룹을 추가하는 메서드
	// 2. 존재하는 그룹에 새로운 전화번호를 등록하는 메서드
	// 3. 등록된 모든 전화번호를 보기좋게 출력하는 메소드
	// 4. 이름의 일부를 입력하면 일치하는 모든 전화번호가 출력되는 메소드
	// 5. 전화번호의 일부를 입력하면 일치하는 모든 전화번호가 출력되는 메서드
	
	static HashMap<String, HashMap<String, String>> phone_book;
	static HashMap<String, String> group_person;
	
	static {
		phone_book = new HashMap<>();
		phone_book.put("학원", new HashMap<>());
		
		group_person = phone_book.get("학원");
		group_person.put("010-1234-1234", "김말숙");
		group_person.put("010-5678-5678", "김말숙");
		group_person.put("010-3234-6534", "나비야");
		group_person.put("010-3485-2364", "이리날");
		group_person.put("010-6347-2379", "아오거라");
	}
	
	
	
	public void newGroup(String group, String number, String name) {
		phone_book.put(group, new HashMap<>());
		HashMap<String, String> gruops = phone_book.get(group);
		gruops.put(number, name);
		System.out.println(gruops);
	}
	
	public void newNumber(String choice, String number, String name) {
		//phone_book.containsKey("학원")
		if (phone_book.containsKey(choice)) {
			group_person.put(number, name);
		} else {
			System.out.println("올바른 그룹명을 입력해주세요");
		}
	}
	
	public void printNumber() {
		
		
	}

//	// # containsKey
//	System.out.println(map1.containsKey("주인의 나이"));
//	System.out.println(map1.containsKey("주인의 나이 "));
//	
//	// # containsValue
//	System.out.println(map1.containsValue("5살"));
	
	public void partOfName(String part) {
//		int count = 0;
//		for (String temp : group_person.values()) {
//			for (int i = 0; i < temp.length(); i++) {
//				if (temp.charAt(i) == part.charAt(i)) {
//					count++;
//				}
//			}
//			if(count == part.length()) {
//				System.out.println(group_person.get(temp)); // 여따가 value->key 해야댐
//			}
//			
//		}
		
		// 키값으로 가져와서 같으면 출력 아니면 다음 키로 넘어감
		
	}
	
	public void partOfNum(String part) {
	}
	
	
	
	
	

	public static void main(String[] args) {

		// 중복되는 키값은 사용못하기에 키값으로 이름보다는 전화번호를 사용하는 것이 좋다
//		gruop_person.put("010-1234-1234", "김말숙");
//		gruop_person.put("010-5678-5678", "김말숙");
//		gruop_person.put("010-3234-6534", "나비야");
//		gruop_person.put("010-3485-2364", "이리날");
//		gruop_person.put("010-6347-2379", "아오거라");

		//System.out.println(group_person.get("010-1234-1234"));
		
		
		D07_PhoneBook a = new D07_PhoneBook();
		//a.partOfName("김말");
		a.newGroup("음식점", "02-456-1687", "짜장면");
		System.out.println(phone_book.get("음식점"));
		a.partOfName("아오");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
