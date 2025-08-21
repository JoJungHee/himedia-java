import java.util.Scanner;

public class Method02 {
	
	 static double getArea(double r, double pi) {
		 double result = pi * r * r;
		 return result;
	 }
	
	
	static double getPerimeter(double r, double pi) {
		double result = 2 * pi * r;
		return result;
	}
	
	
	public static void main(String[] args) {
		// 문제) 원의 반지름과 원주율을 입력하여 원의 면적과 원의 둘레를 구하시오.
		// 메서드명: getArea(), getPerimeter()
		// πr² 원의 면적
		// 2πr 원의 둘레
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름을 입력하시오.: ");
		double r = sc.nextDouble();
		System.out.print("원주율을 입력하시오.: ");
		double pi = sc.nextDouble();
		
		// double area = getArea(r, pi);
		// double perimeter = getPerimeter(r, pi);
		
		
		System.out.printf("원의 면적: %.4f \n", getArea(r, pi));
		System.out.printf("원의 둘레: %.4f", getPerimeter(r, pi));
		sc.close();
	}
}
