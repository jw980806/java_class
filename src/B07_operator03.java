
public class B07_operator03 {

	public static void main(String[] args) {
		
		// # ���� ������ (���� ������)
		//	- ������ if���� ���ٷ� ǥ���� �� �ִ�
		//	- ���� ? ��:�ƴϿ�;
		
		//	ex : �ʿ��� ��� �ٱ��ϰ��� ����ϱ�
		int apple = 31;
		int size = 10;
		int needs = apple % 10 == 0 ? apple / size : apple / size + 1;
		System.out.printf("�ʿ��� ������ ��� %d�� �Դϴ�. \n", needs);
		
		
		// ex : ���ڰ� Ȧ������ ¦������
		String msg = apple % 2 == 0 ? "¦���Դϴ�" : "Ȧ���Դϴ�";
		System.out.printf("���� ����� ������ %s\n", msg);
	}
}
