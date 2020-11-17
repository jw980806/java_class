package myobj.vehicle;

public class Train {

	String kinds; // srt, ktx
	int can; // 17
	int seat;
	String last;
	
	void reserve(int people) {
		System.out.println("예약되셨습니다");
		this.seat -= people;
		System.out.printf("남은 좌석 수 : %d", seat);
	}
	
}
