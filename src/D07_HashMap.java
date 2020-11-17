import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class D07_HashMap {
	// # Map
	//	- Key/Value�� �� ��Ʈ�� �̷�� �ڷᱸ��
	//	- Key���� ���� Value�� ã�� ����
	//	- Key�� �ߺ��� ������� �ʴ´�
	
	public static void main(String[] args) {
		// Map�� Key/Value ���� �̷�� ������ ���׸��� �� �� �޴´�
		Map<String, String> map1 = new HashMap<>();
		
		// put�޼��带 �̿��� �����͸� �����Ѵ�
		//	- Key�� �ش� �������� ī�װ� (�Ӽ�, property, attribute)�� �ǹ��Ѵ�
		//	- Value�� �ش� �׸��� ���� �����Ѵ�
		map1.put("�̸�", "������");
		map1.put("����", "5��");
		map1.put("������ ����", "5��");
		map1.put("����", "���޶�Ͼ�");
		map1.put("����", "��ũ���׸���"); // ���� Ű�� �̿��ϸ� ���� �����Ѵ�
		
		
		// # get�޼��忡 Key���� ������ ���ϴ� �׸��� ���� ������
		System.out.println(map1.get("����"));
		
		// # �ݺ������� MapȰ���ϱ�
		//	- keySet : Key��� �̷���� Set�� ��ȯ�Ѵ�
		//	- values : Value��� �̷���� Collection�� ��ȯ�Ѵ�
		//	- entrySet
		
		System.out.println("map1's Keys : " + map1.keySet());
		System.out.println("map1's Values : " + map1.values());
		System.out.println("map1's Entrys : " + map1.entrySet());
		
		
		// # KeySet���� ������
		for (String key : map1.keySet()) {
			System.out.println(key + " - " + map1.get(key));
		}
		
		// # values�� ������
		//	- values�� Key�� ã�°��� �Ұ���, �ݴ�� ����,
		for (String value : map1.values()) {
			System.out.println(value);
		}
		
		// # entrySet���� ������
		for (Entry<String, String> entry : map1.entrySet()) {
			System.out.println(entry.getKey() + " / " + entry.getValue());
		}
		
		// Map<Integer, String> -> �迭�̶� �Ȱ��⿡ �� ����
		HashMap<String, String> map2 = new HashMap<>();
		map2.put("TEST1", "ABCD");
		map2.put("TEST2", "EFGH");
		map2.put("TEST3", "IJKL");
		
		
		// # containsKey
		System.out.println(map1.containsKey("������ ����"));
		System.out.println(map1.containsKey("������ ���� "));
		
		// # containsValue
		System.out.println(map1.containsValue("5��"));
		
		// # putAll�� �ٸ� Map�� �����͸� �߰��� �� �ִ�
		map1.putAll(map2);
		System.out.println(map1);
		
		// # remove�޼���� ���ϴ� �����͸� ���� �� �ִ�
		//	- Key�� ������ ����� ��� : ��� ������ ���� ��ȯ�Ѵ�
		//	- Key�� Value ��θ� ������ ����� ��� : ��Ȯ�ϰ� ���� ��ġ�� �� �����Ѵ�
		System.out.println(map1.remove("����", "6��"));
		System.out.println(map1);
		System.out.println(map1.remove("����", "5��"));
		System.out.println(map1);
		
		
		// # get�޼��带 ����ϴٰ� ������ Ȥ�� Ű�� ���� ��� null�� ��ȯ�Ǿ� 
		//	 NullPointerException�� �߻��� ������ �ִ�
		
		// # getOrDefault�޼��带 �̿��� null���� ��ȯ�Ǵ� ��Ȳ�̶�� �⺻���� ��ȯ���� �� �ִ�
		System.out.println(map1.getOrDefault("������ �̸�", "�⺻��").charAt(0));
		System.out.println(map1.get("������ ����"));
		
		
		// # MapŸ�� ���ο� MapŸ�� �ޱ�
		HashMap<String, HashMap<String, String>> phone_book = new HashMap<>();
		
		phone_book.put("�п�", new HashMap<>());
		
		HashMap<String, String> gruop_map = phone_book.get("�п�");
		
		// �ߺ��Ǵ� Ű���� �����ϱ⿡ Ű������ �̸����ٴ� ��ȭ��ȣ�� ����ϴ� ���� ����
		gruop_map.put("010-1234-1234", "�踻��");
		gruop_map.put("010-5678-5678", "�踻��");
		
		System.out.println(phone_book);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
