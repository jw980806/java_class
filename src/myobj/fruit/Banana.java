package myobj.fruit;

// 클래스 하나당 파일 하나가 바람직함
public class Banana {

	public int size;
	public int price;
	public int color;
	public int bug=0;
	
	public void neglect(int d) {
		System.out.printf("바나나를 방치한지 %d일이 지났습니다\n",d);
		if (d >= 3)
			this.color += 1;
		else if(d >= 6)
			this.color += 2;
		else
			this.color += 3;
		
		if(color == 1) {
			System.out.println("갈색으로 변했습니다");
			bug++;
		} else if (color == 2) {
			System.out.println("검은색으로 변했습니다");
			bug++;
		} else if (color == 0) {
			System.out.println("샛노란색입니당 맛있어 보이네용");
		}
		
		if (bug == 2)
			System.out.println("초파리가 집을 장악했습니다....;^;");
	}
	
    public void bargaining(int price) {
    	this.price = price;
    	if (price > 2000 && price < 5000) {
    		System.out.println("흥정에 실패했습니다.. 가격이 낮아진 대신 크기가 작아집니다");
    		price -= 1000;
    		size -= 5;
    	}else if(price < 8000) {
    		System.out.println("흥정에 성공했습니다! 가격만 낮아집니당");
    		price -= 3000;
    	} else {
    		System.out.println("가격이 이게 뭐야....안사먹어 퉷");
    	}
    }
}
