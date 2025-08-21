import java.util.Scanner;

public class Loop05 {
	public static void main(String[] args) {
		// 문제) 밑변(width)과 높이(height)를 입력하여, 직사각형을 출력하고, 면적을 구하시오.
		// 직사각형(Rectangle), 밑변(width), 높이(height)
		// * * * * *
		// * * * * * 
		// * * * * *
		// * * * * *
		// * * * * *
		// * * * * *
		// * * * * *
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("직사각형을 출력합니다.");
		System.out.print("밑변 입력: ");
		int width = sc.nextInt();
		System.out.print("높이 입력: ");
		int height = sc.nextInt();
		
		for(int i=1; i<=height; i++) {
			for(int j=1; j<=width; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
			
		
		sc.close();
	}

}
