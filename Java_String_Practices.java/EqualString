package Java_String_Practices;

import java.util.Scanner;

public class EqualString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		int n = str1.length();
		int m = str2.length();
		boolean result1 = true;
		boolean result2;
		if(n == m) {
			for(int i = 0; i < n; i++) {
				if(str1.charAt(i) != str2.charAt(i)) {
					result1 = false;
					break;
				}
			}
		}
		else {
			result1 = false;
		}
		result2 = str1.equals(str2);
		if (result1 == result2) {
            System.out.println("Both methods giving  the same result.");
        } else {
            System.out.println("Methods giving different results.");
        }
		
	}

}
