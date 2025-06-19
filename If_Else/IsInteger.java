package If_Else;

import java.util.Scanner;

public class IsInteger {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter Number: ");
        double n = sb.nextDouble(); // n = 3.1415
        if(n == (int)n) System.out.println("Is an Integer");
        else System.out.println("Not an integer");
    }
}
