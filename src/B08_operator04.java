
public class B08_operator04 {

	public static void main(String[] args) {
		
		// # ���Կ���
		//	= : ������ ������ �������� ���� ����
		
		// # ���� ���� ����
		int num = 10;
		System.out.println(num += 5);
		System.out.println(num -= 2);
		System.out.println(num *= 2);
		System.out.println(num /= 4);
		System.out.println(num %= 3);
		
		// # ���� ����
		num = 10;
		
		num++; // num = num+1;
		System.out.println(num);
		++num;
		System.out.println(num);
		num--;
		System.out.println(num);
		--num;
		System.out.println(num);
		
		// # ++�� --�� ��ġ�� ���� ���� ����� �޶����⵵ �Ѵ�
		int a = 3, b = 10;
		int result = a++ * b; // �� �� ������ ++
		int result2 = ++a * b; // ++�ϰ� ���
		System.out.println(result);
		System.out.println(result2);
		System.out.println(a); // �׷��� ���⼭ 4
		
		
	}
}
