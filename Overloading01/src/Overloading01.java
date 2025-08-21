
public class Overloading01 {
	
	// 메서드 오버로딩
	static int add(int a) {
		return ++a;
	}
	static int add(int a, int b) {
		return a + b;
	}
	
	// 에러 - 메서드 중복정의 - 매개변수의 이름은 오버로딩과 관계가 없음
//	static int add(int x, int y) {
//		return x + y;
//	}
	
	static double add(double x, double y) {
		return x + y;
	}
	
	
	// 에러: 중복정의 - 리턴타입은 오버로딩과 관계가 없음
//	static int add(double x, double y) {
//		return (int)(x + y);
//	}
	
	public static void main(String[] args) {
		System.out.println("정수 2개: " + add(10, 20));
		System.out.println("실수 2개: " + add(3.2, 4.5));
		System.out.println("정수 1개: " + add(10));
	}
}
