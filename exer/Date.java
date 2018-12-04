package exer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Date {
	
	public static Calendar todayDate = Calendar.getInstance();
	
	//3. Write a Java program to get the maximum value of the year, month, week, date from the current date of a default calendar.
	public static java.util.Date todayDate() {
		System.out.println(todayDate.getTime());
		return todayDate.getTime();
	}
	//4. Write a Java program to get the minimum value of year, month, week, date from the current date of a default calendar.
	public static void minimalDateValue() {
		System.out.println(Calendar.DATE);
		System.out.println("Ano: " + todayDate.getActualMinimum(Calendar.YEAR));
		System.out.println("MEs: " + todayDate.getActualMinimum(Calendar.MONTH));
		System.out.println("Dia: " + todayDate.getActualMinimum(Calendar.DAY_OF_WEEK));
		System.out.println("Data: " + todayDate.getActualMinimum(Calendar.DATE));

	}
//5. Write a Java program to get the current time in New York. Go to the editor

	public static void timeInNY() {
		Calendar newY = Calendar.getInstance();
		newY.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		System.out.println(newY.get(Calendar.HOUR_OF_DAY));
	}
	//6. Write a Java program to get current full date and time. Go to the editor
	public static void currentFullDate() {
		System.out.println("Dia: " + todayDate.get(Calendar.DAY_OF_MONTH)+"/" + (todayDate.get(Calendar.MONTH)+1) +"/"+ todayDate.get(Calendar.YEAR) ) ;
	}

	//7. Write a Java program to get the last day of the current month.
	public static void lastDayCurrentMonth() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println(c.getTime());
		
	}
	//9. Write a Java program to calculate the first and last day of each week
	
	public static void firstAndLastDayWeek() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		System.out.println(c.getTime());
		for (int i = 0; i < 6; i++) {
			c.add(Calendar.DATE, 6);
			System.out.println(c.getTime());

		}
		
	SimpleDateFormat format =  new SimpleDateFormat("EEEEE dd-MM-YYYY");
	
	}
	
}
