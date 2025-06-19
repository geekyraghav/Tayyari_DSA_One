package If_Else;
import java.util.Scanner;
public class ternaryInVariable {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sb.nextInt();

        int prasun = (n>=0) ? 100 : 0;

        System.out.println(prasun);
    }
}
