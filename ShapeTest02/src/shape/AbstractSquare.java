package shape;

// 추상 클래스
// - Shape 추상 클래스의 추상 메서드 2개를 오버라이딩 하지 않음
// - 추상 메서드를 2개 가지게 되고, 추상 클래스가 반드시 되어야 함
// - 인스턴스를 생성할 수 없음
public abstract class AbstractSquare extends Shape implements Plane2D {
	private int width;
	private int height;
	
	public AbstractSquare(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	@Override
	public int getArea() {
		return width * height;
	}
}
