
public class B00_operator01 {

	// ������ (operator)
	//  - ����(���) �� �� ���� ��
	//  - +, -, *, / ��

	public static void main(String[] args) {

		// ��� ������
		int a = 8, b =5;
		double c = 5.0;

		// ������ �켱������ �˰� �ִ���� ����ȴ�. (���ϱ�, ������� ���� ����)
		System.out.println("a + b : "+ (a + b));
		System.out.println("a - b : "+ (a - b));
		System.out.println("a * b : "+ a * b);

		// ���������� ������� �� ���´�. 
		System.out.println("a / b : "+ a / b);

		// ������ �Ǽ��� ������� ��Ȯ�� ����� �Ѵ�.
		System.out.println("a / c : "+a/c);

		// % : ������ ����
		System.out.println("a % b : "+ a % b);

		// Math.pow() : ���� �Լ�
		System.out.println("a�� b�� : "+Math.pow(a, b));
		// Math.sqrt() : ������
		System.out.println(Math.sqrt(2));
		//Math.abs() : ���밪
		System.out.println(Math.abs(-20));
		//Math.round() : �ݿø�
		System.out.println(Math.round(1.234));

		// ^ : ������ �ƴϴ�.(��Ʈ���� XOR)
		System.out.println("a ^ b : "+( a ^ b ));
	}
}
