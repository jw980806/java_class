package myobj.Student;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.Random;


public class Student implements Comparable<Student>{
	// �л� Ŭ������ ��ҷ� ���� ArrayList��(group) �����ϰ�
		// �л��� 30�� �߰��غ�����

		// 1. 30���� ������ �ڵ����� �����ǵ��� ����� ������

		// 2. ��� �л��� �� ������ ��� ������ ���غ�����

		// 3. �� ����� ���غ�����

		// 4. �̸� ���� ��Ģ
		// 		�׽�Ʈ�л� 0000
		//		�׽�Ʈ�л� 0001
		//		�׽�Ʈ�л� 0002
	
	public static void main(String[] args) {
		ArrayList<Student> group01 = new ArrayList<>();
		
		double sum = 0;
		int num_of_student = 30;
		for (int i = 0; i < num_of_student; ++i) {
			group01.add(new Student());
			sum += group01.get(i).getAvg();
		}

		// println �Լ��� ��� �ش� ��ü�� toString() �޼��带 ȣ���Ѵ�
		System.out.println(group01);
		System.out.println("�� ��� : " + sum / (double)num_of_student);
	}
	// �ܺ� Ŭ�������� �ʵ��� ���� ������ ������� �ʴ� ���� �� �� ��ü�������̴�
	// (�ܺ� Ŭ������ ���� �ִ� �͸� ����� �� �ְԲ� �����ϴ� ���� �̻����̴�)
	private int kor, eng, math;
	private String name;

	final static int NUM_OF_SUBJECTS = 3;
	static int stu_count = 0;

	public Student() {
		Random ran = new Random();
		kor = ran.nextInt(51) + 50;
		eng = ran.nextInt(51) + 50;
		math = ran.nextInt(51) + 50;
		name = String.format("�׽�Ʈ�л�%04d", stu_count++);
		
	}
	
	public int getTotal() {
		return kor + eng + math;
	}
	
	public double getAvg() {
		return (kor + eng + math) / (double) NUM_OF_SUBJECTS ;
	}
	
	
	// toString()�� Object Ŭ������ �޼����̱� ������ ��� ��ü�� ������ �ִ�
	@Override
	public String toString() {
		// �� ��ü�� ���ڿ��� ǥ���Ѵٸ� �����ϱ�? �� ���� ���Ǹ� �ϴ� �޼���
		
		// String.format() : printfó�� ������ �̿��Ͽ� ���ϴ� ���ڿ��� �����ϴ� �޼���
		//return "[" + name + "/" + total + "/" + avg + "]";
		
		return String.format("\n[%s / ����: %3d / ����:  %3d / ����: %3d / ����: %d / ���: %.2f]", name , kor, eng, math, getTotal(), getAvg());
	}

	
	@Override
	public int compareTo(Student next_student) {
		// �� Ŭ������ ũ�� �񱳸� �̷������� �ϰڴ� �� �����ϴ� ��
		// ����� ���� : ���� ��ü�� �Ű������� ���� ��ü(���� �� ��ü)���� �� ŭ    (�ڷ� ������)
		// ������ ���� : ����  ��ü�� �Ű������� ���� ��ü(���� �� ��ü)���� �� ����  (������ ������)
		// 0�� ����   : ���� ��ü�� ���� ��ü�� ũ�Ⱑ ����
		
		if (this.eng > next_student.eng) {
			// ������ �� ū �л��� ���Ľ� �ڿ� ������� ��
			return -1;
		} else if (this.eng < next_student.eng) {
			// ������ �� ���� �л��� ���Ľ� �տ� ������� ��
			return 1;
		} else {
			// ������ ������ �ΰڴ�
			return 0;
		}
		
	}
	
	
	
}