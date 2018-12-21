package javaCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public abstract class ArrExer {
	private ArrExer() {}
	public static int[] exampleArr = {0,4,6,44,3,4,4,5,6,7,8};
	// 24. Write a Java program to find a missing number in an array
	public static int findMissingNumber() {
		int[] arrN = { 0, 2, 1, 3, 4, 6, 7 };

		Arrays.sort(arrN);
		for (int i = 0; i <= arrN.length - 1; i++) {
			if (arrN[i + 1] != (arrN[i] + 1)) {

				System.out.println("O numero que falta é: " + (arrN[i] + 1));
				return (arrN[i] + 1);
			}

		}
		return 0;
	}

	// 33. Write a Java program to remove the duplicate elements of a given array
	// and return the new length of the array.

	public static String removeDuplicate() {
		int[] arrN = { 0, 2, 2, 2, 4, 4, 7 };
		String temp = "";
		for (int i = 0; i < arrN.length - 1; i++) {
			if (arrN[i] != arrN[i + 1]) {
				temp += arrN[i] + ",";
			}
		}
		System.out.println(temp);
		String newTemp = temp.replaceAll(",", "");

		System.out.println("O tamanho do array novo é: " + newTemp.length());
		return temp;
	}
	// 34. Write a Java program to find the length of the longest consecutive
	// elements sequence from a given unsorted array of integers.

	public static List<Integer> findLonguestConsecitiveElement() {

		List<Integer> arrN = new ArrayList<>();
		List<Integer> arrNew = new ArrayList<>();

		arrN.add(49);
		arrN.add(1);
		arrN.add(3);
		arrN.add(200);
		arrN.add(2);
		arrN.add(4);
		arrN.add(70);
		arrN.add(5);
		arrN.sort(null);

		System.out.println("Tamanho do array " + arrN.size());

		System.out.println(arrN);
		for (int i = 0; i < arrN.size(); i += 2) {
			if (arrN.get(i + 1) == (arrN.get(i)) + 1) {
				arrNew.add(arrN.get(i));
				arrNew.add(arrN.get(i + 1));
			} else if ((arrN.get(i + 1) == (arrN.get(i)) + 1) == false && arrN.get(i) == arrN.get(i - 1) + 1) {
				arrNew.add(arrN.get(i));
			}

		}

		System.out.println("LonguestConsecitiveElement: " + arrNew);
		return arrNew;
	}

	// 52. Write a Java program to separate even and odd numbers of an given array
	// of integers. Put all even numbers first, and then odd numbers.

	public static void seperateEvenOddNUmber() {

		List<Integer> arrN = new ArrayList<>(Arrays.asList(49, 1, 3, 200, 2, 4, 70, 5));
		System.out.println("Original: " + arrN);
		List<Integer> listEven = new ArrayList<>();
		List<Integer> listOdd = new ArrayList<>();
		//		arrN.add(49);arrN.add(1);arrN.add(3);arrN.add(200);arrN.add(2);arrN.add(4);
		//		arrN.add(70);arrN.add(5);

		for (int i = 0; i < arrN.size(); i++) {

			if (arrN.get(i) % 2 == 0) {
				listEven.add(arrN.get(i));
			} else {
				listOdd.add(arrN.get(i));
			}

		}

		System.out.println(listEven + "\n" + listOdd);

	}
	// 15. Write a Java program to find the common elements between two arrays of
	// integers

	public static void duplicateElement() {
		int[] arr1 = { 1, 2, 7, 6, 8, 9, 0, 10 };
		int[] arr2 = { 1, 4, 5, 6, 10 };

		List<Integer> arr3 = new ArrayList<>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					arr3.add(arr1[i]);
				}
			}
		}
		System.out.println(arr3);

	}

	// 20. Write a Java program to convert an array to ArrayList.

	public static void convertArrayList() {
		int[] arr1 = { 1, 2, 7, 6, 8, 9, 0, 10 };

		List<int[]> newArray = new ArrayList<>(Arrays.asList(arr1));
		String print = "";

		for (int[] is : newArray) {
			print += is.toString() + ",";
		}

		System.out.println(print);

	}
	// 1. Write a Java program to sort a numeric array and a string array

	public static void sortArrString(int[] arrN, String fox) {
		// int [] arrN= {
		// 0,2,1,3,4,231,7 ,213213
		// };

		// String fox = "The quick_brown_fox_jumps_over_the_lazy_dog_ac";
		char[] newString = fox.toLowerCase().toCharArray();

		Arrays.sort(newString);
		Arrays.sort(arrN);
		Arrays.toString(arrN);

		String fox2 = new String(newString);
		System.out.println("Array sort : " + Arrays.toString(arrN) + " \n" + "String sort: " + fox2);

	}
	// 51. Write a Java program to separate 0s on left side and 1s on right side of
	// an array of 0s and 1s in random order

	public static List<Integer> seperateZeroOneArr() {

		int[] arr = { 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 45, 6, 6, 7 };

		List<Integer> listaZero = new ArrayList<>();
		List<Integer> listaOne = new ArrayList<>();
		List<Integer> listaComplete = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				listaZero.add(arr[i]);
			} else if (arr[i] == 1) {
				listaOne.add(arr[i]);
			}
		}

		listaComplete.addAll(listaZero);
		listaComplete.addAll(listaOne);

		System.out.println(listaComplete);
		return listaComplete;

	}

	// 50. Write a Java program to sort an array of positive integers of an given
	// array, in the sorted array the value of the
	// first element should be maximum,
	// second value should be minimum value,
	// third should be second maximum,
	// fourth second be second minimum and so on.

	public static void fixOrderArr() {
		int[] arrS = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		List<Integer> lista = new ArrayList<>();
		Arrays.sort(arrS);

		lista.add(0, arrS[arrS.length - 1]);
		lista.add(1, arrS[0]);
		lista.add(2, arrS[arrS.length - 2]);
		lista.add(3, arrS[1]);

		for (int i = 2; i < arrS.length - 2; i++) {
			lista.add(arrS[i]);
		}

		System.out.println(lista);

	}
	// 29. Write a Java program to compute the average value of an array of integers
	// except the largest and smallest values

	public static void averageWithoutLargetsAndSmallest() {
		int[] arr = { 5, 7, 2, 4, 9 };

		Arrays.sort(arr);
		// int [] arrNew = new int [arr.length-2];

		// List<Integer> lista = new ArrayList<>();
		float temp = 0;
		for (int i = 1; i < arr.length - 1; i++) {

			temp += arr[i];
		}

		System.out.println(temp / (arr.length - 2));
	}

	// 47 Write a Java program to find the rotation count in a given rotated sorted
	// array of integers.

	public static  int countMinNumber() {
		int[] arr = { 35, 32, 30, 14, 18, 21, 27 };

		int minNumber = arr[0];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < minNumber) {

				minNumber = arr[i];
				index = i;
			}

		}
		System.out.println(index);
		return index;

	}
	public static void getPointsForExerciceII() {
		Set<Integer> noCerto = new HashSet<>(Arrays.asList(1, 3, 4, 6, 8, 9, 13, 15, 16, 17 , 19)) ;
		Set<Integer> yesCerto = new HashSet<>();

		for (int i = 1; i <= 24; i++) {
			if(!noCerto.contains(i)) {
				yesCerto.add(i);
			}
		}
		Set<Integer> myNoCerto = new HashSet<>(Arrays.asList(1,4,7,8,9,11,12,15,16,17,21,23));
		Set<Integer> myYescerto = new HashSet<>();

		for (int i = 1; i <= 24; i++) {
			if(!myNoCerto.contains(i)) {
				myYescerto.add(i);
			}
		}
		int points = 0;
		for (Integer integer : noCerto) {
			points += (myNoCerto.contains(integer)) ? 1: 0 ;

		}
		for (Integer integer : yesCerto) {
			points += (myYescerto.contains(integer)) ? 1: 0;
		}


		System.out.println(points);

	}
	//28. Write a Java program to get the difference between the largest and smallest values in an array of integers. The length of the array must be 1 and above.
	public static void diferenceBetwennLargestAndSmallest(int [] intArr ) {

		Arrays.sort(intArr);

		System.out.println("O maior: " + intArr[intArr.length-1] );
		System.out.println("O menor: " + intArr[0]);
	}
	//31. Write a Java program to check if the sum of all the 10's in the array is exactly 30. Return false if the condition does not satisfy, otherwise true.

	public static boolean checkSum30(int[] arr) {

		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			temp+= arr[i];
		}
		System.out.println(temp);
		return temp==30 ? temp==30 : temp!=30;

	}

	//39. Write a Java program to print all the LEADERS in the array
	public static void printLeader() {
		int [] arr = {10, 9, 14, 23, 15, 0, 9};
		int sum = 0;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length-1; j++) {
				sum +=arr[j];			
			}
			if(arr[i] > sum) {
				list.add(arr[i]);
			}
			sum = 0;
		}
		System.out.println(list.toString());
	}

	//Write a Java program to arrange the elements of an given array of integers where all negative integers appear before all the positive integers.
	public static void rearrangeEliments() {
		int [] arr ={-4, 8, 6, -5, 6, -2, 1, 2, 3, -11};
		List<Integer> negativeList = new ArrayList<>();
		List<Integer> positiveList = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < 0 ) {
				negativeList.add(arr[i]);
			}else {
				positiveList.add(arr[i]);
			}
		}

		List<Integer> completeList = new ArrayList<>();
		completeList.addAll(negativeList);
		completeList.addAll(positiveList);
		System.out.println(completeList);
	}

	//45 Write a Java program to cyclically rotate a given array clockwise by one.
	public static Set<Integer> exer45() {
		int [ ] original = {
				10, 20, 30, 40, 50, 60
		};
		Set<Integer> set = new LinkedHashSet<>();
		set.add(original[original.length-1]);
		for (int i = 0; i < original.length-1; i++) {
			set.add(original[i]);
		}
		System.out.println(set);
		return set;
	}
	//
	//Exer 43 Write a Java program to find all combination of four elements of an given array whose sum is equal to a given value.
	public static void findCombinations(int sum) {
		Set<int[]> set = new HashSet<>();
		int nums[] = {10, 20, 30, 40, 1, 2};

		for (int i = 0; i < nums.length-3; i++) {
			for (int j = i+1; j < nums.length-2; j++) {
				for (int j2 = j+1; j2 < nums.length-1; j2++) {
					for (int k = j2+1; k < nums.length; k++) {
						if(nums[i]+nums[j]+nums[j2]+nums[k]==sum) {
							int[] temp = {
									nums[i],nums[j],nums[j2],nums[k]
							};
							System.out.println(Arrays.toString(temp));
							set.add(temp);

						}
					}
				}
			}
		}	
		Iterator<int[]> it =set.iterator();
		
		while (it.hasNext()) {
			String str = "";
			
			for (int i : it.next()) {
				str += i+", ";
				
			}
			//System.out.println(str);
		
		}
		
	}
}