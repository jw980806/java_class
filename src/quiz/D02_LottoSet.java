package quiz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class D02_LottoSet {

	// 1���� 45�� ���ڷ� �̷���� �ߺ����� ���� ���� 6���� �̷���� HashSet�� �����غ�����
	
	public static Set<Integer> generate() {
		Random rn = new Random();
		Set<Integer> lotto = new HashSet<>();
		
		int count = 0;
		// set�� �ߺ��� �߰����� �ʱ� ������ �˾Ƽ� ���̰� �þ�� �ʴ´�
		while (lotto.size() < 6) {
			lotto.add(rn.nextInt(45)+1);
			System.out.println(++count + "ȸ �̾ҽ��ϴ�");
		}
		
		
		return lotto;
	}
	
	public static void main(String[] args) {
		
		System.out.println(generate());
		
	}
}
