package exer;

public class ifSatement {

//	Write a Java program that reads in two floating-point numbers and tests whether they are the same up to three decimal places.
//
//	Test Data
//	Input floating-point number: 1256
//	Input floating-point another number: 3254

	// 5. Write a Java program that keeps a number from the user and generates an
	// integer between
	// 1 and 7 and displays the name of the weekday.
	public static String weekDay(int number) {

		switch (number) {
		case 2:
			return "Segunda";
		case 3:
			return "Terça";
		case 4:
			return "Quarta";
		case 5:
			return "Quinta";
		case 6:
			return "Sexta";
		case 7:
			return "Sabado";
		case 1:
			return "Domingo";
		default:
			return "Erro";

		}
	}

}
