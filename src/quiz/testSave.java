package quiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import quiz.E04_SaveGame.Game;

public class testSave {
	static class Game {
		
		
		
		
		public Game() {
			
		}

		public void execute_game() {
			// TODO Auto-generated method stub
			
		}

		public void save() {
			// TODO Auto-generated method stub
			
		}
		
	}
	

	public static void main(String[] args) {
		Game game = new Game();

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
				);

		while (true) {
			game.execute_game();

			System.out.println("계속하시겠습니까? (Y/N)");
//			if (!"Y".equalsIgnoreCase(br.readLine())) {
//				game.save();
//				System.out.println("진행 결과가 저장되었습니다. "
//						+ "프로그램을 종료합니다.");				
//				break;
//			}
		}
	}

}
