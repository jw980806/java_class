import java.util.Arrays;

public class B13_Array {

	// �迭
	//  - ���� Ÿ���� ������ �ѹ��� ������ �����ϴ� ���
	//  - �ε����� Ȱ���� �ش� ��°�� ���� ������ �� �ִ�
	//  - �迭�� �ѹ� ũ�Ⱑ �������� ũ�⸦ ������ �� ����
	//  - �迭�� �ʱ�ȭ�� �ڵ����� �Ǿ��ִ� ( ���� : 0, �Ǽ� : 0.0, boolean : false, ������ : null)
	
	public static void main(String[] args) {
		// ���� 100���� ���� ����� ���
		int[] a = new int[100];
		String[] fruits = new String[10];
		System.out.println(fruits[0]);
		
		a[0] = 10;
		a[1] = 55;
		a[99] = 53; // 100���� ������ٸ� �ε����� 99�� ���� �ִ�
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[99]);
		
		// # �迭�� �����ϴ� ���
		//  1. Ÿ��[] �迭�̸� = new Ÿ��[�迭ũ��];
		//  2. Ÿ��[] �迭�̸� = {��1, ��2, ��3,...};
		//  3. Ÿ��[] �迭�̸� = new Ÿ��[] {��1, ��2, ��3, ..}
		
		String[] colors = {"red", "blue", "green", "yellow"};
		
		System.out.println(colors[0]);
		
		boolean[] testResult = new boolean[] {
				true, false, true, true, true, false
		};   // 1 >0 1 == 0l
		
		// # Arrays.toString(arr) : ���޹��� �Լ��� ���� ���� ���ڿ��� ��ȯ�Ѵ�
		//String  result = Arrays.toString(;);
		System.out.println(java.util.Arrays.toString(colors));
		
		
		// # �迭��  �ݺ��� Ȱ���ϱ�
		System.out.printf ("colors �迭 ���� : " ,colors.length);
		
		for(int index = 0; index < colors.length; ++index) {
			System.out.printf("%d��° ���� : %s\n", index, colors[index]);
		}
		
		// # String�� char�� �迭�� ��ȯ�ϱ�
		String msg = "hello, wolrd!";
		
		char[] msgArr = msg.toCharArray();
				
		for(int i = 0; i < msgArr.length; ++i) {
			System.out.println(msgArr[i]);
		}
		System.out.println();
		
;

	}

}
