
public class C05_extends {

	// # Ŭ���� ��� 
	//	- �̸� ������ Ŭ������ �״�� �����޾Ƽ� ����ϴ� ��
	//	- ������ִ� Ŭ������ �θ� Ŭ���� �Ǵ� super Ŭ������� �Ѵ�
	//	- ��ӹ޴� Ŭ������ �ڽ� Ŭ���� �Ǵ� sub Ŭ������� �Ѵ� 
	//	- �ڽ� Ŭ������ �θ� Ŭ������ ���� ��� ����� �״�� �����޴´�
	//	- �ڽ� Ŭ������ �θ𿡰� �������� 
	// 	  ����� ������� �����ؼ� �� �� �ִ� (�������̵�, override)
	//	- �ڽ� Ŭ������ �θ𿡰� ���� ����� ������� �߰��ؼ� �� ���� �ִ�
	public static void main(String[] args) {
		Person minsu = new Person("�μ�", 10);
		minsu.sayHi();
		
		Police police01 = new Police();
		Doctor doctor01 = new Doctor();
		Dentist dentist01 = new Dentist();
		
		police01.sayHi();
		doctor01.sayHi();

		// # ��ü�� ������
		//	- ��������� �����̱⵵ ������ ����̱⵵ �ϴ�
		//	- Person�� �䱸�ϴ� �ڸ��� Police�� �� �� �ִ�
		dentist01.scaling(minsu);
		dentist01.scaling(police01);
		
		
		// Police�� �θ��� Person�� ��� ������ ������ �ֱ� ������
		// �ƹ����� ���� PersonŸ���� �� �� �ִ� (��ĳ����)
		// �� �θ�Ÿ������ �ö󰡴� ��ĳ������ �ƹ� ������ ���� 

		// Person�� �ڽ��� Police�� �𸣴� ����� ������ �� �ֱ� ������
		// �ڽ� Ÿ���� �� �� ���� (�ٿ�ĳ����)
		// �� �ٿ�ĳ������ Ư���� ��츦 �����ϰ�� �Ұ����ϴ�  
		Person person01 = new Police();
		Person person02 = new Dentist();
		// Police police02 = new Person();
		
		// ���� Police���� �ν��Ͻ��� �ٽ� Police�� �ٿ�ĳ���� �� �� �ִ�
		Police police = (Police) person01;
		Doctor doctor = (Doctor) person02;
		Dentist dentis = (Dentist) person02;
		
		Dentist d1 = new Dentist();		
		Doctor doc = d1;
		Person per = doc;
		
		doc = (Doctor) per;
		d1 = (Dentist) doc;
		
		Person[] pArr = { 
				new Person(),
				new Police(),
				new Doctor(),
				new Dentist()
		};
		
		Doctor[] dArr = {
				new Doctor(),
				new Dentist()
		};
		
		pArr = dArr;
	}
}

class Person {
	String name;
	int age;
	
	public Person() {
		this("default name", 0);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void sayHi() {
		System.out.printf("�ȳ�! �� �̸��� %s�̰�, ���̴� %d�� �̾�.\n"
				, name, age);
	}
}


class Police extends Person {	
	
	// 1. ��ӹ��� ��ü�� �����ڿ��� 
	//    �θ��� �����ڸ� ���� ���� ȣ���ؾ� �Ѵ�
	
	// �� �θ��� �����ڰ� �Ű������� �䱸�ϴ� �����ڹۿ� ���� ���
	//   �ݵ�� ���� ä���� �θ��� �����ڸ� ȣ���ؾ� �Ѵ�
	public Police() {
		super("�����", 25);
		
		// this() : ���� �ν��Ͻ��� ���� Ŭ���� ������
		// super() : ���� �ν��Ͻ��� �θ� Ŭ���� ������
		
		System.out.println("super.name : " + super.name);
		System.out.println("this.name : " + this.name);
	}
	
}

class Doctor extends Person {
	// �⺻ �����ڰ� �ִ� �θ�Ŭ������ ��ӹ޴� ��� �ڵ����� 
	// �θ��� �⺻�����ڸ� ȣ���Ѵ� 	
	
	// PersonŬ������ sayHi()�� ������� ���ļ� ����ϰ� �ִ�
	// ������ sayHi()�� ����ϰ� �ʹٸ� super.sayHi()�� ����� �� �ִ�
	@Override
	public void sayHi() {
		System.out.printf("�ȳ��ϼ���. ���� %s�Դϴ�.\n", name);
	}
}

class Dentist extends Doctor {
	
	public void scaling(Person target) {
		System.out.printf("ġ���ǻ� %s�� %s���� �����ϸ��� ������ϴ�.\n",
				name, target.name);
	}
	
}











