
public class B08_operator04 {

	public static void main(String[] args) {
		
		// # 대입연산
		//	= : 왼쪽의 변수에 오른쪽의 값을 대입
		
		// # 복합 대입 연산
		int num = 10;
		System.out.println(num += 5);
		System.out.println(num -= 2);
		System.out.println(num *= 2);
		System.out.println(num /= 4);
		System.out.println(num %= 3);
		
		// # 단항 연산
		num = 10;
		
		num++; // num = num+1;
		System.out.println(num);
		++num;
		System.out.println(num);
		num--;
		System.out.println(num);
		--num;
		System.out.println(num);
		
		// # ++과 --의 위치에 따라 실행 결과가 달라지기도 한다
		int a = 3, b = 10;
		int result = a++ * b; // 이 줄 끝나고 ++
		int result2 = ++a * b; // ++하고 계산
		System.out.println(result);
		System.out.println(result2);
		System.out.println(a); // 그래서 여기서 4
		
		
	}
}
