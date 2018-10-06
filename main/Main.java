package main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ThreadPoolExecutor;

import exer.ArrExer;
import exer.StringExer;
import exer.ifSatement;
import javaCollection.ExerArrayList;
import javaCollection.TreeSetMapExer;

public class Main {
	public static String fox = "Theajkdandkan23";
	public static int [] arrN= {0,2,1,3,4,231,7	,213213};
	public static TreeSet<String> treeColors = new TreeSet<>(Arrays.asList("red","blue","orange","black","blue", "yellow"));
	public static TreeMap<Integer, ?> TreeMapExample = new TreeMap<>(TreeSetMapExer.putKeyTreeSet(treeColors));
	
	public static void main(String[] args){
		  
		//ExerArrayList exerArr = new ExerArrayList();
	
		//StringExer m = new StringExer();
		//upperStringFox();
		//m.calcMultiple(100);
		//m.reverString();
		//m.coutLettersNumbersSpaces();
		//m.removeAC();
		//m.numberEqualsPartString();
		//m.splitString2("asdasdasasasdasdasasasdasdasas", 3);
		//m.reverseString("Ola sua grande ");
		//ExerArrayList.arrListaColor();
		//ArrExer.findMissingNumber();
		//ArrExer.removeDuplicate();
		//ArrExer.findLonguestConsecitiveElement();
		//ArrExer.seperateEvenOddNUmber();
		//ArrExer.duplicateElement();
		//ArrExer.convertArrayList();
		//ArrExer.sortArrString(arrN, fox);
		//ArrExer.seperateZeroOneArr();  
		//ArrExer.fixOrderArr();
		 //ArrExer.averageWithoutLargetsAndSmallest();
		//System.out.println(ArrExer.countMinNumber()) ;
		//StringExer.countStringVogal("aEeg");
		//System.out.println(ExerMethods.checkPass(fox));
		//System.out.println(ifSatement.weekDay(4));
		//System.out.println(TreeSetMapExer.createTreeSet());
		//System.out.println(TreeSetMapExer.copyToAnotherTree(treeColors));
		//System.out.println(TreeSetMapExer.putKeyTreeSet(treeColors));
		//System.out.println(TreeSetMapExer.shearchValueTreeMap(3));
	//	System.out.println(TreeSetMapExer.getAllTheKeysFromTreeMap(TreeMapExample));
		System.out.println(TreeSetMapExer.removeAllElementsTreeMap(TreeMapExample));
		
		System.out.println(TreeMapExample);
	}
	
	
}
