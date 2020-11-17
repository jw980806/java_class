package myobj.game;

public enum Suit {

	// odeder�� name�� �⺻������ �����ȴ�
	// ����� �߰��ϰ� �ʹٸ� �����ڸ� �̿��ؾ��Ѵ�
	SPADE(3, "�����̵�", '��'),     // order 0, name "sapde"
	DIAMOND(2, "���̾Ƹ��", '��'),
	HEART(1, "��Ʈ", '��'),
	CLUB(0, "Ŭ�ι�", '��');
	
	public static final int NUM_OF_SUIT = 4;
	
	private int suitValue;
	private String korName;
	private char suitPic;
	
	// enumŸ�� ��ü�� �����ڰ� �ݵ�� private�̴�
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


