package test;

import shape.HorizontalLine;
import shape.Point;
import shape.Rectangle;
import shape.Shape;
import shape.VerticalLine;


public class ShapeTest01 {
	public static void main(String[] args) {
		// 문제) 다형성(부모, 자식)을 구현하여 4가지 도형을 출력하시오.
		// 인스턴스 배열 1번
		/*
		Shape[] shapes = new Shape[4];
		shapes[0] = new Point();
		shapes[1] = new HorizontalLine(10);
		shapes[2] = new VerticalLine(3);
		shapes[3] = new Rectangle(3, 5);
		*/
		
		// 인스턴스 배열 2번
		Shape[] shapes = new Shape[] {
			new Point(),
			new HorizontalLine(7),
			new VerticalLine(2),
			new Rectangle(3, 3)
		};
		
		// 출력 1번
		/*
		for (int i = 0; i < shapes.length; i++) {
			shapes[i].print();
			System.out.println();
		}
		*/
		
		// 출력 2번
		for (Shape s : shapes) {
			s.print();
			System.out.println();
		}
	}
}
