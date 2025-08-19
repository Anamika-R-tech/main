import java.util.Scanner;

public class file6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float Principal =sc.nextFloat();
        float Rate =sc.nextFloat();
        float time =sc.nextFloat();
        float Simple_Interest = (Principal * Rate * Time) / 100;
        System.out.println(Simple_Interest);
    }
}
