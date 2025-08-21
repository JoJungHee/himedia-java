package test;

import calc.Calc;

public class PackageTest01 {
	public static void main(String[] args) {
		Calc c = new Calc();
		
		System.out.println(c.add(10, 20));
		System.out.println(c.subtract(100, 20));
		System.out.println(c.multiply(30, 50));
		System.out.println(c.divide(10, 5));
	}
}
