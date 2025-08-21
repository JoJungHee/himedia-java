
// 클래스 A는 추상 메서드를 2개 가지고 있으므로 반드시 추상 클래스가 되어야 함 -> 인스턴스를 생성할 수 없음
abstract class A {
	public abstract void a();   // 추상 메서드
	public abstract void b();   // 추상 메서드
}


// 클래스 B는 추상 클래스 A를 상속하고 있고, 추상 메서드 2개를 가지고 있기 때문에 추상 클래스가 되어야 함 -> 인스턴스를 생성할 수 없음
abstract class B extends A {
	
}

// 클래스 A에 있는 추상 메서드 2개를 모두 오버라이딩 하였기 때문에 클래스 C는 비추상 클래스가 되었음 -> 인스턴스를 생성할 수 있게 됨
class C extends B {
	public void a() {
		
	}
	public void b() {
		
	};
}

public class AbstractTest02 {
	public static void main(String[] args) {
		
	}
}
