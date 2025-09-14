package Programming_Element_Practices;
import java.util.Scanner;
public class KmToMiles2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double dis_in_km = sc.nextInt();
		double dis_in_miles = dis_in_km * 1.6;
		System.out.println("The total miles is " + dis_in_miles+" mile for the given " +dis_in_km+ " km");
	}

}
