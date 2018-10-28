package com.fp.patterns;

public class Pattern {

	public static void main(String[] args) {

		// starPattern(6);
		// numberPattern(6);
		numberPattern2(6);

	}

	private static void starPattern(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

	private static void numberPattern(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.print("\n");
		}
	}

	private static void numberPattern2(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.print("\n");
		}
	}

}
