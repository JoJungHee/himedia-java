package shape250823.test;

import shape250823.shape.HorizontalLine;
import shape250823.shape.Point;
import shape250823.shape.VerticalLine;

public class Shape03Test {
	public static void main(String[] args) {
		HorizontalLine horizontal = new HorizontalLine(5);
		VerticalLine vertical = new VerticalLine(3);
		Point point = new Point();
		
		point.print();
		System.out.println();
		horizontal.print();
		System.out.println();
		vertical.print();
		System.out.println();
	}
}
