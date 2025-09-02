package String;

import java.util.Scanner;

public class To_Uppercase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        
        String result = "";
        
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }
            result += ch;
        }
        
        System.out.println("Uppercase String: " + result);
    }
}
