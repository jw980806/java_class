package myobj.fruit;

// Ŭ���� �ϳ��� ���� �ϳ��� �ٶ�����
public class Banana {

	public int size;
	public int price;
	public int color;
	public int bug=0;
	
	public void neglect(int d) {
		System.out.printf("�ٳ����� ��ġ���� %d���� �������ϴ�\n",d);
		if (d >= 3)
			this.color += 1;
		else if(d >= 6)
			this.color += 2;
		else
			this.color += 3;
		
		if(color == 1) {
			System.out.println("�������� ���߽��ϴ�");
			bug++;
		} else if (color == 2) {
			System.out.println("���������� ���߽��ϴ�");
			bug++;
		} else if (color == 0) {
			System.out.println("��������Դϴ� ���־� ���̳׿�");
		}
		
		if (bug == 2)
			System.out.println("���ĸ��� ���� ����߽��ϴ�....;^;");
	}
	
    public void bargaining(int price) {
    	this.price = price;
    	if (price > 2000 && price < 5000) {
    		System.out.println("������ �����߽��ϴ�.. ������ ������ ��� ũ�Ⱑ �۾����ϴ�");
    		price -= 1000;
    		size -= 5;
    	}else if(price < 8000) {
    		System.out.println("������ �����߽��ϴ�! ���ݸ� �������ϴ�");
    		price -= 3000;
    	} else {
    		System.out.println("������ �̰� ����....�Ȼ�Ծ� ��");
    	}
    }
}
