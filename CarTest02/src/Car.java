
// CarTest02
public class Car {
	// 멤버변수
	private String name;
	private int width;
	private int length;
	private int height;
	private double x;
	private double y;
	private double fuel;
	
	// 생성자
	public Car(String name, int width, int length, int height, double fuel) {
		this.name = name;
		this.width = width;
		this.length = length;
		this.height = height;
		this.fuel = fuel;
		x = y = 0.0;
	}
	
	// 멤버변수 중에서 x, y, fuel만 생성
	// setter
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public void setFuel(double fuel) {
		this.fuel = fuel;
	}
	
	// getter
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getFuel() {
		return fuel;
	}
	
	// 차를 이동하는 메서드 - 거리와 연료량에 따라 이동할 수 있는가의 여부
	// 거리, 연료량 계산
	public boolean move(double dx, double dy) {
		// 거리 공식 = √(x² * y²)
		double distance = Math.sqrt(dx * dx + dy * dy);
		
		if (fuel > distance) {  // 이동 가능
			x += dx;
			y += dy;
			fuel -= distance;
			return true;
		} else {                // 이동 불가능
			return false;
		}
				
	}
	
	// 기타 메서드
	// 제원 출력 메서드 - name, width, length, height
	public void putSpec() {
		System.out.println("차 이름: " + name);
		System.out.println("차 너비: " + width);
		System.out.println("차 길이: " + length);
		System.out.println("차 높이: " + height);
	}
}
