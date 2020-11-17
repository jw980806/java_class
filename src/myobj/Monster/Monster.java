package myobj.Monster;

public class Monster {

	public int hp;
	public String shape;
	
	public Monster() {
		this.kind((int)(Math.random() * 4 + 1));
	}
	
	private void kind(int num){		
		switch (num) {
		case 1:
			shape= "\r\n"
					+ "	A____A\r\n"
					+ "	| ・ㅅ・|    VS \r\n"
					+ "	|っ　ｃ| \r\n"
					+ "	|　☆　|\r\n"
					+ "	└U￣￣U\n"
					+ "     ────────────\n";
			hp = 700;
			break;
		case 2:
			shape= "\r\n"
					+ "	A____A\r\n"
					+ "	| ・ㅅ・|    VS \r\n"
					+ "	|っ　ｃ| \r\n"
					+ "	|　　　| \r\n"
					+ "	|　☆　| \r\n"
					+ "	|　☆　| \r\n"
					+ "	└U￣￣U\n"
					+ "     ────────────\n";
			hp = 1000;
			break;
		case 3:
			shape= "\r\n"
					+ "	A____A\r\n"
					+ "	| ・ㅅ・|  \r\n"
					+ "	|っ　ｃ|          ┌────┐\r\n"
					+ "	|　　　|          │`O´*│\r\n"
					+ "	|　　　|          └────┘\r\n"
					+ "	|　　　|         ◀───│\r\n"
					+ "	|　　　|            │\r\n"
					+ "	|　　　|           ┌─┐\r\n"
					+ "	└U￣￣U\n"
					+ "     ────────────\n";
			hp = 1600;
			break;
		case 4:
			shape = "⊂_ヽ\r\n"
					+ "　 ＼＼ Λ＿Λ\r\n"
					+ "　　 ＼( ‘ㅅ' ) 두둠칫\r\n"
					+ "　　　 >　⌒ヽ\r\n"
					+ "　　　/ 　 へ＼\r\n"
					+ "　　 /　　/　＼＼\r\n"
					+ "　　 ﾚ　ノ　　 ヽ_つ\r\n"
					+ "　　/　/두둠칫\r\n"
					+ "　 /　/|\r\n"
					+ "　(　(ヽ\r\n"
					+ "　|　|、＼\r\n"
					+ "　| 丿 ＼ ⌒)\r\n"
					+ "　| |　　) /\r\n"
					+ "`ノ )　　Lﾉ\n";
			hp = 2000;
			break;
		default:
			System.out.println("그런 몬스터는 없습니다");
		}
	}
	
	
	
	
	
}
