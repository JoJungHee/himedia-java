package test;

//import point.*;
import point.Point2D;
import point.Point3D;

public class PointTest01 {
	public static void main(String[] args) {
		Point2D x = new Point2D(10, 20);
		Point3D y = new Point3D(30, 40, 50);
		
		System.out.println(x.toString());
		System.out.println(y.toString());
	}
}
