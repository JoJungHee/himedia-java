import java.util.Scanner;

public class Method06 {
	
	// 메서드 생성 - 문자를 출력
	static void putChar(int n, char c) {
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// 문제) 밑변(높이)과 출력할 1문자를 입력하여, 좌하변이 직각인 직각 삼각형을 출력하시오.
		// putChar()
		Scanner sc = new Scanner(System.in);
		
		System.out.print("밑변(높이) 입력: ");
		int n = sc.nextInt();
		
		System.out.print("출력할 1문자 입력: ");
//		String s = sc.next();
		char c = sc.next().charAt(0);	// 1문자 입력
		
		putChar(n, c);
		
		sc.close();
	}
}
