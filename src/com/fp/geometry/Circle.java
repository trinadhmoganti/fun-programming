package com.fp.geometry;

public class Circle {

	public static void main(String[] args) {

		System.out.println(area(10));
		System.out.println(perimeter(10));
	}

	private static double area(double radius) {
		// area = Pi * r * r

		double area = Math.PI * radius * radius;
		return area;
	}

	private static double perimeter(double radius) {
		// perimeter = 2 * pi * r

		double perimeter = 2 * Math.PI * radius;
		return perimeter;
	}
}
