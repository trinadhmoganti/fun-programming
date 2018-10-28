package com.fp.logics;

public class Alphabet {

	public static void main(String[] args) {

		System.out.println(isVowel('m'));

	}

	private static boolean isVowel(char c) {
		
		boolean isVowel = false;

		switch (c) {
		case 'a':
			isVowel = true;
			break;
		case 'e':
			isVowel = true;
			break;
		case 'i':
			isVowel = true;
			break;
		case 'o':
			isVowel = true;
			break;
		case 'u':
			isVowel = true;
			break;

		default:
			break;
		}
		return isVowel;

	}

}
