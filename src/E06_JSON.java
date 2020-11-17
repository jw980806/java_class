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
	//	- JavaScript에서 사용하는 Map타입 
	//	- 문자열만으로 Map을 간결하게 표현할 수 있어서 인기가 많다
	//	- { Key : Value, Key : Value }의 형태를 가진다

	// # JSON Value에 사용되는 자바스크립트 타입들
	//	- '', "" : String
	//	- 숫자, 소수 : Number
	//	- [] : Array
	//	- {} : JSON

	// # JAVA에는 JSON타입을 지원하지 않기 때문에  
	//	 데이터들을 JSON 형태의 문자열로 만들어줘야 한다 (Parsing, Binding) 

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

		System.out.println("파일쓰기 완료");
	}
	// .json파일에 저장된 데이터를 JAVA맵으로 변환하는 메서드를 만들어보세요 
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
					System.err.println("문자열같음");
					map2.put(key, value.replaceAll("[\"\']", ""));
				} else if (Pattern.matches("\\d+", value)) {
					System.err.println("숫자인듯 싶음");
					map2.put(key, Integer.parseInt(value));
				} else if (Pattern.matches("\\d+[.]\\d+", value)) {
					System.out.println("소수로 판별됨");
					map2.put(key, Double.parseDouble(value));
				} else if (Pattern.matches("\\[.+\\]", value)) {
					System.err.println("배열로 판정됨");
					//map2.put(key, value);
					value = value.replaceAll("[\\[\\]]", "");
					
					String[] items = value.split(",");
					
					Object[] objs = null;
					
					// 배열 내부의 내용이 문자열일때
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
		// 다음 Map에 저장된 데이터를 JSON형태의 문자열로 생성하여 출력해보세요		
		HashMap<String, Object> map = new HashMap<>();		
		map.put("name", "홍길동");
		map.put("age", 15);
		map.put("tel", "010-1234-1234");
		map.put("abc", null);
		map.put("programming", new String[] {"JAVA", "Python", "JS"});
		map.put("lotto", new Integer[] {1, 2, 3, 4, 5, 6});

		// instanceof 연산자를 통해 해당 값의 타입을 구분할 수 있다
		System.out.println(map.get("name") instanceof String);
		System.out.println(map.get("age") instanceof String);
		System.out.println(map.get("age") instanceof Integer);
		System.out.println(map.get("programming") instanceof Object[]);
		/* 올바른 출력 : 		 
		 	{ 
		 		"name" : '홍길동', 
		 		"age" : 15, 
		 		"tel" : '010-1234-1234',
		 		"programming" : ['JAVA', 'Python', 'JS']
		 	}		 		 
		 */

		// 모든 것이 들어갈 수 있는 타입 
		Object a = new int[10];
		Object b = new Object[10];

		// 다시 배열로 사용하기 위해 다운캐스팅 
		System.out.println(((int[]) a)[0]);
		System.out.println(((Object[]) b)[0]);


		mapToJsonFile(map);

		HashMap<String, Object> map2 = new HashMap<>();

		// .json파일에 저장된 데이터를 JAVA맵으로 변환하는 메서드를 만들어보세요 
		jsonFileToMap(map2);
		System.out.println(Arrays.toString((Object[])(map2.get("lotto"))));
	}

	

}











