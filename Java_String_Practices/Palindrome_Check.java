  package string_problems;

import java.util.Scanner;

public class Palindrome_Check {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String str = sc.nextLine();
		int len = str.length()-1;
		int st = 0;
		while(st<=len) {
			if(str.charAt(st)!= str.charAt(len)) {
				System.out.println("False");
				return;
			}
			st++;
			len--;
		}
		System.out.println("True");
	}
}
