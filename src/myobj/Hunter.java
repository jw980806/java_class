package myobj;

public class Hunter {

	String name;
	int speed;
	int hit_delay;
	public int usePoint;
	
	
	static String catch_range;
	
	static {
		catch_range = "이명 범위 : 36M";
	}
	
	public void Feature(int num) {
		switch(num) {
		case 0:
			name = "공장장";
			speed = 20;
			hit_delay = 3;
			System.out.printf("%s, 초당 %d, %d초 딜레이\n",name, speed, hit_delay);
			break;
		case 1:
			name = "리퍼";
			speed = 40;
			hit_delay = 4;
			System.out.printf("%s, 초당 %d, %d초 딜레이\n",name, speed, hit_delay);
			break;
		case 2:
			name = "요세비";
			speed = 35;
			hit_delay = 1;
			System.out.printf("%s, 초당 %d, %d초 딜레이\n",name, speed, hit_delay);
			break;
		default:
			System.out.println("구현 전입니당");
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(Hunter.catch_range);
		Hunter hunter01 = new Hunter();
		hunter01.Feature(0);
		hunter01.usePoint = 1056;
		Hunter hunter02 = new Hunter();
		hunter02.Feature(2);
		

	}

}
