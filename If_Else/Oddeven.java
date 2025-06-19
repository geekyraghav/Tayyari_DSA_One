package If_Else;

import java.util.Scanner;

public class Oddeven {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sb.nextInt();
        if(n%2 == 0) System.out.println("Even Number");
        if(n%2 == 1) System.out.println("Odd Number");
    }
}
