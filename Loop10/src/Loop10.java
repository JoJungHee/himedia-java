import java.util.Scanner;

public class Loop10 {
	public static void main(String[] args) {
		// 문제1) 밑변(높이)를 입력하여 정사각형의 테두리와 양쪽 대각선을 출력하도록 하시오.
		// 문제2) 높이를 입력하여 이등변삼각형을 출력하도록 하시오.
		//    *
		//  * * *
		// * * * * *
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("정수 입력: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i * 2 -1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
		
		sc.close();
	}

}
