import java.util.Arrays;

public class B14_Array2 {

	// �迭 �ȿ��� �迭�� ���� �� �ִ�
	
	
	public static void main(String[] args) {
		
		// ������ ���� Ÿ�Կ��� null�� �� �� �ִ�
		// �迭 ������ ���� �����ϴ� ���� �ƴ϶� �迭�� ���� �ּҸ� �����Ѵ�
		// ��, �迭�� ������ ���� Ÿ���̴�
		String str = null;
		int[] scores = null;
		
		int[][] arr2 = {
				new int[5], // ����ִ� 5��¥�� int[]�迭
				null, // ���� �迭�� ����
				{1, 2, 3, 4, 5},
				new int[] {1, 2, 3},
				scores
		};
		
		//System.out.println(Arrays.toString(arr2[0]));
		
		System.out.println("arr2�� ����� �迭�� ��ΰ���? " + arr2.length);
		System.out.println(arr2[0].length);
		//System.out.println(arr2[1].length); // null�̶� ����
		System.out.println(arr2[2].length);
		System.out.println(arr2[3].length);
		
		
		//  ���̸� Ȱ���Ͽ� n���� �迭�� n�� �ݺ������� ��� Ž���� �� �ִ�
//		
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.print(i + "��° �迭 : ");
//			int[]arr = arr2[i];
//			
//			if(arr != null) {
//				for (int j = 0; j < arr.length; ++i) {
//					System.out.println(arr2[i][j] + " ");
//				}
//			}else {
//				System.out.println("null");
//			}
//			System.out.println();
//		}
		
		
		
		
		
		// Ȱ�� ��
		int[][] scores2 = {
				{80, 90, 200},
				{50, 60, 70},
				{90,90, 902},
				{70,70,70},
		};
		
		// ���׶�� : 1, �׸� : 2, ����//////./
		
		int[][] map = {
				{2, 2, 3, 3, 3, 5, 5, 5, 5, 5, 5, 1, 5},
				{2, 2, 3, 3, 3},
				{2, 3, 3, 3, 3, 3, 3, 3, 1, 2, 1, 2, 1},
				{2, 3, 3, 3, 4, 4, 2, 1, 4},
				{2, 3, 3, 3, 3},
				{2, 3, 3, 3, 3},
		};
		
		for (int i = 0; i < map.length; ++i) {
			for (int j = 0; j< map[i].length; ++j) {
				switch (map[i][j]) {
				case 1:
					System.out.print("�� ");
					break;
				case 2:
					System.out.print("�� ");
					break;
				case 3:
					System.out.print(" ");
					break;
				case 4:
					System.out.print("�� ");
					break;
				default:
					System.out.print(" ");
					break;
				}
			}
			System.out.println();
		}
		
	}
	
}
