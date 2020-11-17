package myobj.item;

import java.util.Scanner;

import myobj.Monster.Monster;

public class Sword {
	
	// 필드
	// - 공격력, 현재 강화 등급, 강화 확률 (등급마다 확률이 다름)
	
	// 메서드
	// - 강화하기 (성공률에 따라 성공 실패가 좌우됨)
	// # 최대 강화 레벨까지 도달하기 까지 걸린 강화횟수를 출력해보기
	// - 공격 (대상에게 공격력 만큼의 데미지를 입힘)
	// # 대상이 되는 객체는 hp가 있어야 한다
	
	// # 인스턴스 메서드를 만들 때는 static을 빼야한다
	//   static 메서드는 인스턴스 변수를 활용할 수 없다.
	
	//int money = 10000;
	int rank=1;
	double percent = 100.0;
	int count = 0;
	int damage = 50;
	
	void reinforce(int rank) {
		
		this.percent = 100 * Math.pow(0.83, rank+1);

		if(Math.random()*100 <= percent) {
			count++;
			rank++;
			this.rank = rank;
			//System.out.println(percent);
			System.out.printf("강화 성공! -> %d강  / count -> %d\n",rank,count);
		}else {
			count++;
			if(rank >= 6) {
				--rank;
				System.out.println("{등급이 하락했습니다..}");
			}
			this.rank = rank;
			//System.out.println(percent);
			System.out.printf("강화 실패.. -> %d강\n", rank);
			
		}

	}



	void attack(Monster enemy, int rank) {
		System.out.println(enemy.shape);
		int monster_hp = enemy.hp;
		System.out.printf("몬스터 HP -> %d\n\n", monster_hp);
		for (int i=1; i <= 8; i++) {
			this.damage += 50;

			if (rank == i) {
				System.out.printf("Hit -> %d\nMonster -> %d\n",damage, monster_hp-damage);
				monster_hp -= damage;

				while(monster_hp > 0) {
					System.out.println("공격을 계속 하시겠습니까? (yes | no)");
					String sc = new Scanner(System.in).nextLine();
					if(sc.equals("yes")) {
						monster_hp -= damage;
						System.out.printf("Hit -> %d\nMonster -> %d\n",damage, monster_hp);
					} else if(sc.equals("no")) {
						
						System.out.println("부리나케 도망쳤습니다....\n몬스터가 비웃습니다(^人^)");
						break;
					} else {
						System.out.println("올바른 입력을 부탁드립니다");
					}
				}
				
				if(monster_hp <= 0) {
					System.out.println("몬스터가 죽었습니다! 축축축");
				}
				
			}
		}
	}


	public static void main(String[] args) {
		Sword sword1 = new Sword();
		
		sword1.reinforce(1);
		
//		while (sword1.rank < 8) {
//			sword1.reinforce(sword1.rank);
//		}
		for(int i =0; i < 30; i++) {
			if(sword1.rank < 8) {
				sword1.reinforce(sword1.rank);
			}
			
		}
		
		System.out.println();
		
		//System.out.println(sword1.rank);
		Monster monster01 = new Monster();
		Monster monster02 = new Monster();
		
		
		sword1.attack(monster01, sword1.rank);
		System.out.println();
		//sword1.attack(monster02, sword1.rank);
	}
	
	

}
