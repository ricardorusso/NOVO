package exer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
public abstract class StringExer {

	public static String fox = "The quick_brown_fox_jumps_over_the_lazy_dog_ac";


	public static String upperStringFox() {
		String fox = "quick_brown_fox_jumps_over_the_lazy_dog_";

		char[] arr = fox.toCharArray();
		String result = "";

		for (int c = 0; c < arr.length;  c++) {

			if (arr[c] != '_') {
				result += arr[c];
			} else if ((c+1 < arr.length) && arr[c] == '_') {
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

	public List<String> numberEqualsPartString() {
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

	//37. Write a Java program to find Length of the longest substring without repeating characters
	public static String findLenghtWithoutRepeatingChar() {
		String str= "pickoutthelongestsubstring";
		char [] strCharArr = str.toCharArray();
		StringBuilder strTemp = new StringBuilder();
		StringBuilder finalStr = new StringBuilder();
		System.out.println(strCharArr.length);

		for (int i = 0; i < strCharArr.length; i++) {
			if((i+1 < strCharArr.length) && strCharArr[i] != strCharArr[i+1]) {
				strTemp.append(strCharArr[i]);
			} else if(strTemp.length() > finalStr.length()) {
				strTemp.append(strCharArr[i]);
				finalStr = strTemp;
				strTemp =  new StringBuilder();

			}
		}
		System.out.println(finalStr);
		return finalStr.toString();
	}
	public static String findLenghtWithoutRepeatingChar2() {
		String str= "pickoutthelonlgestsubstring";
		char [] strCharArr = str.toCharArray();
		LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<>();
		String longuestString ="";
		for (int i = 0; i < strCharArr.length; i++) {
			if(!(linkedHashSet.contains(strCharArr[i]))) {
				linkedHashSet.add(strCharArr[i]);
			}
			else if(linkedHashSet.size()>longuestString.length()){
				Iterator<Character> it = linkedHashSet.iterator();
				String temp ="";
				while(it.hasNext()) {

					temp += it.next();
				}
				linkedHashSet.clear();

				longuestString = temp;
			}
			else {
				linkedHashSet.clear();
			}
		}


		System.out.println(longuestString + "  Size: "+ longuestString.length());
		return longuestString;

	}

	//68. Write a Java program to read a string and returns after remove the 
	//# and its immediate left and right characters
	public static String removeCardinal() {

		StringBuilder strB = new StringBuilder("thefox##sadad##");

		do {
			strB.deleteCharAt(strB.indexOf("#"));
		} while (strB.indexOf("#") != -1);

		System.out.println(strB.toString());
		return strB.toString();

	}

	//51. Write a Java program to count and print all the duplicates in the input string.
	public static String countDuplicate() {
		String str="w3resorurceggsadag2gas";

		StringBuilder strB = new StringBuilder(str);
		StringBuilder strF = new StringBuilder();
		for (int i = 0; i < strB.length(); i++) {
			int count = 1;
			for (int j = i+1; j < strB.length(); j++) {
				if(strB.charAt(i) == strB.charAt(j) ) {
					count++;

				}
			}
			char c = strB.charAt(i);
			if(count>1 && !(strF.toString().contains(Character.toString(c)))) {
				strF.append(c + " " + count + "\n");
			}

		}

		System.out.println(strF);
		return strF.toString();
	}

	//51(2). Write a Java program to count and print all the duplicates in the input string.

	public static Map<Character, Integer> countDuplicate1() {
		String str="w3resorurceggsadag2gas";
		StringBuilder strB = new StringBuilder(str);
		Map<Character, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < strB.length(); i++) {
			int count = 1;
			for (int j = i+1; j < strB.length(); j++) {
				if(strB.charAt(i) == strB.charAt(j)) {
					count++;
				}

			}
			if(count>1 && !(map.containsKey(strB.charAt(i))) ) {
				map.put(strB.charAt(i), count);
			}
		}

		System.out.println(map);
		return map;
	}

	//52. Write a Java program to check if two given strings are rotations of each other.

	public static boolean checkRotacion(String str1, String str2) {
		StringBuilder strB2Reverse = new StringBuilder(str2).reverse();
		System.out.println(str1.equalsIgnoreCase(strB2Reverse.toString()));
		return (str1.equalsIgnoreCase(strB2Reverse.toString()));
	}

	//96. Write a Java program to return the string after removing all 'z' (except the very first and last) from a given string
	public static void removeZ() {
		String str = "zebraZone";
		str = str.toLowerCase();
		List<Integer> indexZtoRem = new ArrayList<>();
		StringBuilder strB = new StringBuilder(str);
		if(strB.indexOf("z")!=-1) {
			for (int i = 0; i < strB.length(); i++) {

				if(str.charAt(i) == 'z' ) {
					indexZtoRem.add(i);
				}

			}
			System.out.println(indexZtoRem);
			int sizeBigening = strB.length();
			strB.deleteCharAt(indexZtoRem.get(0));
			System.out.println(indexZtoRem.get(indexZtoRem.size()-1));
			int lastIndex = indexZtoRem.get(indexZtoRem.size()-1); 

			if(strB.length()!=sizeBigening) {
				strB.deleteCharAt(lastIndex-1);
			}
			System.out.println(strB);


		}

	}
	//74. Write a Java program to return whether a prefix string made of the first N specific characters
	//of the string appear somewhere else in the string.

	public static void prefixMrs() {
		String mrs ="MrsJemsMrsam";
		String checkMrs = "Mrs";
		boolean midle;
		boolean startb = false;

		startb = mrs.substring(0, 3).equals(checkMrs);

		System.out.println(mrs.substring(0, 3));
		String mrdSubsString = mrs.substring(3, mrs.length());
		System.out.println(mrdSubsString);

		midle = (mrdSubsString.contains(checkMrs));

		System.out.println("Começo " + startb);
		System.out.println("Meio " + midle);
	}

	//60. Write a Java program to read two strings append them together and return the result. If the strings are different lengths, omit chars from the beginning
	//of longer string and make them equal length

	public static String joinTwoStringsTogether(String str1, String str2) {
		String str3;
		if(str1.length() == str2.length()) {
			str3 = str1+str2;
		}else if(str1.length()>str2.length()){
			str3 = str1.substring(str1.length()-str2.length(), str1.length()) + str2;

		}else {
			str3 = str2.substring(str2.length()-str1.length(), str2.length()) + str1;
		}
		System.out.println(str3);
		return str3;
	}

	//82. Write a Java program to repeat every character twice in the original string
	public static void addTwiceChar() {
		StringBuilder str = new StringBuilder("olaoalososlmls");
		StringBuilder strF = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			strF.append(str.charAt(i));
			strF.append(str.charAt(i));
		}
		System.out.println(strF);
	}
	//95. Write a Java program to return the sum of the digits present in the given string. If there is no digits the sum return is 0

	public static int countDigits() {
		String x = "ab5c2d4ef12s";

		int count = 0;
		for (int i = 0; i < x.length(); i++) {
			if(Character.isDigit(x.charAt(i))) {

				count+= Integer.parseInt(Character.toString(x.charAt(i)));
			}

		}
		System.out.println(count);
		return count;
	}

	//66. Write a Java program to read a string and return the string without the first two characters.
	//Except keep the first char if it is 'g' and keep the second char if it is 'h'
	public static String exer66String(String str) {

		StringBuilder strB = new StringBuilder(str);

		if(strB.charAt(0) != 'g') {
			strB.deleteCharAt(0);

		}else if(strB.charAt(1) != 'h'){
			strB.deleteCharAt(1);
		}

		System.out.println(strB);
		return strB.toString();

	}
	//educated
	//63. Write a Java program to return true from a given string if the first two characters in the string also appear at the end.
	public static boolean twoCharLast (String str, int numb) {
		String reverseStr = str.substring(str.length()-numb, str.length()) ;

		return (str.substring(0, numb).equalsIgnoreCase(reverseStr)) ;


	}
	public static boolean isNG(String str) {
		String twoLastChar = str.substring(str.length()-2, str.length());
		System.out.println(str);
		System.out.println(twoLastChar);
		return twoLastChar.equalsIgnoreCase("ng");


	}
	//56. Write a Java program to append two given strings such that, if the concatenation creates a double characters then omit one of the characters
	public static String joinString(String str1, String str2) {
		Character lastCharStr1 = str1.charAt(str1.length()-1); 
		char firstCharStr2 = str2.charAt(0);
		if(lastCharStr1 == firstCharStr2) {
			return str1 + str2.substring(1, str2.length());
		}else {
			return str1+str2;
		}
	}
	public static String joinString(String str1, String str2, boolean bol) {
		if(bol) {
			String subStr2 = "";
			StringBuilder strBreverse = new StringBuilder(str1).reverse();
			for (int i = 0; i < strBreverse.length(); i++) {
				String str1R1= Character.toString(strBreverse.charAt(i));
				String str2L2 = Character.toString(str2.charAt(i));
				if(str1R1.equalsIgnoreCase(str2L2)) {
					subStr2= str2.substring(i+1, str2.length());
				}else {
					break;
				}
			}
			System.out.println(subStr2);
			if(!subStr2.equals("")) {
				return str1+subStr2;
			}else {
				return str1+str2;
			}
		}else {
			return joinString(str1, str2);
		}
	}
	
	//57. Write a Java program to return a new string where the last two characters of a given string, if present, are swapped
	public static String swapLast2Chars(String str) {
		String str2 = str.substring(0, str.length()-2);
		System.out.println(str);
		return (str2 + str.charAt(str.length()-1)+ str.charAt(str.length()-2));
	}
	
	public static void swapLast2Chars2(String str) {
		char [] arr = str.toCharArray();
		StringBuilder str2 = new StringBuilder();
		for (int i = 0; i < arr.length -2; i++) {
			str2.append(arr[i]);
		}
		
		System.out.println(str2.toString()+ arr[str.length()-1]+ arr[str.length()-2]);
		
	}
	//43. Write a Java program to find the maximum occurring character in a string.
	public static void countCharOfString(String str) {
		Map<Character, Integer> map = new HashMap<>();
		char[] arr = str.toCharArray();
		
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], count);
			}else{
				map.put(arr[i], map.get(arr[i]) +1 );
			}
			
		};
		int count2=1;
		Character str1 = null;
		for (Entry<Character, Integer> entry : map.entrySet()) {
			
			if(entry.getValue()>count2) {
				count2 = entry.getValue();
				str1= entry.getKey();
			}
			
		}
		String str2 = "";
		int highestValue = map.get(str1);
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()==highestValue && !entry.getKey().equals(str1)) {
				str2 +=str1 +" , "+entry.getKey();
			}
		}
		if(!"".equals(str2)) {
			System.out.println(str2);

		}else {
			System.out.println(str1);

		}
	}
}







