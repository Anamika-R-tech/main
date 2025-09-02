package String;
import java.util.Scanner;
import static java.lang.System.out;

public class Is_Equal_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1=sc.nextLine();
		String str2 = sc.nextLine();
		int a=str1.length();
		int b=str2.length();
		boolean result = isequal(str1,str2,a,b);
		System.out.println(result);
	}
	public static boolean isequal(String str1, String str2, int a, int b) {
		if(a!=b) {
			return false;
		}
		for(int i=0;i<a;i++) {
			if(str1.charAt(i)!=str2.charAt(i)) {
				return false;
			}
		}
		return true;
	}
}
