package abstracts;

public class GatchaCount extends Count {

	int price;
	int gatcha;
	String Confirmation = "";
	
	@Override
	public String cal(int meari) {
		// 310m -> 5900won / 96m -> 1gatcha
		price = (meari / 310 + 1) * 5900;
		gatcha = meari / 96;
		
		if(gatcha >= 55) {
			Confirmation = "Puple Skin get!";
		} else if (gatcha >= 100) {
			Confirmation = "Gold Skin get!!!";
		}else {
			Confirmation = "You don't get anything...";
		}
			
		String result = "메아리 가격 : "+price+"\n가능한 가챠 횟수 : "+gatcha+"\n결과 : "+Confirmation;
		
		return result;
	}

}
