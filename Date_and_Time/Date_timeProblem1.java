package Practice;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public class Date_timeProblem1 {
    public static void main(String[] args) {
        // Formatter for displaying date & time nicely
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");

        // Current time in system default zone
        ZonedDateTime currentSystemTime = ZonedDateTime.now();
        System.out.println("Current System Time: " + currentSystemTime.format(formatter));

        // GMT
        ZonedDateTime gmtTime = currentSystemTime.withZoneSameInstant(ZoneId.of("GMT"));
        System.out.println("Current Time in GMT: " + gmtTime.format(formatter));

        // IST (Indian Standard Time)
        ZonedDateTime istTime = currentSystemTime.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current Time in IST: " + istTime.format(formatter));

        // PST (Pacific Standard Time)
        ZonedDateTime pstTime = currentSystemTime.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));
        System.out.println("Current Time in PST: " + pstTime.format(formatter));
    }
}