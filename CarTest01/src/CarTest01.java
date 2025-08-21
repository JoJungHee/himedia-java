
public class CarTest01 {
	public static void main(String[] args) {
		Car g80 = new Car("제네시스 G80", 1890, 4990, 1480, 100);
		Car ka4 = new Car("카니발 4세대", 1995, 5155, 1775, 200);
		
		g80.putSpec();
		System.out.println();
		ka4.putSpec();
	}
}
