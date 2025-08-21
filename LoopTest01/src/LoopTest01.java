import java.util.Scanner;

public class LoopTest01 {
	public static void main(String[] args) {
		// 문제) 입력한 정수의 약수를 출력하고, 약수의 개수와 합계를 출력하시오.
		// 반복문 1개, 조건문 1개
		// 약수: 나누어 떨어지는 수
		// ex) 10의 약수는 1, 2, 5, 10
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력한 수의 약수를 출력합니다.");
		System.out.print("정수 입력: ");
		int n = sc.nextInt();
		int cnt = 0, tot = 0;
		
		for(int i=1; i<=n; i++) {
			if(n % i == 0) {
				System.out.print(i + " ");
				++cnt;
				tot += i;
			}
		}
		
		System.out.printf("\n%d의 약수 개수: %d\n", n, cnt);
		System.out.printf("%d의 약수 합계: %d\n", n, tot);
		
		sc.close();
	}

}
