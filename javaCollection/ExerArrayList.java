/**
 * 
 */
/**
 * @author Ricardo
 *
 */
package javaCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class ExerArrayList {
	public static List<String> listaColors = new ArrayList<>(Arrays.asList("Verde","Vermelho","Amarelo", "Preto", "Azul")); 
	// 1. Write a Java program to create a new array list, add some colors (string)
	// and print out the collection

	public static void arrListaColor() {
		List<String> listaColor = new ArrayList<String>();
		listaColor.add("Verde");
		listaColor.add("Vermelho");
		listaColor.add("Preto");
		listaColor.add("Azul");
		listaColor.add("Amarelo");
		System.out.println(listaColor);
	}
	
	//18. Write a Java program to test an array list is empty or not. Go to the editor
	public static boolean isEmptyArray(List<?> listaColors) {
		return listaColors.isEmpty();
	}
	
	//20. Write a Java program to increase the size of an array list.
	public static void increaseArrayLis(int number) {
		 ((ArrayList<String>) listaColors).ensureCapacity(number);
		 
	}
	
	
	

}