import java.util.Scanner;

public class Scanner02 {
	public static void main(String[] args) {
		// 문제) 반지름과 원주율을 입력하여 원의 면적과 원의 둘레를 구하시오.
		// - 변수명: radius, PI, area, perimeter
		// - 반지름은 정수, 원주율은 실수 상수로 입력하시오.
		// - 원의 면적과 원의 둘레는 소수점 3째자리까지 반올림하여 출력하시오.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름 입력: ");
		double radius = sc.nextDouble();
		
		System.out.print("원주율 입력: ");
		final double PI = sc.nextDouble();
		
		double area = PI * radius * radius;
		double perimeter = 2 * PI * radius;
		
		System.out.printf("원의 면적: %.3f\n원의 둘레: %.3f\n", area, perimeter);		
		
		sc.close();
	}

}
