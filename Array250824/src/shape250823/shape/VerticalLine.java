package shape250823.shape;

public class VerticalLine extends AbstractLine {

	public VerticalLine(int length) {
		super(length);
	}
	
	@Override
	public void draw() {
		for (int i = 0; i < getLength(); i++) {
			System.out.println("*");
		}
	}
	
	@Override
	public String toString() {
		return "VerticalLine length: " + getLength();
	}
}
