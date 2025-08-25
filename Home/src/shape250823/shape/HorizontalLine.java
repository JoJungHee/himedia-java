package shape250823.shape;

public class HorizontalLine extends AbstractLine {

	public HorizontalLine(int length) {
		super(length);
	}
	
	@Override
	public void draw() {
		for (int i = 0; i < getLength(); i++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
	@Override
	public String toString() {
		return "HorizontalLine length: " + getLength();
	}
}
