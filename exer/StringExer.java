package exer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringExer {

	public static String fox = "The quick_brown_fox_jumps_over_the_lazy_dog_ac";

	public static String upperStringFox() {
		String fox = "quick_brown_fox_jumps_over_the_lazy_dog";

		char[] arr = fox.toCharArray();
		String result = "";

		for (int c = 0; c <= arr.length - 1; c++) {

			if (arr[c] != '_') {
				result += arr[c];
			} else if (arr[c] == '_') {
				result += Character.toUpperCase(arr[c + 1]);
				c++;
			}
		}
		System.out.println(result);
		return result;
	}

	public static void calcMultiple(int number) {
		if (number <= 100) {
			for (int i = 1; i <= number; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println("AB");
				} else if (i % 3 == 0) {
					System.out.println("A");
				} else if (i % 5 == 0) {
					System.out.println("B");
				} else {
					System.out.println(i);
				}
			}
		} else {
			System.out.println("Numero maior que 100");
		}

	}

	// 37. Write a Java program to reverse a string. Go to the editor
	// Input Data:
	// Input a string: The quick brown fox
	// Expected Output
	//
	// Reverse string: xof nworb kciuq ehT

	public static String reverString() {
		String fox = "The quick brown fox";
		// StringBuilder foxBuilder = new StringBuilder(fox) ;
		// foxBuilder.reverse();

		char[] arrFox = fox.toCharArray();
		String reverseFox = "";
		for (int i = arrFox.length - 1; i >= 0; i--) {
			reverseFox += arrFox[i];
		}

		System.out.println(reverseFox);

		return reverseFox;
	}

	// 38. Write a Java program to count the letters, spaces, numbers and other
	// characters of an input string.
	public static void coutLettersNumbersSpaces() {
		String fox = "The quick brown fox 61616161";
		char[] arrFox = fox.toCharArray();
		int spaces = 0;
		int letters = 0;
		int numbers = 0;
		@SuppressWarnings("unused")
		char[] anArray = { 0, 1, 2, 3, 4, 5, 6, 7, 9, 9 };

		for (int i = 0; i <= arrFox.length - 1; i++) {

			if (arrFox[i] == ' ') {

				spaces++;
				// Character.isDigit(arrFox[i]);
			} else if (arrFox[i] <= '9') {
				numbers++;

			} else {
				letters++;
			}

		}
		System.out.println("Spaces: " + spaces + "\n" + "Letters: " + letters + "\n" + "Numbers: " + numbers

		);
	}

	// 48. Write a Java program to remove "b" and "ac" from a given string

	public void removeAC() {

		String fox2 = fox.replaceAll("ac", "").replaceAll("a", "");
		System.out.println(fox2);

	}
	// 40. Write a Java program to divide a string in n equal parts.

	public List<java.lang.String> numberEqualsPartString() {
		System.out.println(fox.charAt(4));
		char[] arrFox = fox.toCharArray();
		List<String> lista = new ArrayList<>();

		for (int i = 2; i <= arrFox.length - 1; i++) {
			if ((arrFox.length - 1) % i == 0) {
				lista.add(i + "");
			}
			
		}
		

		System.out.println(lista);
		return lista;

	}

	public static void splitString(String str1, int n) {

		int part_size;
		if (str1.length() % n != 0) {
			System.out.println("The size of the given string is not divisible by " + n);
			return;
		} else {
			System.out.println("The given string is: " + str1);
			System.out.println("The string divided into " + n + " parts and they are: ");
			part_size = str1.length() / n;
			for (int i = 0; i < str1.length(); i++) {
				if (i % part_size == 0) {
					System.out.println();
				}
				System.out.print(str1.charAt(i));
			}
		}
	}

	public static void splitString2(String str, int n) {
		System.out.println("Tamanho string " + str.length());

		int partStr = str.length() / n;
		if (str.length() % n != 0) {
			System.out.println("o numero nao é divisivel");
			return;

		} else {
			for (int i = 0; i <= str.length() - 1; i++) {
				if (2 % partStr == 0) {
					System.out.println(i);
					System.out.println();
				}
				System.out.print(str.charAt(i));
			}
		}
	}

	// 45. Write a Java program to reverse words in a given string.
	public static String reverseString(String fox2) {
		String newString = "";
		char[] arr = fox2.toCharArray();
		for (int i = arr.length - 1; i > 0; i--) {
			newString += arr[i];
		}
		System.out.println(newString);
		return newString;
	}

	public static int countStringVogal(String str) {
		char[] newFox = str.toLowerCase().toCharArray();

		List<Character> vogals = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

		int vogal = 0;
		for (int i = 0; i < vogals.size(); i++) {
			for (int j = 0; j < newFox.length; j++) {
				if (newFox[j] == vogals.get(i)) {
					vogal++;
				}
			}
		}
		System.out.println(vogal);
		return vogal;
	}

}
