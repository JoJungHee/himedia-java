package shape250823.shape;


// Shape 부모
public abstract class Shape {

	public abstract void draw();
	
	public abstract String toString();
	
	public void print() {
		System.out.println(toString());
		draw();
	};
}
