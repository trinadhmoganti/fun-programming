package com.fp.conversions;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {

		System.out.println(cToF(43.4));
	}

	private static double cToF(double tempCelsius) {
		// F = (c * 9/5) + 32
		
		double tempFH = (tempCelsius * 9 / 5) + 32;
		return tempFH;
	}

}