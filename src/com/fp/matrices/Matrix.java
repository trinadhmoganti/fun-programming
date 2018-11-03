package com.fp.matrices;

public class Matrix {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 }, { 9, 7, 6 } };
		// transpose(matrix);

		int[][] matrixA = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };
		int[][] matrixB = { { 1, 0, 0 }, { 2, 0, 0 }, { 3, 0, 0 } };

		// addition(matrixA, matrixB);
		// subtraction(matrixA, matrixB);

		int[][] mulA = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] mulB = { { 7, 8 }, { 9, 10 }, { 11, 12 } };

		// multiplication(mulA, mulB);

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

	private static void addition(int[][] matrixA, int[][] matrixB) {

		int[][] sum = new int[matrixA.length][matrixA[0].length];

		for (int i = 0; i < matrixA.length; i++) {
			for (int j = 0; j < matrixA[0].length; j++) {
				sum[i][j] = matrixA[i][j] + matrixB[i][j];
			}
		}

		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[0].length; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

	private static void subtraction(int[][] matrixA, int[][] matrixB) {
		int[][] difference = new int[matrixA.length][matrixA[0].length];

		for (int i = 0; i < matrixA.length; i++) {
			for (int j = 0; j < matrixA[0].length; j++) {
				difference[i][j] = matrixA[i][j] - matrixB[i][j];
			}
		}

		for (int i = 0; i < difference.length; i++) {
			for (int j = 0; j < difference[0].length; j++) {
				System.out.print(difference[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

	private static void multiplication(int[][] matrixA, int[][] matrixB) {

		if (matrixA[0].length != matrixB.length) {
			System.out.println("These two matrices can't be multiplied with each other.");
			return;
		}

		int[][] product = new int[matrixA.length][matrixB[0].length];

		int n = matrixA[0].length;

		for (int i = 0; i < product.length; i++) {
			for (int j = 0; j < product[0].length; j++) {
				product[i][j] = 0;
				for (int k = 0; k < n; k++) {
					product[i][j] = product[i][j] + (matrixA[i][k] * matrixB[k][j]);
				}
			}
		}

		for (int i = 0; i < product.length; i++) {
			for (int j = 0; j < product[0].length; j++) {
				System.out.print(product[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

}
