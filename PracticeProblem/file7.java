import java.util.Scanner;

public class file7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float length =sc.nextFloat();
        float width =sc.nextFloat();
        float Perimeter = 2 * (length + width);
        System.out.println(Perimeter);
    }
}
