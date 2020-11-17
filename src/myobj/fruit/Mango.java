package myobj.fruit;

import java.util.Random;


public class Mango implements Comparable<Mango> {
	// 50~70 Į�θ�  /  60~90 �絵
	public int num;
	public int kcal;
	public int dangdo;
	static int mango_count = 1;
	
	/**
	 * 
	 * �� ��� �����ϴ� 
	 */
	
	public Mango(int kcal, int dangdo, int num) {
		this.kcal = kcal;
		this.dangdo = dangdo;
		this.num = num;
	}
	
	Random rn = new Random();
	
	public Mango() {
		kcal = rn.nextInt(20)+51;
		dangdo = rn.nextInt(30)+61;
		num = mango_count++; // �ش� �ν��Ͻ��� �����ϰ� ������ �ټ� �ִ°�
	}
	
	@Override
	public int hashCode() {
		// �� ��ü�� �����ϰ� �����Ϸ��� ��� �ؾ��ұ��? �� �����ϴ� ��
		// (�⺻ ������ �� �ν��Ͻ��� �ּҰ��� ���)
		//System.out.println(super.hashCode());
		return num;
	}

	public String toString() {
		// �� ��ü�� ���ڿ��� ǥ���Ѵٸ� �����ϱ�? �� ���� ���Ǹ� �ϴ� �޼���
		
		// String.format() : printfó�� ������ �̿��Ͽ� ���ϴ� ���ڿ��� �����ϴ� �޼���
		//return "[" + name + "/" + total + "/" + avg + "]";
		
		return String.format("\n[%04d / �絵: %3d / Į�θ�:  %3d ]", num, dangdo, kcal);
	}

	public int compareTo(Mango o1) {
		
		int kacl_result = this.kcal - o1.kcal;
		return kacl_result == 0 ? this.dangdo - o1.dangdo : kacl_result;
	}
	
	
	
}
