package com.fp.algebra;

public class Quadratic {

	public static void main(String[] args) {

		rootsAndNature(2, 8, 3);

	}

	private static void rootsAndNature(int a, int b, int c) {
		double root1, root2;
		int discriminant = (b * b) - (4 * a * c);

		if (discriminant == 0) {
			root1 = -b / (2 * a);
			root2 = root1;
			System.out.println("Roots are real and equal root1=" + root1 + " root2=" + root2);
		} else {
			if (discriminant > 0) {
				root1 = ((-b) + Math.sqrt(discriminant)) / (2 * a);
				root2 = ((-b) - Math.sqrt(discriminant)) / (2 * a);
				System.out.println("Roots are real and unequal root1=" + root1 + " root2=" + root2);
			} else {
				System.out.println("Roots are imaginary");
			}
		}

	}

}
