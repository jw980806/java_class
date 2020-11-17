package myobj.fruit;

import java.util.Random;


public class Mango implements Comparable<Mango> {
	// 50~70 칼로리  /  60~90 당도
	public int num;
	public int kcal;
	public int dangdo;
	static int mango_count = 1;
	
	/**
	 * 
	 * 비교 대상 선정하는 
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
		num = mango_count++; // 해당 인스턴스를 유일하게 구분해 줄수 있는값
	}
	
	@Override
	public int hashCode() {
		// 이 객체를 유일하게 구분하려면 어떻게 해야할까요? 를 정의하는 곳
		// (기본 동작은 이 인스턴스의 주소값을 사용)
		//System.out.println(super.hashCode());
		return num;
	}

	public String toString() {
		// 이 객체를 문자열로 표형한다면 무엇일까? 에 대한 정의를 하는 메서드
		
		// String.format() : printf처럼 서식을 이용하여 원하는 문자열을 생성하는 메서드
		//return "[" + name + "/" + total + "/" + avg + "]";
		
		return String.format("\n[%04d / 당도: %3d / 칼로리:  %3d ]", num, dangdo, kcal);
	}

	public int compareTo(Mango o1) {
		
		int kacl_result = this.kcal - o1.kcal;
		return kacl_result == 0 ? this.dangdo - o1.dangdo : kacl_result;
	}
	
	
	
}
