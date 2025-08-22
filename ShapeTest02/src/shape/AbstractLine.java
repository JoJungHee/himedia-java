package shape;

public abstract class AbstractLine extends Shape {
	private int length;
	
	public AbstractLine(int length) {
		this.length = length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getLength() {
		return length;
	}
}
