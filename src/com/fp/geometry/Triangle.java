package com.fp.geometry;

public class Triangle {

	public static void main(String[] args) {

		System.out.println(areaBaseHeight(10, 20));
		System.out.println(areaUsingSides(18, 24, 30));
	}

	private static double areaBaseHeight(double base, double height) {
		// area = 1/2 * base * height

		double area = (base * height) * 1 / 2;
		return area;
	}

	private static double areaUsingSides(double a, double b, double c) {
		// area = sqrt(p*(p-a)*(p-b)*(p-c)) where p is (a+b+c)/2

		double halfPerimetr = (a + b + c) / 2;
		double product = halfPerimetr * (halfPerimetr - a) * (halfPerimetr - b) * (halfPerimetr - c);
		double area = Math.sqrt(product);
		return area;
	}

}
