package quiz;

import java.io.IOException;
import java.util.Arrays;

public class B14_Array2Quiz {

	//@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		
		
		
		
		// 1. numArr�� ���հ� ���(�Ҽ� ��°�ڸ�)�� ���ؼ� ���
		
		// 2. numArr�� �� ���� �հ� ���� ���� ��� ���ؼ� ���
		//	0���� �� : 10 + 10 + 10  + 10
		//	0���� �� : 10 + 90 + 800 + 300
		
//		int sum = 0;
//		int count = 0;
//		
//		for(int i = 0; i < numArr.length; i++) {
//			for (int j = 0; j < numArr[i].length; ++j) {
//				sum += numArr[i][j];
//				count++;
//			}
//		}
//		double avg = sum / count;
//		System.out.printf("�� ��: %d, ���: %.2f",sum, avg);
		
		
		/////////////////////////////////////////////////////////////
		
//		int hang = 0;
//		int yul = 0;
		
		int[][] numArr = {
				{10, 10, 10, 10},
				{90, 50, 30, 70},
				{800, 500},
				{300, 300, 300}
		};
		
		int[] rowSum = new int[numArr.length];
		int[] colSum = new int[4];


		for(int i = 0; i < numArr.length; i++) {
			for(int j = 0; j < numArr[i].length; ++j) {
				
				rowSum[i] += numArr[i][j];
				colSum[j] += numArr[i][j];
				
//				hang += numArr[i][j];
//				
//				if(numArr[i][j] < 0) {
//					yul += 0;
//				}else {
//					yul += numArr[j][i];
//				}
			}
			//System.out.printf("%d���� �� : %d\n", i, hang);
			
			
			//System.out.printf("%d���� �� : %d\n\n", i, yul);
			
			//hang = 0; yul = 0;
		}
		System.out.println("���� �� : " + Arrays.toString(rowSum));
		System.out.println("���� �� : " + Arrays.toString(colSum));
	}
}
