import java.util.Scanner;

public class Method05 {
	
	// 열 제어 -> 출력
	static void putStar(int a) {
		for (int i = 1; i <= a; i++) {
			System.out.print("* ");
		}
	}
	
	public static void main(String[] args) {
		// 문제) 밑변을 입력하여, 좌하변이 직각인 직각 삼각형을 메서드를 사용하여 작성하시오.
		// putStar()
		Scanner sc = new Scanner(System.in);
		
		System.out.print("밑변(높이) 입력: ");
		int n = sc.nextInt();
		
		// 행 제어
		for (int i = 1; i <= n; i++) {
			// 메서드 호출
			putStar(i);
			
			System.out.println();
		}
		
		sc.close();
	}
}
