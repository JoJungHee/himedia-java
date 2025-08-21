// 선택 정렬 (Selection Sort)
public class Sort01 {
	public static void main(String[] args) {
		// 문제) 1차원 배열 a의 값을 오름차순으로 정렬하여 저장하시오.
		int[] a = {50, 70, 20, 10, 30, 66, 55, 22, 88, 77};
		int t;
		
		System.out.print("선택정렬 전 : ");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%3d ", a[i]);
		}
		System.out.println();
		
		// 선택 정렬(Selection sort)
		// a[j] > a[j+1] - 오름차순 정렬
		// a[j] < a[j+1] - 내림차순 정렬
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] > a[j]) {
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
			
			
			System.out.printf("   %d회전 : ", i+1);
			for (int j = 0; j < a.length; j++) {
				System.out.printf("%3d ", a[j]);
			}
			System.out.println();
		}
		
		
		System.out.printf("선택정렬 후 : ");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%3d ", a[i]);
		}
		System.out.println();
	}
}
