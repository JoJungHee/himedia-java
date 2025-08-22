package test;

import shape.AbstractSquare;
import shape.HorizontalLine;
import shape.Parallelogram;
import shape.Plane2D;
import shape.Point;
import shape.Rectangle;
import shape.Shape;
import shape.VerticalLine;

public class ShapeTest02 {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[] {
			new Point(),
			new HorizontalLine(7),
			new VerticalLine(2),
			new Rectangle(9, 5),
			new Parallelogram(9, 5)
		};
		
		for (Shape s : shapes) {
			s.print();
			if (s instanceof Plane2D) {
				System.out.println("Area: " + ((AbstractSquare)s).getArea());
				System.out.println();
			}
		}
	}
}
