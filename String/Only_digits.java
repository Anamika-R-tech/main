package String;

import java.util.Scanner;

public class Only_digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!(ch >= '0' && ch <= '9')) {
                System.out.print(false);
                return;
            }
        }
        System.out.print(true);
	}

}
