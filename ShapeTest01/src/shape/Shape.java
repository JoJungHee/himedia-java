package shape;

// 부모 클래스 - 추상 클래스
// 이름을 알린다, 그린다.
public abstract class Shape {

	// 추상 메서드
	public abstract void draw();
	
	// 추상 메서드
	public abstract String toString();
	
	
	public void print() {
		System.out.println(toString());
		draw();
	}
}
