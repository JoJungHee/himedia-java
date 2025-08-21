import java.util.Scanner;

public class LoopTest06 {
	public static void main(String[] args) {
		// 문제) 입력한 정수 범위 사이에서 완전수를 출력하고, 개수와 합계를 구하시오.
		// 완전수(Perfect Number): 자신을 제외한 약수의 합이 자신과 같은 수
		// ex) 6 = 1 + 2 + 3, 28 = 1 + 2 + 4 + 7 + 14
		// 496, 8128, 33550336, 8589869056 ... 770자리의 완전수
		// 2차원 반복문, 조건문
		Scanner sc = new Scanner(System.in);
		
		System.out.println("완전수를 구합니다. 범위를 입력하세요.");
		System.out.print("정수 범위 입력: ");
		int n = sc.nextInt();
		int cnt = 0, tot = 0;
		int ds = 0; // 약수의 합계
		
		for (int i = 1; i <= n; i++) {
			ds = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					ds += j;
				}
			}
			if (ds - i == i) {
				System.out.printf("%d의 약수의 합: %2d\n", i, ds);
				++cnt;
				tot += i;
			}
		}
		
		System.out.printf("개수: %3d\n합계: %3d", cnt, tot);
		sc.close();
	}
}
