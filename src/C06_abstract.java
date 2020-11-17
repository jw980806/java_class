import abstracts.GatchaCount;
import abstracts.ShopCount;

// # 추상 클래스
//	- 클래스 내부에 추상 메서드를 지닌 클래스

// # 추상 메서드
//	- 함수 형태만 만들어놓고 
//	- 자식 클래스에서오버라이드 하지 않으면 컴파일 에러가 발생한다
//	- 자식 클래스에 같은 형태의 해당 메서드가 100% 존재하는 것을 보장한다
//	- 업 캐스팅 했을 때 자식 클래스에서 구현된 코드를 사용하게 된다

public class C06_abstract{
	public static void main(String[] args) {

		GatchaCount gatchas = new GatchaCount();
		String result = gatchas.cal(5540);
		System.out.println(result);
		
//		ShopCount shops = new ShopCount();
//		String result2 = shops.cal(1540);
//		System.out.println(result2);
	}


}

// abstract 클래스와 그것을 상속받는 클래스를 설계해보세요
// (abstract메서드가 반드시 존재해야함)
