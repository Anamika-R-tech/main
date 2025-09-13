package Java_Methods;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int principal = sc.nextInt();
		int rate = sc.nextInt();
		int time = sc.nextInt();
		float si = calc(principal, rate, time);
		System.out.println( "The Simple Interest is "+ si +" for Principal "+ principal+" rate of Intesrest "+ rate+" and Time "+ time);
	}
	static float calc(int principal, int rate, int time) {
		float result=(principal*rate*time)/100;
		return result;
	}

}
