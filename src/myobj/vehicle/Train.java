package myobj.vehicle;

public class Train {

	String kinds; // srt, ktx
	int can; // 17
	int seat;
	String last;
	
	void reserve(int people) {
		System.out.println("����Ǽ̽��ϴ�");
		this.seat -= people;
		System.out.printf("���� �¼� �� : %d", seat);
	}
	
}
