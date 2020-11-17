import myobj.animal.*;

public class C10_AnonymousClass {

	// # �͸� Ŭ����
	//	- Ŭ������ �ٷ� �����Ͽ� ����ϴ� ���
	//	- ���� ������� �ʰ� �ѹ��� ����Ѵ�
	
	public static void useAnimal(Animal animal) {
		animal.eat();
		animal.breath();
	}
	
	public static void main(String[] args) {
		Animal animal01 = new Animal();
		
		// �̷��� ������ Ŭ������ �ٽô� ����� �� ���� ������ �͸� Ŭ������ �Ҹ���
		// Animal�� ��ӹ��� �̸����� Ŭ������ �ۼ��� �� �ִ�
		Animal animal02 = new Animal() {
			
			@Override
			public void breath() {
				System.out.println("������� ������");
			}
			
			@Override
			public void eat() {
				System.out.println("������� ���� �Ա�");
			}
		};
		
		useAnimal(new Animal() {
			
			@Override
			public void breath() {
				System.out.println("����̰� ���� ����. �Ϳ���");
			}
			
			@Override
			public void eat() {
				System.out.println("����̰� ��ġ ĵ�� �Դ´�. �Ϳ���");
			}
		});
		
		useAnimal(animal01);
		useAnimal(animal02);
		
//		animal01.eat();
//		animal01.breath();
//		
//		animal02.eat();
//		animal02.breath();
		
		// # ���� �߻� Ŭ������ �ν��Ͻ�ȭ�� �Ұ����ϴ�
		abstract class Monster{
			int attack;
			int hp;
			
			public Monster(int attack, int hp) {
				this.attack = attack;
				this.hp = hp;
			}
			
			abstract void attack();
			abstract void attacked();
		}
		
		Monster monster = new Monster(50, 300) {
			@Override
			void attack() {
				System.out.printf("%d�� ���ݷ����� �����մϴ�.\n", attack * 150);
				
			}
			
			@Override
			void attacked() {
				System.out.println("ü���� 1 �����߽��ϴ�");
				
			}
		};
		
		monster.attack();
		monster.attacked();
		
		
	}
}
