package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Timer;
import java.util.TreeMap;
import java.util.TreeSet;

import org.apache.commons.codec.binary.Base32;
import org.apache.poi.ddf.EscherColorRef.SysIndexSource;
import org.apache.poi.util.SystemOutLogger;

import com.graphbuilder.curve.BSpline;
import com.profesorfalken.jpowershell.PowerShell;
import com.profesorfalken.jpowershell.PowerShellNotAvailableException;

import exer.FileEx;
import exer.StringExer;
import javaCollection.TreeSetMapExer;

public class Main {


	public static final String FOX = "Theajkdandkan23f";
	public static final int[] arrN = { 0, 2, 1, 3, 4, 231, 7, 213213 };
	private static int [] arr2 = {28,1,1};
	public static SortedSet<String> treeColors = new TreeSet<>(
			Arrays.asList("red", "blue", "orange", "black", "blue", "yellow"));
	public static Set<String> setExample = new HashSet<>(treeColors);
	public static SortedMap<Integer, String> treeMapExample = new TreeMap<>(TreeSetMapExer.putKeyTreeSet((TreeSet<String>) treeColors));
	public static List<String> listaColors = new ArrayList<>(Arrays.asList("Verde","Vermelho","Amarelo", "Preto", "Azul")); 
	public static void main(String[] args) throws IOException, InterruptedException {
		//		treeMapExample.put(69, "posição ");
		//		treeMapExample.put(51, "sadas");



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
		//System.out.println(ArrExer.countMinNumber()) ;
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
		//ArrExer.getPointsForExerciceII();
		//System.out.println(Other.breakInteger((short) 5555));

		//ArrExer.diferenceBetwennLargestAndSmallest(arrN);
		//System.out.println(treeMapExample.containsValue("red"));
		//System.out.println(treeColors);
		//		for (String string : treeColors) {
		//			System.out.println(string);
		//		}

		//		Iterator<String> it = treeColors.iterator();
		//		
		//	
		//		
		//		StringExer.upperStringFox();
		//		treeMapExample.replace(0, "black", "Pink");
		//		System.out.println(treeMapExample);
		//		treeMapExample.remove(treeMapExample.firstKey());		
		//		System.out.println(treeMapExample);
		//
		//		System.out.println(treeMapExample.subMap(1,4 ));

		//StringExer.findLenghtWithoutRepeatingChar2();
		//StringExer.upperStringFox();
		//	StringExer.removeCardinal();
		//	StringExer.countDuplicate();
		//StringExer.countDuplicate1();
		//		System.out.println(treeMapExample);
		//		treeMapExample.put(1, "red1");
		//		System.out.println(treeMapExample);

		//StringExer.checkRotacion("ABBA", "AbBA");
		//StringExer.removeZ();
		//	StringExer.prefixMrs();
		//StringExer.joinTwoStringsTogether("Welcome", "home");
		//StringExer.addTwiceChar();
		///StringExer.countDigits();

		//StringExer.exer66String("sdasdas");
		//FileEx.getListFile();
		//FileEx.getExtFile(".txt");
		//System.out.println(FileEx.pathExist());
		//FileEx.checkPermicionsFile();
		//		
		//FileEx.read(FileEx.FILEXAMPLE);
		//		Excel e = new Excel();
		//	e.createExcel();
		//	      XSSFWorkbook workbook = new XSSFWorkbook(); 
		//
		//	      //Create file system using specific name
		//	      FileOutputStream out = new FileOutputStream(new File("createworkbook.xlsx"));
		//
		//	      //write operation workbook using file out object 
		//	      workbook.write(out);
		//	      out.close();
		//	      System.out.println("createworkbook.xlsx written successfully");
		//		
		//		System.out.println(System.getProperty("java.classpath"));

		//System.out.println(ArrExer.checkSum30(arr2));
		//		 Date.todayDate();
		//		 Date.timeInNY();
		//		
		//		 System.out.println(Date.todayDate.get(Calendar.HOUR_OF_DAY));
		//		Date.currentFullDate();
		//		Date.lastDayCurrentMonth();
		//Date.firstAndLastDayWeek();
		//ArrExer.printLeader();
		//ArrExer.rearrangeEliments();
		//System.out.println(StringExer.twoCharLast("educated", 2));
		//System.out.println(StringExer.isNG("sadasdasdasng"));
		//FileEx.whrtiteToFile(FileEx.FILEXAMPLE, "Olá", true);
		//FileEx.contentFileToArray(FileEx.FILEXAMPLE);
		//FileEx.read3Lines(FileEx.FILEXAMPLE);

		//System.out.println(StringExer.joinString("asdsadsaf", "fasadas"));

		//System.out.println(StringExer.joinString("cggsas", "Sasjhh", true));
		//System.out.println(StringExer.swapLast2Chars("asdf"));
		//StringExer.swapLast2Chars2("asdf");

		//ArrExer.exer45();
		//ArrExer.findCombinations(53);
		//StringExer.countCharOfString("strittggg");

		//String ola= "ola";
		//int [] arr = new int [256];
		//System.out.println(arr['a']);

		//		Date.firstAndLastDayMounth();
		//		Date.getDayOfWeek(2019, 0, 2);

		//		Date.addHoursToTime(Integer.toUnsignedLong(2));
		//		
		//		Calendar c = Calendar.getInstance();
		//		c.add(Calendar.WEEK_OF_MONTH, 2);
		//		System.out.println(c.getTime());
		//		DateEx.yourAge(1989, 04, 10);
		//		DateEx.secondsSinceYear(1970);
		//FileEx.whrtiteToFile(FileEx.FILEXAMPLE, "hahhhsadhashjdasdhasdashda", true);
		//FileEx.longstWordInFile(FileEx.FILEXAMPLE);
		//File file = new File("D:\\Cursos Programação\\Curso Java Hrb");
		//List<String> lista = Arrays.asList(file.list());

		//System.out.println(lista);
		//		String str = "Hello World";
		//		//System.out.println(str.substring(0, 10));
		//		System.out.println(str);
		//		strChange(str);
		//		str = strChange(str);
		//		System.out.println(str);
		//IfSatement.printNumber(100);	
		//String []arr ;
		//		System.out.println("OLas");
		//	File file = new File("D:\\FileEx\\ex.sql");
		//	FileWriter fw= new FileWriter(file,false);
		//	
		//	fw.write("Select * from jobs");
		//	fw.close();
		//	System.out.println("escreveu");

		//FileEx.splitFileContentToSeperateFiles(FileEx.fileXml, "<message>","</message>");
		//ArrExer.quickSort();
		//		LocalTime now = LocalTime.now();
		//		LocalTime str = LocalTime.of(11, 2);
		//		System.out.println(now);
		//		Duration duration = Duration.between(now, str);
		//		System.out.println(duration);
		//		
		//		Calendar cal = Calendar.getInstance();
		//		int x =cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		//		System.out.println(x);
		//		
		//		cal.add(Calendar.DATE, +x);
		//		System.out.println(cal.getTime());
//		
//		
//		Integer []arrInt = {
//				1,2,3,6,4,8,9
//
//		};
//
//		reverse(arrInt);
//		String dateS = "20191005";
//		Locale local =  Locale.getDefault();
//		SimpleDateFormat format =  new SimpleDateFormat("yyyyMMdd",local);
//		try {
//			Date date = format.parse(dateS);
//			System.out.println(date);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	private static <T> void  reverse (T [] arr) {
//		for (int i =arr.length-1; i >= 0; i--) {
//			System.out.println(arr[i]);
//		}

	//	FileEx.splitMessager(new File("D:\\FileEx\\mensagem.txt"));
	//	checkperid(" 20 ");
		
		
//		String pass = "123456";
//		String enconded  =new String(org.apache.commons.codec.binary.Base64.encodeBase64(pass.getBytes()));
//		String decoded  =new String( org.apache.commons.codec.binary.Base64.decodeBase64(enconded.getBytes()));
//	 System.out.println(enconded);
//	 System.out.println(decoded);
//	 Tarefa tarefa = new Tarefa();
//	 
//	 Timer timer = new Timer();
//	 System.out.println(tarefa.isBol());
//	Scanner sc = new Scanner(System.in);
//	 timer.schedule(tarefa, 1000, 10000); 
//	 //Thread.sleep(10200);
//	
//	do {String imput  =  sc.next();
//		tarefa.setImput(imput);
//	} while (tarefa.isBol()); 
//
//	 System.out.println(tarefa.isBol());
//	 

		 
		try (PowerShell power = PowerShell.openSession();)
		{
		
			System.out.println(power.executeScript("D:\\FileEx\\Untitled1.ps1","'D:\\FileEx\\MonitorCSW .xlsx' 'D:\\FileEx\\test4.png'").getCommandOutput());
		} catch (PowerShellNotAvailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
 

}


	
	
	private static HashSet<String> checkperid(String imput) {
		System.out.println(imput);
		//14 a 18 e 19 a 29
		LinkedHashSet<String> set = new LinkedHashSet<>();
		String [] split;
		if (imput.contains("e")) {
			 split = imput.split("e");
			
		}else {
			split = new String [] {
					imput
			};

		}
	
		for (int i = 0; i < split.length; i++) {
			String [] splitA = removeIlegalChar(split[i]).split("a");
			List<Integer> list = new ArrayList<>();
			for (String string : splitA) {
				String str = removeLetters(string);
				if(!str.equals(""))
					list.add(Integer.parseInt(str));
			}
			Collections.sort(list);
			System.out.println(list);
			if (!list.isEmpty()) {
				for (int j = list.get(0); j <= list.get(list.size() - 1); j++) {
					
					set.add(Integer.toString(j));
				} 
			}
			
		}
		
		return new HashSet<>(set);
		
	}
	private static String removeIlegalChar(String next) {
		char[] arrChar = {';','.',':','.' ,'<','>' 	
		};
		//System.out.println(next);
		for (int i = 0; i < arrChar.length; i++) {
		
			next = next.replace(arrChar[i], ' ');
			
		}
//		char [] arrNext = next.toCharArray();
//		String result ="";
//		for (int i = 0; i < arrNext.length; i++) {
//			if(Character.isDigit(arrNext[i]))
//			result+=arrNext[i];
//		}
		String result =next.replaceAll(" ", "");
	//	System.out.println(result);
		return result.trim();
	}
	private static String removeLetters(String string) {

		
		
		char [] arr = string.toCharArray();
		String result ="";
		for (int i = 0; i < arr.length; i++) {
			if(Character.isDigit(arr[i])){
				result+=arr[i];
			}
		}
		
		if (result!="" && Integer.parseInt(result)>0 && Integer.parseInt(result)<=31){
			return result;
		}else {
			return "";
		}
		

}
}



