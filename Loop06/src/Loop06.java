import java.util.Scanner;

public class Loop06 {
	public static void main(String[] args) {
		// 문제) 밑변(높이)를 입력하여 좌하변이 직각인 직각삼각형을 출력하고, 면적을 구하시오.
		// 조건문 없음.
		// *
		// * *
		// * * *
		// * * * *
		// * * * * *
		Scanner sc = new Scanner(System.in);
		
		System.out.println("좌하변이 직각인 직각삼각형을 출력합니다.");
		System.out.print("밑변(높이) 입력: ");
		int n = sc.nextInt();
		
		// 1. 조건문 사용 하지 않음
		/*
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		
		// 2. 조건문 사용
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i >= j) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	
		sc.close();
	}

}
