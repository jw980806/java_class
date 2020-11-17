package quiz;

public class B11_whileQuiz {

	// while문을 이용하여
	
	// 1. 1부터 100까지의 3의 배수의 총합을 구해보세요
	
	// 2. 200부터 1까지 출력해보세요
	
	// 3. 1부터 200까지의 숫자중 2의 배수도 아니고 3의 배수도 아닌 숫자들의 총합을 구해보세용
	
	public static void main(String[] args) {
		
		int i = 1;
		int total = 0;
		while (i <= 100) {
			if(i % 3 == 0) {
				total += i;
			} i++;
		}System.out.println(total);
		
		
		System.out.println();
		
		int j = 200;
		while (j > 0) {
			System.out.printf("%3d ",j);
			j--;
			if(j % 10 == 0) {
				System.out.println();
			}
		}
		
		System.out.println();
		
		int k = 1;
		int total2 = 0;
		while (k <= 200) {
			if ((k % 2 != 0) && (k % 3 != 0)) {
				total2 += k;
			}k++;
		}System.out.print(total2);
		
		
		
		
	}
	
}
