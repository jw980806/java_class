package myobj;

public class Hunter {

	String name;
	int speed;
	int hit_delay;
	public int usePoint;
	
	
	static String catch_range;
	
	static {
		catch_range = "�̸� ���� : 36M";
	}
	
	public void Feature(int num) {
		switch(num) {
		case 0:
			name = "������";
			speed = 20;
			hit_delay = 3;
			System.out.printf("%s, �ʴ� %d, %d�� ������\n",name, speed, hit_delay);
			break;
		case 1:
			name = "����";
			speed = 40;
			hit_delay = 4;
			System.out.printf("%s, �ʴ� %d, %d�� ������\n",name, speed, hit_delay);
			break;
		case 2:
			name = "�似��";
			speed = 35;
			hit_delay = 1;
			System.out.printf("%s, �ʴ� %d, %d�� ������\n",name, speed, hit_delay);
			break;
		default:
			System.out.println("���� ���Դϴ�");
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
