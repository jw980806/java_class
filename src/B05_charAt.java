import java.util.Scanner;

public class B05_charAt {

	public static void main(String[] args) {
		System.out.println("�ǰ��ؼ� ��� ^��^");
		
		// # "���ڿ�".charAt(index)
		//	- ���ڿ����� ���ϴ� ��°�� ���ڸ� ������ �Լ�
		//	- �� �Լ��� ���� ����� charŸ���̴� (��ȯŸ���� charŸ���̴�)
		//	- ù��° ���ڰ� 0�� ���ڴ�
		
		// Math.round() - ��ȯ Ÿ��
		
		// # "���ڿ�".length()
		//	- ���ڿ��� �� ���ڷ� �̷���� �ִ����� �˷��ش�
		//	- ��ȯŸ�� int
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ƹ��ų� �Է��غ����� > ");
		String word = sc.next();
		//String word2 = sc.nextLine();
		
		char a = word.charAt(0);
		System.out.println(a);
		System.out.println(word.charAt(1));
		//System.out.println(word2);
	}
}
