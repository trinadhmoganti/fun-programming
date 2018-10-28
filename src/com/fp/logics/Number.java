package com.fp.logics;

public class Number {

	public static void main(String[] args) {

		// System.out.println(sumOfTwo(10, 20));
		// System.out.println(averageOfTwo(10, 20));
		// System.out.println(biggestOfTwo(10, 20));
		// System.out.println(biggestOfThree(10, 20, 30));
		// System.out.println(isEven(11));
		// System.out.println(isLeapYear(2018));
		// evenNumbers(100);
		// naturalNumbers(50);
		// naturalNumberSum(30);
		// factorial(5);
		// sumOfDigits(156);
		// reverseOfNumber(186);
		// swapTwoNumbersTemp(12, 36);
		// swapTwoNumbersWithoutTemp(25, 36);
		// palindromeNumber(259);
		// isPrime(8);
		fibonacciSeries(10);

	}

	private static int sumOfTwo(int a, int b) {
		return a + b;
	}

	private static int averageOfTwo(int a, int b) {
		return sumOfTwo(a, b) / 2;
	}

	private static int biggestOfTwo(int a, int b) {
		return (a > b) ? a : b;
	}

	private static int biggestOfThree(int a, int b, int c) {
		int big = a;

		if (b > big)
			big = b;
		if (c > big)
			big = c;

		return big;
	}

	private static boolean isEven(int number) {
		int remainder = number % 2;
		if (remainder == 0)
			return true;
		else
			return false;
	}

	private static boolean isLeapYear(int year) {

		if (year % 100 != 0 && (year % 4 == 0 || year % 400 == 0))
			return true;
		else
			return false;
	}

	private static void evenNumbers(int range) {
		System.out.println("Printing even numbers upto " + range);

		int i = 2;
		do {
			System.out.println(i);
			i = i + 2;
		} while (i <= range);
	}

	private static void naturalNumbers(int range) {
		for (int i = 1; i <= range; i++) {
			System.out.println(i);
		}
	}

	private static void naturalNumberSum(int range) {
		int sum = 0;
		for (int i = 1; i <= range; i++) {
			System.out.println(i);
			sum = sum + i;
		}
		System.out.println(sum);
	}

	private static void factorial(int number) {
		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
	}

	private static void sumOfDigits(int number) {
		int digit;
		int sum = 0;
		while (number > 0) {
			digit = number % 10;
			sum = sum + digit;
			number = number / 10;
		}
		System.out.println("Sum of digits is " + sum);
	}

	private static int reverseOfNumber(int number) {
		int digit;
		int reverse = 0;

		while (number > 0) {
			digit = number % 10;
			reverse = reverse * 10 + digit;
			number = number / 10;
		}
		// System.out.println("Reversed Number is " + reverse);
		return reverse;
	}

	private static void swapTwoNumbersTemp(int a, int b) {
		System.out.println("a=" + a + " b=" + b);
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("a=" + a + " b=" + b);
	}

	private static void swapTwoNumbersWithoutTemp(int a, int b) {
		System.out.println("a=" + a + " b=" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a=" + a + " b=" + b);
	}

	private static void palindromeNumber(int number) {
		int reverseOfNumber = reverseOfNumber(number);

		if (number == reverseOfNumber)
			System.out.println(number + " is a palindromme");
		else
			System.out.println(number + " is not a palindromme");
	}

	private static boolean isPrime(int number) {
		boolean isPrime = true;

		if (number <= 1) {
			isPrime = false;
			return isPrime;
		}
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0)
				System.out.println(number + " is not a Prime");
			isPrime = false;
			break;
		}
		return isPrime;
	}

	private static void fibonacciSeries(int range) {
		int previousTerm, currentTerm, nextTerm;
		previousTerm = 0;
		currentTerm = 1;

		System.out.println(previousTerm);
		//System.out.println(currentTerm);

		for (int i = 3; i < range; i++) {
			nextTerm = previousTerm + currentTerm;
			previousTerm = currentTerm;
			currentTerm = nextTerm;
			System.out.println(currentTerm);
		}

	}

}
