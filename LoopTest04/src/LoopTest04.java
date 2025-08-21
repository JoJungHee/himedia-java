import java.util.Scanner;

public class LoopTest04 {
	public static void main(String[] args) {
		// 문제) 입력한 정수 범위 사이에서 소수를 구하고, 소수의 개수와 합계를 출력하시오.
		// 소수(Prime Number): 1을 제외하고, 1과 자신만을 약수로 가지는 수 (약수의 개수가 2개)
		// ex) 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 71, 73, 79, 83, 89, 97, 100 ...
		// 2차원 반복문, 조건문
		
		// < 입력 화면> 정수 입력: 10
		// < 출력 화면> 
		// 2 3 5 7
		// 10까지 범위에서 소수의 개수: 4개
		// 10까지 범위에서 소수의 합계: 17
		Scanner sc = new Scanner(System.in);
		
		System.out.println("소수를 출력합니다. 범위를 입력하세요.");
		System.out.print("정수 범위 입력: ");
		int n = sc.nextInt();
		int cnt = 0, tot = 0;
		
		// 1번 방법 - 자신의 이전까지 나누어 떨어지는지의 여부
		/*
		for(int i=2; i<=n; i++) {
			for(int j=2; j<=i; j++) {
				// 소수임을 판별
				if(i == j) {
					System.out.print(i + " ");
					++cnt;
					tot += i;
				}
				// 소수가 아님을 판별
				if(i % j == 0) {
					break;
				}
			}
		}
		*/
		
		// 2번 방법 - 약수의 개수로 판별하는 방법 (모든 소수는 약수가 2개뿐)
		int dn = 0; // 약수의 개수
		for(int i=2; i<=n; i++) {
			dn = 0;
			for(int j=1; j<=i; j++) {
				if(i % j == 0) {
					++dn;
				}
			}
			// 소수의 판별 (약수가 2개)
			if(dn == 2) {
				System.out.print(i + " ");
				++cnt;
				tot += i;
			}
		}
		
		System.out.printf("\n%d까지 범위에서 소수의 개수: %d개\n", n, cnt);
		System.out.printf("%d까지 범위에서 소수의 합계: %d\n", n, tot);
		
		sc.close();
	}

}
