package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import exer.ArrExer;
import javaCollection.ExerArrayList;
import javaCollection.TreeSetMapExer;

public class Main   {
	public static final String FOX = "Theajkdandkan23f";
	public static final int[] arrN = { 0, 2, 1, 3, 4, 231, 7, 213213 };
	public static SortedSet<String> treeColors = new TreeSet<>(
			Arrays.asList("red", "blue", "orange", "black", "blue", "yellow"));
	public static Set<String> setExample = new HashSet<>(treeColors);
	public static SortedMap<Integer, String> treeMapExample = new TreeMap<>(TreeSetMapExer.putKeyTreeSet((TreeSet<String>) treeColors));
	public static List<String> listaColors = new ArrayList<>(Arrays.asList("Verde","Vermelho","Amarelo", "Preto", "Azul")); 
	public static void main(String[] args) {
		treeMapExample.put(69, "posição ");
		treeMapExample.put(51, "sadas");
		//2. Write a Java program to get the character (Unicode code point) at the given index within the String
		//System.out.println(FOX.codePointAt(1));
//		int lastChar = FOX.length()-1;
//		System.out.println(Character.isDigit(FOX.charAt(lastChar)));
//		
//		System.out.println(ExerArrayList.isEmptyArray(listaColors));
//		
		//21. Write a Java program to replace the second element of a ArrayList with the specified element. 
		
//		System.out.println(listaColors);
//		listaColors.set(1, "No Color");
//		System.out.println(listaColors);

//		 StringExer m = new StringExer();
//		 upperStringFox();
//		 m.calcMultiple(100);
//		 m.reverString();
		 //m.coutLettersNumbersSpaces();
		// m.removeAC();
		// m.numberEqualsPartString();
		// m.splitString2("asdasdasasasdasdasasasdasdasas", 3);
		// m.reverseString("Ola sua grande ");
		// ExerArrayList.arrListaColor();
		// ArrExer.findMissingNumber();
		// ArrExer.removeDuplicate();
		// ArrExer.findLonguestConsecitiveElement();
		// ArrExer.seperateEvenOddNUmber();
		// ArrExer.duplicateElement();
		// ArrExer.convertArrayList();
		// ArrExer.sortArrString(arrN, fox);
		// ArrExer.seperateZeroOneArr();
		// ArrExer.fixOrderArr();
		// ArrExer.averageWithoutLargetsAndSmallest();
		// System.out.println(ArrExer.countMinNumber()) ;
		// StringExer.countStringVogal("aEeg");
		// System.out.println(ExerMethods.checkPass(fox));
		// System.out.println(ifSatement.weekDay(4));
		// System.out.println(TreeSetMapExer.createTreeSet());
		// System.out.println(TreeSetMapExer.copyToAnotherTree(treeColors));
		// System.out.println(TreeSetMapExer.putKeyTreeSet(treeColors));
		// System.out.println(TreeSetMapExer.shearchValueTreeMap(3));
		// System.out.println(TreeSetMapExer.getAllTheKeysFromTreeMap(treeMapExample));
		// System.out.println(TreeSetMapExer.removeAllElementsTreeMap(treeMapExample));
		// System.out.println(TreeMapExample);
		//System.out.println(TreeSetMapExer.greatestValueKeyMap(TreeMapExample));
		//System.out.println(TreeSetMapExer.reverseOrderKeys(TreeMapExample));
		////System.out.println(TreeSetMapExer.getPortionMapKey(4));
		//System.out.println(TreeSetMapExer.staticHashMap.values());
		//TreeSetMapExer.convertHashSetIntoList(setExample);
		
		//System.out.println(TreeSetMapExer.compare2HashSet(setExample, setExample));
		ArrExer.getPointsForExerciceII();
		
		
	}

}
