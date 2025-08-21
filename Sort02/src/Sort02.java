// 버블 정렬 (Bubble Sort)
public class Sort02 {
	public static void main(String[] args) {
		// 문제) 1차원 배열 a의 값을 오름차순으로 정렬하여 저장하시오.
		int[] a = {50, 70, 20, 10, 30, 66, 55, 22, 88, 77};
		int t;
		int cnt = 0;
		boolean flag = false;
		
		
		System.out.print("버블정렬 전 : ");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%3d ", a[i]);
		}
		System.out.println();
		
		// 버블 정렬(Bubble sort)
		// - 선택 정렬보다 효율이 높음 -> 중간에 이미 정렬이 완료됨
		// flag를 사용하여 중간이 정렬이 끝났을 때 작업을 멈추도록 함
		// flag가 true일 때는 정렬할 대상이 있음. flag가 false일 떄는 더이상 정렬할 대상이 없음.
		
		
		// flag 사용하기 전 회전수: 45회
		// flag 사용했을 때 회전수: 39회
		
		// a[j] > a[j+1] - 오름차순 정렬
		// a[j] < a[j+1] - 내림차순 정렬
		
		// 
		for (int i = 0; i < a.length-1; i++) {
			flag = false;
			for (int j = 0; j < a.length-1-i; j++) {
				if (a[j] > a[j+1]) {
					t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
					flag = true;
				}
				++cnt;	// 반복 횟수
			}
			
			
			// 더이상의 정렬여부
			if (!flag) break;
			
			System.out.printf("   %d회전 : ", i+1);
			for (int j = 0; j < a.length; j++) {
				System.out.printf("%3d ", a[j]);
			}
			System.out.println();
		}
		
		
		
		System.out.printf("버블정렬 후 : ");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%3d ", a[i]);
		}
		System.out.println();
		
		
		// 45회
		System.out.println("반복 횟수 : " + cnt);
	}
}
