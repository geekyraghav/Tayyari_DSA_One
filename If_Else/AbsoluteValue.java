package If_Else;
import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sb.nextInt();
        if(n < 0) n = -n;
        System.out.println(n);


    }
}
