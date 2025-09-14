package Programming_Element_Practices;

import java.util.Scanner;

public class NoOfHandshakes {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int handshakes = fun(n);
			System.out.println( "The no of handshakes is  "+ handshakes);
		}
		static int fun(int n) {
			int result=(n*(n-1))/2;
			return result;
		}
}
