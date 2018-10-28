package com.fp.arrays;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int[] numbers = { 2, 8, 52, 7, 87, -20 };
		// arrayMax(numbers);
		// sortAscending(numbers);
		sortDescending(numbers);

	}

	private static void arrayMax(int[] numbers) {
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println(max);
	}

	private static void sortAscending(int[] numbers) {

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					numbers[i] = numbers[i] + numbers[j];
					numbers[j] = numbers[i] - numbers[j];
					numbers[i] = numbers[i] - numbers[j];
				}
			}
		}
		for (int i : numbers) {
			System.out.println(i);
		}

	}

	private static void sortDescending(int[] numbers) {

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] < numbers[j]) {
					numbers[i] = numbers[i] + numbers[j];
					numbers[j] = numbers[i] - numbers[j];
					numbers[i] = numbers[i] - numbers[j];
				}
			}
		}
		for (int i : numbers) {
			System.out.println(i);
		}

	}

}
