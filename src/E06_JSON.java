import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E06_JSON {

	// # JSON
	//	- JavaScript���� ����ϴ� MapŸ�� 
	//	- ���ڿ������� Map�� �����ϰ� ǥ���� �� �־ �αⰡ ����
	//	- { Key : Value, Key : Value }�� ���¸� ������

	// # JSON Value�� ���Ǵ� �ڹٽ�ũ��Ʈ Ÿ�Ե�
	//	- '', "" : String
	//	- ����, �Ҽ� : Number
	//	- [] : Array
	//	- {} : JSON

	// # JAVA���� JSONŸ���� �������� �ʱ� ������  
	//	 �����͵��� JSON ������ ���ڿ��� �������� �Ѵ� (Parsing, Binding) 

	public static void mapToJsonFile(Map<String, Object> map) throws IOException {
		StringBuilder builder = new StringBuilder();

		builder.append("{\n");

		int count = 0;		
		int size = map.size() - 1;

		for (Map.Entry<String, Object> entry : map.entrySet()) {
			String key = entry.getKey();
			Object value = entry.getValue();

			builder.append("\t\"" + key + "\"\t: ");		

			if (value == null) {
				builder.append("null");
			} else if (value instanceof String) {
				builder.append("'" + value + "'");
			} else if (value instanceof Object[]) {

				Object[] arr = (Object[]) value;				

				if (arr.length == 0) {
					builder.append("[]");
				}

				if (arr instanceof String[]) {
					builder.append("[");

					int len = arr.length - 1;

					int lencount = 0;
					for (Object obj : arr) {
						builder.append("'" + obj + "'");

						if (lencount++ == len) {
							builder.append("]");
						} else {
							builder.append(", ");
						}
					}					
				} else {
					builder.append("[");

					int len = arr.length - 1;

					int lencount = 0;
					for (Object obj : arr) {
						builder.append(obj);

						if (lencount++ == len) {
							builder.append("]");
						} else {
							builder.append(", ");
						}
					}	
				}

			} else {
				builder.append(value);
			} 

			if (count++ == size) {
				builder.append("\n}");
			} else {
				builder.append(",\n");
			}
		}

		// System.out.println(builder);

		FileWriter fw = new FileWriter("D:\\java_io\\data.json");

		fw.write(new String(builder));

		fw.close();

		System.out.println("���Ͼ��� �Ϸ�");
	}
	// .json���Ͽ� ����� �����͸� JAVA������ ��ȯ�ϴ� �޼��带 �������� 
	private static void jsonFileToMap(HashMap<String, Object> map2){
		
		
		try {
			
			FileReader fr = new FileReader("D:\\java_io\\data.json");
			StringBuilder builder = new StringBuilder();
			String s = null;
			
			int ch;
			
			while ((ch = fr.read()) != -1) {
				//s += (char)ch;
				builder.append((char)ch);
			}
			fr.close();
			s= new String(builder);
			
			Pattern entry_pattern = Pattern.compile(".+:.+\n");
			
			Matcher matcher = entry_pattern.matcher(s);
			
			while (matcher.find()) {
				String entry = matcher.group().trim();
				//System.out.println("Entry : " + entry);
				
				if(entry.charAt(entry.length() -1) == ',') {
					entry = entry.substring(0, entry.length() -1);
				}
				System.out.println("Entry : " + entry);
				
				String[] split_entry = entry.split(":");
				
				String key = split_entry[0].trim().replaceAll("[\"\']", "");
				String value = split_entry[1].trim();
				
				System.out.println("Key : " + key);
				System.out.println("Value : " + value);
				
				if (value.equals("null")) {
					System.err.println("Null");
					map2.put(key, null);
				} else if (Pattern.matches("[\"\'].+[\"\']", value)) {
					System.err.println("���ڿ�����");
					map2.put(key, value.replaceAll("[\"\']", ""));
				} else if (Pattern.matches("\\d+", value)) {
					System.err.println("�����ε� ����");
					map2.put(key, Integer.parseInt(value));
				} else if (Pattern.matches("\\d+[.]\\d+", value)) {
					System.out.println("�Ҽ��� �Ǻ���");
					map2.put(key, Double.parseDouble(value));
				} else if (Pattern.matches("\\[.+\\]", value)) {
					System.err.println("�迭�� ������");
					//map2.put(key, value);
					value = value.replaceAll("[\\[\\]]", "");
					
					String[] items = value.split(",");
					
					Object[] objs = null;
					
					// �迭 ������ ������ ���ڿ��϶�
					if (Pattern.matches("[\"\'].+[\"\']", items[0])) {
						objs = new String[items.length];

						for (int i = 0; i < items.length; i++) {
							objs[i] = items[i].trim().replaceAll("[\"\']", "");
						}
					} else if (Pattern.matches("\\d+", items[0])) {
						objs = new Integer[items.length];

						for (int i = 0; i < items.length; i++) {
							objs[i] = Integer.parseInt(items[i].trim());
						}
					} else if (Pattern.matches("\\d+\\.\\d+", items[0])) {
						objs = new Double[items.length];

						for (int i = 0; i < items.length; i++) {
							objs[i] = Double.parseDouble(items[i].trim());
						}
				}
					map2.put(key, objs);
			}
				
				System.out.println("===================================");
			}
			
			System.out.println(map2);
			
//			Object[] spl = s.split("\t");
//			Object[] end = null;
//			System.out.println(Arrays.toString(spl));
//			
//			for (Object str : spl) {
//				end = ((String) str).split(":");
//				System.out.print(Arrays.toString(end));
////				if (end[0] != null) {
////					map2.put((String)end[0],end[1]);
////				}
//				
				
//			}
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//for (Object obj : )
		
		
		
	}
	
	public static void main(String[] args) throws IOException {
		// ���� Map�� ����� �����͸� JSON������ ���ڿ��� �����Ͽ� ����غ�����		
		HashMap<String, Object> map = new HashMap<>();		
		map.put("name", "ȫ�浿");
		map.put("age", 15);
		map.put("tel", "010-1234-1234");
		map.put("abc", null);
		map.put("programming", new String[] {"JAVA", "Python", "JS"});
		map.put("lotto", new Integer[] {1, 2, 3, 4, 5, 6});

		// instanceof �����ڸ� ���� �ش� ���� Ÿ���� ������ �� �ִ�
		System.out.println(map.get("name") instanceof String);
		System.out.println(map.get("age") instanceof String);
		System.out.println(map.get("age") instanceof Integer);
		System.out.println(map.get("programming") instanceof Object[]);
		/* �ùٸ� ��� : 		 
		 	{ 
		 		"name" : 'ȫ�浿', 
		 		"age" : 15, 
		 		"tel" : '010-1234-1234',
		 		"programming" : ['JAVA', 'Python', 'JS']
		 	}		 		 
		 */

		// ��� ���� �� �� �ִ� Ÿ�� 
		Object a = new int[10];
		Object b = new Object[10];

		// �ٽ� �迭�� ����ϱ� ���� �ٿ�ĳ���� 
		System.out.println(((int[]) a)[0]);
		System.out.println(((Object[]) b)[0]);


		mapToJsonFile(map);

		HashMap<String, Object> map2 = new HashMap<>();

		// .json���Ͽ� ����� �����͸� JAVA������ ��ȯ�ϴ� �޼��带 �������� 
		jsonFileToMap(map2);
		System.out.println(Arrays.toString((Object[])(map2.get("lotto"))));
	}

	

}











