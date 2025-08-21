import java.util.Scanner;

public class LoopTest03 {
	public static void main(String[] args) {
		// 문제) 팩토리얼을 입력하여 팩토리얼에 해당하는 값을 출력하시오.
		// 반복문 1개, 조건문 1개
		// 출력화면 설계: 5! = 1* 2* 3 * 4 * 5 = 125
		Scanner sc = new Scanner(System.in);
		
		System.out.println("팩토리얼을 계산합니다.");
		System.out.print("정수 입력: ");
		int n = sc.nextInt();
		int fact = 1;
		
		System.out.print(n + "! = ");
		for(int i=1; i<=n; i++) {
			if(i < n) {
				System.out.print(i + " * ");
			} else {
				System.out.print(i + " = ");
			}
			fact *= i;
		}
		System.out.print(fact);
		
		sc.close();
	}

}
