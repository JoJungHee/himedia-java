import java.util.Scanner;

public class Method03 {
	static double calcPower(double x, int y) {
		double power = 1.0;
		
		for (int i = 1; i <= y; i++) {
			power *= x;
		}
		
		return power;
	}
	
	public static void main(String[] args) {
		// 문제) x(실수)값과 y(정수)값을 입력하여, x의 y승을 구하는 프로그램을 작성하시오.
		// 출력형식: 3.0의 4승은 81.0입니다.
		// 메서드명: getPower()
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x의 y승을 구하는 프로그램입니다.");
		
		System.out.print("x값 입력(실수): ");
		double x = sc.nextDouble();
		System.out.print("y값 입력(정수): ");
		int y = sc.nextInt();
		
		
		double power = calcPower(x, y);
		System.out.printf("%.3f의 %d승은 %.3f", x, y, power);
		
		sc.close();
		
		
	}
}
