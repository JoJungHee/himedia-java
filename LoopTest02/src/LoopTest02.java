import java.util.Scanner;

public class LoopTest02 {
	public static void main(String[] args) {
		// 문제) 실수 x와 정수 y를 입력하여 x의 y승을 구하시오.
		// 반복문 1개
		// 출력화면 설계: 3의 5승은 243입니다.
		// 출력결과는 소수점 6자리까지 반올림하여 출력하시오.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x값 입력(실수): ");
		double x = sc.nextDouble();
		System.out.print("y값 입력(정수): ");
		int y = sc.nextInt();
		double power = 1;
		
		for(int i=1; i<=y; i++) {
			power *= x;
		}
		
		System.out.printf("%f의 %d승은 %.6f입니다.", x, y, power);
		
		sc.close();
	}

}
