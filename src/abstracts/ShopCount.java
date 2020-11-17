package abstracts;

public class ShopCount extends Count {
	int priceG;
	int priceP;
	int needMoreG = 2888;
	int needMoreP = 1888;
	
	@Override
	public String cal(int meari) {
		// 60m -> 1200won / pupleSkin -> 1888 / GoldSkin -> 2888
		needMoreG -= meari;
		if (needMoreG % 60 == 0) {
			priceG = needMoreG / 60 * 1200;
		}else {
			priceG = (needMoreG / 60 + 1) * 1200;
		}
		
		needMoreP -= meari;
		if (needMoreP % 60 == 0) {
			priceP = needMoreP / 60 * 1200;
		}else {
			priceP = (needMoreP / 60 + 1) * 1200;
		}
		
		
		String result = "Puple Skin을 위해 필요한 메아리 수 : " + needMoreP +"\n필요한 돈 : " + priceP
				+ "\nGold Skin을 위해 필요한 메아리 수 : " + needMoreG +"\n필요한 돈 : " + priceG;
		
		return result;
	}

}
