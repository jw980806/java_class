package quiz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class D02_LottoSet {

	// 1부터 45의 숫자로 이루어진 중복없는 랜덤 숫자 6개로 이루어진 HashSet을 생성해보세요
	
	public static Set<Integer> generate() {
		Random rn = new Random();
		Set<Integer> lotto = new HashSet<>();
		
		int count = 0;
		// set은 중복값 추가하지 않기 때문에 알아서 길이가 늘어나지 않는다
		while (lotto.size() < 6) {
			lotto.add(rn.nextInt(45)+1);
			System.out.println(++count + "회 뽑았습니당");
		}
		
		
		return lotto;
	}
	
	public static void main(String[] args) {
		
		System.out.println(generate());
		
	}
}
