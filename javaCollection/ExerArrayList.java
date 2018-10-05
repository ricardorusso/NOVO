/**
 * 
 */
/**
 * @author Ricardo
 *
 */
package javaCollection;

import java.util.ArrayList;
import java.util.List;

public abstract class  ExerArrayList{
	
	
	//1. Write a Java program to create a new array list, add some colors (string) and print out the collection
	
	 
	
	public static void arrListaColor() {
		List<String> listaColor = new ArrayList<String>();
		listaColor.add("Verde");
		listaColor.add("Vermelho");
		listaColor.add("Preto");
		listaColor.add("Azul");
		listaColor.add("Amarelo");
		System.out.println(listaColor);
	}
	
}