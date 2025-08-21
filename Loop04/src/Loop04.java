import java.util.Scanner;

public class Loop04 {
	public static void main(String[] args) {
		// 문제) 정수를 입력하여 입력한 값을 밑변과 높이로 갖는 정사각형을 출력하고, 면적을 구하시오.
		// 정사각형(Square), 밑변(width), 높이(height)
		// * * * * *
		// * * * * * 
		// * * * * * 
		// * * * * *
		// * * * * *
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정사각형의 밑변(높이)를 입력하시오.: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("정사각형의 면적: " + n*n);
		
		sc.close();
	}

}
