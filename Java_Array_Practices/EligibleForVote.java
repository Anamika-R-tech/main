package Java_Array_Practices;
import java.util.Scanner;
public class EligibleForVote {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		for(int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < 10; i++) {
			if(arr[i] < 0) {
				System.out.println("Invalid Age");
			}
			else if(arr[i] >= 18) {
				System.out.println("The Student with the age "+ arr[i]+ " can vote");
			}
			else {
				System.out.println("The Student with the age "+ arr[i]+ " cannot vote");
			}
		}
	}

}
