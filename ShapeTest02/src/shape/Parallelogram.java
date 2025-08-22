package shape;

public class Parallelogram extends AbstractSquare {
	
	public Parallelogram(int width, int height) {
//		this.width = width;
//		this.height = height;
		super(width, height);
	}
	
	@Override
	public void draw() {
		for (int i = 0; i < getHeight(); i++) {
			for (int j = 1; j < getHeight() - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < getWidth(); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	@Override
	public String toString() {
		return "Parallelogram (width: " + getWidth() + ", height: " + getHeight() + ")";
	}
}
