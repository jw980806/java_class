package quiz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class D10_OnlyPhoneNumber {

	// ����ڷκ��� ����ȭ��ȣ�� �Է¹޾ƺ�����
	// ��ȭ��ȣ ���°� �ƴ� ��� ���� �޼����� ����� �ٽ� �Է��ؾ��մϴ�
	
	public static void main(String[] args) {
		
		String phoneNum = "";

		
		while (true) {
			System.out.println("��ȭ��ȣ�� �Է��ϼ���");
			phoneNum = new Scanner(System.in).next();
			if (!Pattern.matches("01[01679]-[\\d]{3,4}-[\\d]{4}", phoneNum)) {
				System.err.println("�ùٸ� ������ �ƴմϴ�");
			} else {
				System.out.println("����� ��ȭ��ȣ : " + phoneNum);
				break;
			}
		}
	}

}
