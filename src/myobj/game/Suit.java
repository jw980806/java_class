package myobj.game;

public enum Suit {

	// odeder와 name을 기본적으로 설정된다
	// 상수를 추가하고 싶다면 생성자를 이용해야한다
	SPADE(3, "스페이드", '♠'),     // order 0, name "sapde"
	DIAMOND(2, "다이아몬드", '◇'),
	HEART(1, "하트", '♡'),
	CLUB(0, "클로버", '♣');
	
	public static final int NUM_OF_SUIT = 4;
	
	private int suitValue;
	private String korName;
	private char suitPic;
	
	// enum타입 객체는 생성자가 반드시 private이다
	private Suit(int suitValue, String korName, char suitPic) {
		this.suitValue = suitValue;
		this.korName = korName;
		this.suitPic = suitPic;
	}
	
	public int getSuitValue() {
		return suitValue;
	}
	
	public String getKorName() {
		return korName;
	}
	
	public char getSuitPic() {
		return suitPic;
	}
}


