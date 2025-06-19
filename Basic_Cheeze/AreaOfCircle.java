package Basic_Cheeze;
import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        // Area kya hota hai? pi*r*
        Scanner sc = new Scanner(System.in); // inputs lene ke liye

        System.out.print("Enter Radius: ");
        double r = sc.nextDouble();
        double a = 3.141592 * r * r;
        System.out.print("Area is: ");
        System.out.println(a);
    }
}
