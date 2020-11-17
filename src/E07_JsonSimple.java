import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class E07_JsonSimple {

	// google 'maven repo' �˻� -> �ڹ� ���̺귯������ ���ִ� ����Ʈ
	
	// �ܺ� ���̺귯�� �߰� ��� (��Ŭ����)
	// Build Path -> Configure BuildPath -> Lib Tab -> Add External JARs
	
	public static void main(String[] args) {
		
		// mapó�� �����͸� �߰��Ѵ�
		JSONObject obj = new JSONObject();
		
		// JSON �迭�� ����� ���ؼ��� ArrayList�� ����ؾ��Ѵ�
		ArrayList<String> arr = new ArrayList<>();
		
		arr.add("Programming");
		arr.add("Fishing");
		arr.add("Billiard");
		
		//System.out.println(JSONValue.toJSONString(new String(arr)));
		
		obj.put("car","BMW");
		obj.put("addr","��õ��");
		obj.put("age",27);
		obj.put("hobbies", arr);
		
		// toString�� �����Ǿ� �ִ�
		System.out.println(obj);
		
		String jsonStr = obj.toString();
		
		System.out.println(jsonStr);
		
		JSONParser parser = new JSONParser();
		
		try {
			JSONObject obj2 = (JSONObject)parser.parse(
					new FileReader("D:\\java_io\\data.json") );
			System.out.println(obj2.get("��"));
			System.out.println(obj2.get("Programming"));
			
			// ������ �迭 ������ ����ϱ�
			JSONArray programs = (JSONArray)(obj2.get("programming"));
			
			for (Object program : programs) {
				System.out.println(program);
			}
			
			JSONObject minsu = (JSONObject)obj2.get("�μ�");
			// System.out.println(minsu.get("����"));
			
			// JSON - ������ ������ Map�� ������ �� �ִ� ���ڿ�
			
			
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
