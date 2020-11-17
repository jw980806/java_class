package quiz;

public class B10_Gugudan {

	// 1. 가로로 구구단 출력
	//   2단 : 2x2=1 2x3=6 ...
	
	// 2. 세로로 구구단 출력
	//	2단  3단  4단
	// 2x1=2
	// 2x2=4
	
	
	public static void main(String[] args) {
		System.out.println("가로 출력");
		
		for(int dan= 2; dan <10; dan++) {
			System.out.printf("%d단 : ",dan);
			for(int gop= 1; gop <10; gop++) {
				System.out.printf("%dx%d=%2d  ",dan, gop, gop*dan);
			}
			System.out.println();
		}
		
		
		System.out.println("\n세로 출력");
		

		
		
		for(int line = 0; line < 10; line++) {
			for(int gop = 2; gop <= 9; gop++) {
				if(line == 0) {
					System.out.printf("%d단\t", gop);
				}
				else {
					System.out.printf("%dx%d=%2d  ",gop, line, gop*line);
				}
			}
			System.out.println();
		}
		

	}

}
