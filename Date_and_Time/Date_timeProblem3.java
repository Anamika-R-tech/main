package Practice;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Date_timeProblem3 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
		System.out.println("format1 data: "+ date.format(formatter1));
		System.out.println("format2 data: "+ date.format(formatter2));
		System.out.println("format3 data: "+ date.format(formatter3));
		

	}
}
