/*
< Math 클래스 >
- 수학과 관련된 상수, 메서드가 있는 클래스
- 상수: E, PI
- 메서드: 수학과 관련된 기능을 다양한 메서드로 정의함.
- 특징: final로 선언된 클래스, 인스턴스를 생성할 수 없는 클래스
- 상수: 2개의 클래스 메서드로만 이루어져 있음
- 사용하는 방법: Math. 으로 사용함


 */
public class MathTest01 {
	public static void main(String[] args) {
		// 2개의 상수값
		System.out.println(Math.E); // 로그의 지수함수의 밑에 사용되는 수학 상수, 2.718281828459045
		System.out.println(Math.PI); // 원주율, 3.141592653589793
		
		// 반올림, 올림, 내림
		// - 자바에는 trunc() 버림 함수는 없음
		// round(): 실수를 반올림하여 정수를 만듦
		System.out.println(Math.round(10.4));  // 10
		System.out.println(Math.round(10.5));  // 11
		System.out.println(Math.round(10.7));  // 11
		System.out.println("-----");
		
		// ceil(): 실수를 소수점 첫째자리에서 무조건 올림하여 실수로 만듦
		System.out.println(Math.ceil(10.1));  // 11.0
		System.out.println(Math.ceil(10.4));  // 11.0
		System.out.println(Math.ceil(10.5));  // 11.0
		
		// floor(): 실수를 소수점 첫째자리에서 무조건 내림하여 실수로 만듦
		System.out.println(Math.floor(10.1));  // 10.0
		System.out.println(Math.floor(10.5));  // 10.0
		System.out.println(Math.floor(10.9));  // 10.0
		System.out.println("-----");
		
		
		// 최대값, 최소값
		// max(): 두 개의 정수, 실수 중에서 큰 값을 구함
		// min(): 두 개의 정수, 실수 중에서 작은 값을 구함
		System.out.println(Math.max(10, 20));
		System.out.println(Math.max(7.7, 3.3));
		System.out.println(Math.min(10, 20));
		System.out.println(Math.min(7.7, 3.3));
		// 10, 20, 30 중에서 최대값, 최소값
		// - 매개변수 자리에서 메서드를 중첩해서 사용
		System.out.println(Math.max(Math.max(10, 20), Math.max(20, 30)));
		System.out.println(Math.min(Math.min(10, 20), Math.min(20, 30)));
		System.out.println("-----");
		
		// rint(): 소수 첫번째 자리가 양쪽 범위의 정수에 가까운 실수를 구함
		// - .5일 경우에는 홀수는 큰 쪽으로, 짝수는 작은쪽으로 구함
		System.out.println(Math.rint(1.1));
		System.out.println(Math.rint(1.4));
		System.out.println(Math.rint(1.5));
		System.out.println(Math.rint(1.9));
		System.out.println(Math.rint(1.1));
		System.out.println("-----");
		System.out.println(Math.rint(2.5));
		System.out.println(Math.rint(3.5));
		System.out.println(Math.rint(4.5));
		System.out.println(Math.rint(5.5));
		System.out.println(Math.rint(6.5));
		System.out.println(Math.rint(7.5));
		System.out.println(Math.rint(8.5));
		System.out.println(Math.rint(9.5));
		System.out.println(Math.rint(10.5));
		System.out.println("-----");
		
		
		// hypot(x, y): x, y좌표에 대한 거리를 구함
		// - hypothesis: 가설
		double x = 3.6;
		double y = 5.7;
		System.out.println("거리: " + Math.sqrt(x*x + y*y));
		System.out.println("거리: " + Math.hypot(x, y));
		
		
		
		
		// sqrt(): 루트값을 구함.
		System.out.println(Math.sqrt(9));
		System.out.println(Math.sqrt(10));
		System.out.println(Math.sqrt(11));
		System.out.println(Math.sqrt(12));
		System.out.println(Math.sqrt(13));
		System.out.println(Math.sqrt(14));
		System.out.println(Math.sqrt(15));
		System.out.println(Math.sqrt(16));
		System.out.println("-----");
		
		// abs(): 절대값을 구함
		System.out.println(Math.abs(10));
		System.out.println(Math.abs(-10));
		System.out.println("-----");
		
		
		// pow(): x의 y승을 실수로 구함
		System.out.println(Math.pow(3, 5));
		System.out.println("-----");
		

		
		
		
		
		
	}
}
