
public class ForIn01 {
	public static void main(String[] args) {
		int[] a = {10, 20, 30, 40, 50};
		
		// 출력 1번 - 기본 for문
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%3d", a[i]);
		}
		System.out.println();

		
		// 출력 2번 - for-in문
		for (int i : a) {
			System.out.printf("%3d", i);
		}
		System.out.println();
		System.out.println("-----------------");
		
		int[][] x = {
			{10, 20, 30, 40},
			{50, 60, 70, 80},
			{90, 100, 110, 120},
		};
		
		// 출력 1번 - 기본 for문
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.printf("%4d", x[i][j]);
			}
			System.out.println();
		}
		System.out.println("-----------------");
		
		
		
		// 출력 2번 - for-in문
		for (int[] i : x) {
			for (int j : i) {
				System.out.printf("%4d", j);
			}
			System.out.println();
		}
		
	}
}
