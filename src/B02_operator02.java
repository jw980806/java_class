
public class B02_operator02 {

	public static void main(String[] args) {

		// �� ����
		//  - �񱳿����� ����� �׻� ��/����(boolean) Ÿ���̴�.

		int a = 9, b = 11;

		System.out.println("a > b : " + (a > b));
		System.out.println("a < b : " + (a < b));

		// ũ�ų� ���ٿ� �۰ų� ���ٴ� �ݵ�� �ε�ȣ(>,<)�� ���� ���;��Ѵ�. // a =< b (X)
		System.out.println("a >= b : " + (a >= b));
		System.out.println("a <= b : " + (a <= b));

		System.out.println("a == b : " + (a == b)); // ���� �� true
		System.out.println("a != b : " + (a != b)); // �ٸ� �� false
		System.out.println();

		// �� ����
		//  && (and) : �� ���� �� ���� ��� ��� true���� true
		//  || (or)  : �� ���� �� ���� �� �ϳ��� true�̸� true
		//  ! (not)  : true�� false��, false�� true�� �ٲ۴�.
		//System.out.println((a == b) && (a % 3 == 0));
		System.out.println("--- AND ---");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println();
		// �� AND������ ���� �񱳰�  false��� ���� ������ �� �̻� üũ���� �ʴ´�.

		System.out.println("--- OR ---");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println();

		System.out.println("--- NOT --");
		System.out.println(! true);
		System.out.println(! false);
		System.out.println();

		a = 25;
		System.out.println("a�� 5�� ����� �� ��: " + (a % 5 == 0));
		System.out.println("a�� 5�� ����� �ƴ� �� ��: " + !(a % 5 == 0));
		System.out.println();

		boolean hasBrother = true;
		System.out.println("�������� ������ ��: " + hasBrother);
		System.out.println("�������� ������ ��: " + !hasBrother);
		System.out.println();
	}
}
