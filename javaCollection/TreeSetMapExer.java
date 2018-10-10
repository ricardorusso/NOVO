package javaCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import main.Main;

public abstract class TreeSetMapExer {
	public static SortedSet<String> setColors = new TreeSet<String>();
	public static SortedMap<Integer, String> staticTreeMap =  putKeyTreeSet(Main.treeColors);
	public static Map<Integer, String> staticHashMap = new HashMap<>(staticTreeMap);

	// 1. Write a Java program to create a new tree set, add some colors (string)
	// and print out the tree set.
	public static SortedSet<String> createTreeSet() {
		setColors.add("red");
		setColors.add("blue");
		setColors.add("yellow");
		setColors.add("orange");
		return setColors;
	}
	// 2. Write a Java program to copy a Tree Map content to another Tree Map.

	public static SortedSet<?> copyToAnotherTree(TreeSet<?> tree) {
		TreeSet<?> newTree = new TreeSet<>(tree);
		// newTree.addAll(setColors);
		System.out.println("Saida: ");
		for (Object object : newTree) {
			System.out.print(object + " ");
		}
		return newTree;

	}

	// 3. Write a Java program to search a key in a Tree Map.
	public static SortedMap<Integer, String> putKeyTreeSet(SortedSet<String> treeColors) {

		TreeMap<Integer, String> mapColorsKey = new TreeMap<Integer, String>();

		List<String> listaColors = new ArrayList<>(treeColors);

		// System.out.println(listaColors.size() + listaColors.get(3));
		for (int i = 0; i < listaColors.size(); i++) {

			mapColorsKey.put(i, listaColors.get(i));

		}
		
		return mapColorsKey; // devolve Tree mapa
	}

	// 4. Write a Java program to search a value in a Tree Map. Go to the editor
	public static String shearchValueTreeMap(Integer key) {

		TreeMap<Integer, String> newMap = new TreeMap<Integer, String>(putKeyTreeSet( Main.treeColors));

		return newMap.get(key);

	}

	// 5. Write a Java program to get all keys from the given a Tree Map. Go to the
	// editor

	public static Set<Integer> getAllTheKeysFromTreeMap(SortedMap<Integer, ?> map) {
		System.out.println("Size: " +map.size());
		Set<Integer> keys = map.keySet();
		for (Integer integer : keys) {
			System.out.print(integer + ", ");
		}
		System.out.println();
		return map.keySet();

	}

	// 6. Write a Java program to delete all elements from a given Tree Map. Go to
	// the editor
	public static SortedMap<Integer, ?> removeAllElementsTreeMap(SortedMap<Integer, ?> treeMap) {
		SortedMap<Integer, ?> newMap = new TreeMap<>(treeMap);
		int lastEntry = newMap.lastKey();
		for (int i = 0; i <= lastEntry; i++) {
			newMap.remove(i);
		}

		return newMap;
	}

	// 8. Write a Java program to get a key-value mapping associated with the
	// greatest key and the least key in a map.
	public static Object greatestValueKeyMap(TreeMap<Integer, ?> map) {

		return  "First key: " + map.firstKey() + " Value: " + map.get(map.firstKey()) + "\n"
				+ "Last Key: " + map.lastKey() + " Value: " + map.get(map.lastKey());
		
		
	}
	
	//10. Write a Java program to get a reverse order view of the keys contained in a given map.
	
	public static NavigableSet<Integer> reverseOrderKeys(TreeMap<Integer, ?> map) {
		NavigableSet<Integer> reverseKeys = map.descendingKeySet();
		StringBuilder temp = new StringBuilder();
		for (Integer integer : reverseKeys) {
			temp.append(integer + " ");
		}
		
		System.out.println(temp);
		return map.descendingKeySet();
		
	}
	
	//13. Write a Java program to get the portion of a map whose keys are strictly
	//less than a given key. Go to the editor
	
	public static SortedMap<Integer, String> getPortionMapKey(int number) {
		System.out.println("Size of hashMap: " + staticHashMap.size() );
		Set<Integer> keys = staticHashMap.keySet();
		
		StringBuilder newKeys= new StringBuilder();
		for (Integer integer : keys) {
			if(integer < number) {
				newKeys.append(integer + " ");
			}

		}
		System.out.println("Keys of HashMap: " + newKeys);
		
		
		//OU
		System.out.println("Chaves TreeMap Incluindo: " + staticTreeMap.headMap(number)); //Só dá com o treeMap
		return staticTreeMap.headMap(number);
		
		
	}

	
	//9. Write a Java program to convert a hash set to a List/ArrayList.
	public static List<?> convertHashSetIntoList(Set<?> hashSet) {
		
		List<?> lista = new ArrayList<>(hashSet);
		System.out.println(lista);
		return lista;
	}
	//10. Write a Java program to compare two hash set.
	
	public static String compare2HashSet(Set<?> set1, Set<?> set2) {
		//set2 = new HashSet<>();
		StringBuilder str = new StringBuilder();
		for (Object object : set1) {
			
			if(set2.contains(object)) {
				str.append(object + " ");
			}
			
		}
		return str.length()>0 ? str.toString() : "Vazio";
	}
	
	
	
	
}





