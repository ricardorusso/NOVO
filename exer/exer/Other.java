/**
 * 
 */
package exer;


/**
 * @author Ricardo
 *
 */
public abstract class Other {
	
	
	//10. Write a Java program to break an integer into a sequence of individual digits. Go to the editor

//	Test Data
//	Input six non-negative digits: 123456
//	Expected Output :
//	1 2 3 4 5 6
	
	public static String breakInteger(Short nmb) {
		
		char [] nbmChar = nmb.toString().toCharArray();
		StringBuilder tmp = new StringBuilder();
		for (int i = 0; i < nbmChar.length; i++) {
			
			tmp.append(nbmChar[i] + " ");
		}
		
		return tmp.toString();
	}

}
