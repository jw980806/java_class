package myobj.game;

public class Ranks {

	static String[] names;
	static Integer[] rankValues;

	public static final Ranks ACE;
	public static final Ranks THREE;
	public static final Ranks DEUCE;
	public static final Ranks FOUR ;
	public static final Ranks FIVE ;
	public static final Ranks SIX  ;
	public static final Ranks SEVEN ;
	public static final Ranks EIGHT;
	public static final Ranks NINE ;
	public static final Ranks TEN  ;
	public static final Ranks JACK ;
	public static final Ranks QUEEN ;
	public static final Ranks KING;


	public static Ranks[] values;




	static {
		names = new String[] {"ACE", "DEUCE", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING"};
		rankValues = new Integer[] {12, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

		ACE = new Ranks(0);
		DEUCE = new Ranks(1);
		THREE = new Ranks(2);
		FOUR = new Ranks(3);
		FIVE = new Ranks(4);
		SIX = new Ranks(5);
		SEVEN = new Ranks(6);
		EIGHT = new Ranks(7);
		NINE = new Ranks(8);
		TEN = new Ranks(9);
		JACK = new Ranks(10);
		QUEEN = new Ranks(11);
		KING = new Ranks(12);

		values = new Ranks[] {
				ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING

		};

	}


	String name;
	Integer rankValue;
	int order;


	// private 생성자 : 외부에서는 인스턴스를 생성할 수 없게 만들기
	private Ranks(int index) {
		this.order = index;
		this.name = names[index];
		this.rankValue = rankValues[index];
	}

	@Override
	public String toString() {
		return name;
	}

	public static void main(String[] args) {
		System.out.println(Ranks.ACE);
	}
}


