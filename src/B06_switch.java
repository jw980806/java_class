
public class B06_switch {

	public static void main(String[] args) {
		
		// # switch-case��
		//	- ()�� ���� ����� ���� ������ �ڵ带 �����Ѵ�
		//	- if������ �Ϻ��ϰ� ��ü �����ϴ�
		
		int a = 10;
		
		switch(a%2) {
		case 0:
			System.out.println("¦��");
			break;
		case 1:
			System.out.println("Ȧ��");
			break;
		default:
			System.out.println("��ü �����ž� ����");
		}
		
		String word = "apple";
		switch(word.charAt(0)) {
		case 'A': case 'a':
			System.out.println("a�� �����ϴ� �ܾ��Դϴ�");
			break;
		case 'B': case 'b':
			System.out.println("b�� �����ϴ� �ܾ��Դϴ�");
			break;
		case 'C': case 'c':
			System.out.println("c�� �����ϴ� �ܾ��Դϴ�");
			break;
		default:
			System.out.println("���� ���̽��� ��� �ƴմϴ�");
		}
	}
}
