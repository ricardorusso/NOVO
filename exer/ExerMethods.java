package exer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class ExerMethods {
	
	public static String fox = "The_quick_brown_fox_jumps_over_the_lazy_dog_ac";
	
	
	//11. Write a Java method to check whether a string is a valid password. Go to the editor
	//	Password rules:
	//		A password must have at least ten characters.
	//		A password consists of only letters and digits.
	//		A password must contain at least two digits.
	
	public static boolean checkPass(String str) {
		str = "olaolaolal_2121sad";
		if (str.length()<10) {
			System.out.println("Bad size " + str.length());
			return false;
		};
		List<Character> badChar = new ArrayList<>(Arrays.asList('_','+',',','-','@'));
		List<Integer> numbers = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
		boolean atLeast2Numbers =  false;
		boolean badCharBolean = false;

		int number= 0;
		for (int i = 0; i < numbers.size(); i++) {
			
				if(str.contains(numbers.get(i).toString())) {
					number++;
					
				}
				for (int j = 0; j < badChar.size(); j++) {
					if (str.contains(badChar.get(j).toString())) 
						badCharBolean = true;
						
			}	
		}
		atLeast2Numbers = (number >=2) ? true:false;
		if(atLeast2Numbers && !badCharBolean) {
			System.out.println("True");
			return true;
		} else {
			if(!atLeast2Numbers) {
				System.out.println("Nao tem pelo menos 2 Numeros");
				return false;
			}
			if(badCharBolean) {
				System.out.println("Bad char");
				return false;
			}
			
			return false;
		}
		
	}
}
