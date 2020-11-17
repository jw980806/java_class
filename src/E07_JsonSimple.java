import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class E07_JsonSimple {

	// google 'maven repo' 검색 -> 자바 라이브러리들이 모여있는 사이트
	
	// 외부 라이브러리 추가 방법 (이클립스)
	// Build Path -> Configure BuildPath -> Lib Tab -> Add External JARs
	
	public static void main(String[] args) {
		
		// map처럼 데이터를 추가한다
		JSONObject obj = new JSONObject();
		
		// JSON 배열을 만들기 위해서는 ArrayList를 사용해야한다
		ArrayList<String> arr = new ArrayList<>();
		
		arr.add("Programming");
		arr.add("Fishing");
		arr.add("Billiard");
		
		//System.out.println(JSONValue.toJSONString(new String(arr)));
		
		obj.put("car","BMW");
		obj.put("addr","금천구");
		obj.put("age",27);
		obj.put("hobbies", arr);
		
		// toString이 구현되어 있다
		System.out.println(obj);
		
		String jsonStr = obj.toString();
		
		System.out.println(jsonStr);
		
		JSONParser parser = new JSONParser();
		
		try {
			JSONObject obj2 = (JSONObject)parser.parse(
					new FileReader("D:\\java_io\\data.json") );
			System.out.println(obj2.get("승"));
			System.out.println(obj2.get("Programming"));
			
			// 내부의 배열 꺼내서 사용하기
			JSONArray programs = (JSONArray)(obj2.get("programming"));
			
			for (Object program : programs) {
				System.out.println(program);
			}
			
			JSONObject minsu = (JSONObject)obj2.get("민수");
			// System.out.println(minsu.get("나이"));
			
			// JSON - 정보만 가지고 Map을 생성할 수 있는 문자열
			
			
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
