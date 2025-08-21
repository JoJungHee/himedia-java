
import java.lang.Object; 

// 부모
class A extends Object {
	private int a;
	
	// 생성자
	public A() {
		super();
		a = 50;
	}
	
	// getter
	public int getA() {
		return a;
	}
}

// 자식
class B extends A {
	public B() {
//		super();
	}
}

public class ObjectTest01 {
	public static void main(String[] args) {
		B x = new B();
		
		System.out.println(x.getA());
	}
}
