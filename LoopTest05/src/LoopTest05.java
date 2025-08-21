import java.util.Scanner;

public class LoopTest05 {
	public static void main(String[] args) {
		// 문제) 입력한 정수 범위 사이에서 합성수를 구하고, 개수와 합계를 구하시오.
		// 합성수(Composite Number): 1을 제외하고, 소수가 이닌 수
		// 1과 자신 이외에 약수가 1개 이상 존재하는 수 (약수가 3개 이상인 수)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("합성수를 구합니다. 범위를 입력하세요.");
		System.out.print("정수 범위 입력: ");
		int n = sc.nextInt();
		int cnt = 0, tot = 0;
		int ds;
		for (int i = 1; i <= n; i++) {
			ds = 0;
			for (int j = 1; j <= n; j++) {
				if (i % j == 0) {
					++ds;
				}
			}
			System.out.printf("%d의 약수의 개수: %d\n", i, ds);
			if (ds > 2) {
				++cnt;
				tot += i;
			}
		}
		
		System.out.printf("개수: %d\n총합: %d", cnt, tot);
		sc.close();
	}

}
