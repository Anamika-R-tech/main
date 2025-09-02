package String;

import java.util.Scanner;
import java.util.StringTokenizer;
public class String_token {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringTokenizer st =new StringTokenizer(str, " ");
		int count=0;
		while(st.hasMoreElements()) {
			count++;
			st.nextToken();
		}
		System.out.print(count);
	}

}
