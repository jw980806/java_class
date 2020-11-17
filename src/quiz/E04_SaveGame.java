package quiz;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class E04_SaveGame {

	static class Game {
		
		public final static String SAVEPATH;
		public final static File SAVEDIR;
		public final static File SAVEFILE;
		
		static {
			SAVEPATH = "D:\\java_io\\game\\save.sav";
			SAVEDIR  = new File("D:\\java_io\\game");
			SAVEFILE = new File(SAVEDIR, "save.sav");
		}
		
		int win;
		int draw;
		int lose;		
		int money;
		
		// input
		FileInputStream fin = null;
		DataInputStream din = null;
		BufferedReader br = null;
		
		// output
		FileOutputStream fout = null;
		DataOutputStream dout = null;
		
		public Game() {			
			// ���丮�� ���� ��� ���丮�� ���� �����Ѵ�
			File dir = new File("D:\\java_io\\game");		
			
			if (!dir.exists()) {
				dir.mkdirs(); 
			}
			
			// �� ���� �ν��Ͻ��� �����Ǹ� ���Ͽ��� ������ ���� ��
			// �������� �ʱ�ȭ �Ѵ�
			try {
				fin = new FileInputStream(new File(dir, "save.sav"));	
				din = new DataInputStream(fin);
				
				win = din.readInt();
				draw = din.readInt();
				lose = din.readInt();
				money = din.readInt();
								
			} catch (FileNotFoundException e) {
				// ������ ó�� �������� �� �߻��ϴ� ����
				System.out.println("ó�� �����Դϴ�. ���̺� ������ �����մϴ�.");
				try {
					fout = new FileOutputStream(new File(dir, "save.sav"));
					dout = new DataOutputStream(fout);
					
					dout.writeInt(0);	// win
					dout.writeInt(0);	// draw
					dout.writeInt(0);	// lose
					dout.writeInt(5000);// money
					
					// �����͸� �� �� �ν��Ͻ� �������� �ʱ�ȭ �Ѵ�
					win = 0;
					draw = 0;
					lose = 0;
					money = 5000;					
				} catch (Exception e1) {					
					System.err.println("���̺� ���� ���� ���� ���� �߻� : " 
							+ e1.getMessage());
				} finally {
					try {
						if (dout != null) dout.close();
						if (fout != null) fout.close();
					} catch (Exception e1) {}
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (din != null) din.close();
					if (fin != null) fin.close();
				} catch (IOException e) {}
			}
			
			print_game();
		}
		
		public void print_game() {
			System.out.println("�÷��̾� ����");
			System.out.printf("%d�� %d�� %d��\t%d�� ������\n", 
					win, draw, lose, money);
		}
		
		public void execute_game() {
			br = new BufferedReader(new InputStreamReader(System.in));
			
			int com_select = (int)(Math.random() * 3);
			int user_select = -1;
			while (true) {
				try {
					System.out.print("����(0), ����(1), ��(2) > ");
					user_select = Integer.parseInt(br.readLine());
					
					if (user_select < 0 || user_select > 2) {
						throw new NumberFormatException("������ ������ϴ�");
					}					
					break;
				} catch (NumberFormatException e) {
					System.out.println("����� �������ּ���");					
				} catch (IOException e) {
					e.printStackTrace();
				}
			} 
			
			int timer = 200;
			
			try {
				System.err.print("��");
				Thread.sleep(timer);
				System.err.print("��");
				Thread.sleep(timer);
				System.err.print(", ");
				Thread.sleep(timer);
				System.err.print("��");
				Thread.sleep(timer);
				System.err.print("��");
				Thread.sleep(timer);
				System.err.print(", ");
				Thread.sleep(timer);
				System.err.print("��");
				Thread.sleep(timer);
				System.err.println("!");
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
			
			System.out.println("����� ���� : " + user_select);
			System.out.println("��ǻ�� ���� : " + com_select);
			
			if (user_select == com_select) {
				++draw;
				System.out.println("���º�!");
			} else if (user_select == (com_select + 1) % 3) {
				++win;
				money += 500;
				System.out.println("���� �¸�! (+500��)");
			} else if ((user_select + 1) % 3 == com_select) {
				++lose;
				money -= 500;
				System.out.println("���� �й�! (-500��)");
			}
			
			print_game();
		}
		
		public void save() {
			try {
				fout = new FileOutputStream(SAVEPATH);
				dout = new DataOutputStream(fout);
				
				dout.writeInt(win);
				dout.writeInt(draw);
				dout.writeInt(lose);
				dout.writeInt(money);				
			} catch (FileNotFoundException e) {				
				e.printStackTrace();
			} catch (IOException e) {				
				e.printStackTrace();
			} finally {
				try {
					if (dout != null) dout.close();
					if (fout != null) fout.close();
				} catch (Exception e) {}
			}
		}		
	}
	
	// ��ǻ�Ϳ� �����ϴ� ������ ���������� ������ ���� �� 
	// ���α׷� ����� �ڵ����� �÷��̾��� ������ ���Ͽ� �����غ�����
	
	// ���α׷� ����� ������ �ҷ������� ����� ������
	
	public static void main(String[] args) throws IOException {
				
		Game game = new Game();
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
		);
		
		while (true) {
			game.execute_game();
			
			System.out.println("����Ͻðڽ��ϱ�? (Y/N)");
			if (!"Y".equalsIgnoreCase(br.readLine())) {
				game.save();
				System.out.println("���� ����� ����Ǿ����ϴ�. "
						+ "���α׷��� �����մϴ�.");				
				break;
			}
		}
		
	}
	
}









