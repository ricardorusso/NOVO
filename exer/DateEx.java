package exer;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;
import java.util.Calendar;
import java.util.TimeZone;

public class DateEx {

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



	}
	//10. Write a Java program to get the name of the first and last day of a month

	public static void firstAndLastDayMounth() {
		SimpleDateFormat format =  new SimpleDateFormat("EEEE dd-MM-yyyy");
		Calendar c = Calendar.getInstance();

		System.out.println(format.format(c.getTime()));
		System.out.println("Primeiro Dia mes: "+c.getActualMinimum(Calendar.DAY_OF_MONTH));
		System.out.println("Ultimo dia do mes: "+c.getActualMaximum(Calendar.DAY_OF_MONTH));
	}

	//13. Write a Java program to get a day of the week of a specific date

	public static void getDayOfWeek(int year,int month,int date) {
		Calendar c =  Calendar.getInstance();
		c.set(year, month, date);
		System.out.println("Dia do Mês: ");
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		SimpleDateFormat format = new SimpleDateFormat("EEEE");
		System.out.println(format.format(c.getTime()));

	}



	//15. Write a Java program to add some hours to the current time
	public static void addHoursToTime(long hours) {
		Calendar c = Calendar.getInstance();

		System.out.println(c.getTime());
		c.add(Calendar.HOUR, 2);
		System.out.println(c.getTime());
				//OU
		LocalTime lt = LocalTime.now();
		System.out.println(lt.plusHours(hours));

	}
	
	//32. Write a Java program to calculate your age.
	public static int yourAge(int year, int month, int dayOfMonth) {
	
		
		Period diferenca = Period.between(LocalDate.of(year, month, dayOfMonth), LocalDate.now());
		System.out.println(diferenca.getYears());
		return diferenca.getYears();
	
	}

	//37. Write a Java program to find seconds since 1970
	public static void secondsSinceYear(int year) {
		Calendar y = Calendar.getInstance();
		y.set(Calendar.YEAR, year);
		
		System.out.println((todayDate.getTimeInMillis()-y.getTimeInMillis())/1000);
		long seconds = System.currentTimeMillis() / 1000;
	     System.out.println("\nSeconds since 1970: "+seconds+"\n");
	   
	}

	public enum Enum{
		
		a("A"),b("B");
		String x;
		
		private Enum(String str) {
			this.x = str;
			// TODO Auto-generated constructor stub
		}
	}



}
