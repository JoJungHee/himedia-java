package shape;

public class Rectangle extends AbstractSquare {
	
	public Rectangle(int width, int height) {
//		this.width = width;
//		this.height = height;
		super(width, height);
	}
	
	@Override
	public void draw() {
		for(int i = 0; i < getHeight(); i++) {
			for(int j = 0; j < getWidth(); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	@Override
	public String toString() {
		return "Reactangle (width: " + getWidth() + ", height: " + getHeight() + ")";
	}
}
