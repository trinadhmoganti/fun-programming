package com.fp.matrices;

public class Matrix {

	public static void main(String[] args) {

		// int[][] matrix = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 }, { 9, 7, 6 } };
		// transpose(matrix);

		int[][] matrixA = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };
		int[][] matrixB = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };

	}

	private static void transpose(int[][] matrix) {
		int[][] transpose = new int[matrix[0].length][matrix.length];

		for (int i = 0; i < matrix[0].length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				transpose[i][j] = matrix[j][i];
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.print("\n");
		}
		System.out.println();

		for (int i = 0; i < transpose.length; i++) {
			for (int j = 0; j < transpose[0].length; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

}
