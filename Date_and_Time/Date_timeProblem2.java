package Practice;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Date_timeProblem2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a date (dd-MM-yyyy): ");
		String inputDate = scanner.nextLine();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date = LocalDate.parse(inputDate, formatter);
		
		System.out.println("Original data: "+ date.format(formatter));
		LocalDate newdate = date.plusDays(7).plusMonths(1).plusYears(2);
		System.out.println("after adding: "+newdate.format(formatter));
		
		LocalDate update = newdate.minusWeeks(3);
		System.out.println("Updated date: "+update.format(formatter));
		
		
		
	}

}
