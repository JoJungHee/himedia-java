// lang 패키지: JAVA를 실행함에 있어서 필수적으로 사용되는 클래스를 모아 놓은 패키지
// - Math, String, Object, Thread, Exception ...
// - lang 패키지 안의 클래스를 사용할 때는 따로 import를 하지 않아도 됨

// 3. static import
import static java.lang.Math.*;
import java.util.Scanner;


public class ImportTest03 {
	public static void main(String[] args) {
		// 설정: 수학적인 계산을 하는 프로그램
		// Math 클래스 활용
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름 입력: ");
		double radius = sc.nextDouble();
		System.out.print("x좌표 입력: ");
		int x = sc.nextInt();
		System.out.print("y좌표 입력: ");
		int y = sc.nextInt();
		
		System.out.print("음수 정수 입력: ");
		int n = sc.nextInt();
		
		
		double area = PI * radius * radius;
		double perimeter = 2 * PI * radius;
		
		double distance = sqrt(x*x + y*y);
		int an = abs(n);
		
		System.out.println("원주율: " + PI);
		System.out.println("원의 면적: " + area);
		System.out.println("원의 둘레: " + perimeter);
		System.out.println("거리: " + distance);
		System.out.println("절대값: " + an);
		
		
		
		sc.close();
		
	}
}
