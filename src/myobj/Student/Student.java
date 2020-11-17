package myobj.Student;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.Random;


public class Student implements Comparable<Student>{
	// 학생 클래스를 요소로 갖는 ArrayList를(group) 생성하고
		// 학생을 30명 추가해보세요

		// 1. 30명의 점수가 자동으로 설정되도록 만들어 보세요

		// 2. 모든 학생의 총 점수와 평균 점수를 구해보세요

		// 3. 반 평균을 구해보세요

		// 4. 이름 생성 규칙
		// 		테스트학생 0000
		//		테스트학생 0001
		//		테스트학생 0002
	
	public static void main(String[] args) {
		ArrayList<Student> group01 = new ArrayList<>();
		
		double sum = 0;
		int num_of_student = 30;
		for (int i = 0; i < num_of_student; ++i) {
			group01.add(new Student());
			sum += group01.get(i).getAvg();
		}

		// println 함수는 사실 해당 객체의 toString() 메서드를 호출한다
		System.out.println(group01);
		System.out.println("반 평균 : " + sum / (double)num_of_student);
	}
	// 외부 클래스에서 필드의 직접 접근을 허용하지 않는 것이 좀 더 객체지향적이다
	// (외부 클래스는 내가 주는 것만 사용할 수 있게끔 설계하는 것이 이상적이다)
	private int kor, eng, math;
	private String name;

	final static int NUM_OF_SUBJECTS = 3;
	static int stu_count = 0;

	public Student() {
		Random ran = new Random();
		kor = ran.nextInt(51) + 50;
		eng = ran.nextInt(51) + 50;
		math = ran.nextInt(51) + 50;
		name = String.format("테스트학생%04d", stu_count++);
		
	}
	
	public int getTotal() {
		return kor + eng + math;
	}
	
	public double getAvg() {
		return (kor + eng + math) / (double) NUM_OF_SUBJECTS ;
	}
	
	
	// toString()은 Object 클래스의 메서드이기 때문에 모든 객체가 가지고 있다
	@Override
	public String toString() {
		// 이 객체를 문자열로 표형한다면 무엇일까? 에 대한 정의를 하는 메서드
		
		// String.format() : printf처럼 서식을 이용하여 원하는 문자열을 생성하는 메서드
		//return "[" + name + "/" + total + "/" + avg + "]";
		
		return String.format("\n[%s / 국어: %3d / 영어:  %3d / 수학: %3d / 총점: %d / 평균: %.2f]", name , kor, eng, math, getTotal(), getAvg());
	}

	
	@Override
	public int compareTo(Student next_student) {
		// 이 클래스는 크기 비교를 이런식으로 하겠다 를 정의하는 곳
		// 양수를 리턴 : 현재 객체가 매개변수로 오는 객체(다음 비교 객체)보다 더 큼    (뒤로 가야함)
		// 음수를 리턴 : 현재  객체가 매개변수로 오는 객체(다음 비교 객체)보다 더 작음  (앞으로 가야함)
		// 0을 리턴   : 현재 객체와 다음 객체의 크기가 같음
		
		if (this.eng > next_student.eng) {
			// 점수가 더 큰 학생이 정렬시 뒤에 나오라는 뜻
			return -1;
		} else if (this.eng < next_student.eng) {
			// 점수가 더 작은 학생이 정렬시 앞에 나오라는 뜻
			return 1;
		} else {
			// 같을땐 내버려 두겠다
			return 0;
		}
		
	}
	
	
	
}