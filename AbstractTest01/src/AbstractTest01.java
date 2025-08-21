
// 에러: 추상 메서드가 존재하면, 반드시 추상 클래스가 되어야 함.
abstract class A {
	public abstract void a(); // 추상 메서드
	public void b() { }       // 비추상 메서드, 일반 메서드
}

// 가능: 추상 메서드가 없어도 추상 클래스는 될 수 있음 -> 인스턴스를 생성할 수 없음
abstract class B {
	public void a() { }  // 일반 메서드
	public void b() { }  // 비추상 메서드
}


// 해결책 1: A의 추상 메서드 a()를 오버라이딩 -> 권장하는 방법
// 해결책 2: 클래스 C가 추상 클래스가 되어야 함. -> 클래스 C는 인스턴스를 생성할 수 없음
class C extends A {
	public void a() { }  // 오버라이딩한 메서드
	public void c() { }	 // 비추상 메서드
}

public class AbstractTest01 {
	public static void main(String[] args) {
		
	}
}
