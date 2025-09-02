package String;

import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        StringBuilder sb =new StringBuilder("");
        for(int i=0;i<len;i++) {
        	if(str.charAt(i)== ' ') {
        		sb.append('_');
        	}
        	else {
        		sb.append(str.charAt(i));
        	}
        }
        System.out.println(sb);
	}

}
