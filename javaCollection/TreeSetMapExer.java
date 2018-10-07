package javaCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

import main.Main;

import java.util.Map.Entry;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import java.util.NavigableSet;
import java.util.Set;

public abstract class TreeSetMapExer {
	public static TreeSet<String> setColors = new TreeSet<String>();
	public static TreeMap<Integer, String> staticMap = putKeyTreeSet(Main.treeColors);

	// 1. Write a Java program to create a new tree set, add some colors (string)
	// and print out the tree set.
	public static TreeSet<String> createTreeSet() {
		setColors.add("red");
		setColors.add("blue");
		setColors.add("yellow");
		setColors.add("orange");
		return setColors;
	}
	// 2. Write a Java program to copy a Tree Map content to another Tree Map.

	public static TreeSet<?> copyToAnotherTree(TreeSet<?> tree) {
		TreeSet<?> newTree = new TreeSet<>(tree);
		// newTree.addAll(setColors);
		System.out.println("Saida: ");
		for (Object object : newTree) {
			System.out.print(object + " ");
		}
		return newTree;

	}

	// 3. Write a Java program to search a key in a Tree Map.
	public static TreeMap<Integer, String> putKeyTreeSet(TreeSet<String> treeColors) {

		TreeMap<Integer, String> mapColorsKey = new TreeMap<Integer, String>();

		List<String> listaColors = new ArrayList<>(treeColors);

		// System.out.println(listaColors.size() + listaColors.get(3));
		for (int i = 0; i < listaColors.size(); i++) {

			mapColorsKey.put(i, listaColors.get(i));

		}
		;
		return mapColorsKey; // devolve Tree mapa
	}

	// 4. Write a Java program to search a value in a Tree Map. Go to the editor
	public static String shearchValueTreeMap(Integer key) {

		TreeMap<Integer, String> newMap = new TreeMap<Integer, String>(putKeyTreeSet(Main.treeColors));

		return newMap.get(key);

	}

	// 5. Write a Java program to get all keys from the given a Tree Map. Go to the
	// editor

	public static Set<Integer> getAllTheKeysFromTreeMap(TreeMap<Integer, ?> map) {
		System.out.println(map.size());
		Set<Integer> keys = map.keySet();
		for (Integer integer : keys) {
			System.out.print(integer + ", ");
		}
		System.out.println();
		return map.keySet();

	}

	// 6. Write a Java program to delete all elements from a given Tree Map. Go to
	// the editor
	public static TreeMap<Integer, ?> removeAllElementsTreeMap(TreeMap<Integer, ?> treeMap) {
		TreeMap<Integer, ?> newMap = new TreeMap<>(treeMap);
		int lastEntry = newMap.lastEntry().getKey();
		for (int i = 0; i <= lastEntry; i++) {
			newMap.remove(i);
		}

		return newMap;
	}

	// 8. Write a Java program to get a key-value mapping associated with the
	// greatest key and the least key in a map.
	public static Object greatestValueKeyMap(TreeMap<Integer, ?> map) {

		String firstLastKey = "First key: " + map.firstKey() + " Value: " + map.get(map.firstKey()) + "\n"
				+ "Last Key: " + map.lastKey() + " Value: " + map.get(map.lastKey());
		// return map.get(map.lastKey());
		return firstLastKey;
	}
	
	//10. Write a Java program to get a reverse order view of the keys contained in a given map.
	
	public static NavigableSet<Integer> reverseOrderKeys(TreeMap<Integer, ?> map) {
		NavigableSet<Integer> reverseKeys = map.descendingKeySet();
		String temp="";
		for (Integer integer : reverseKeys) {
			temp+=integer + ", ";
		}
		
		System.out.println(temp);
		return map.descendingKeySet();
		
	}
	

}
