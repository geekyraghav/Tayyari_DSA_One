package If_Else;

import java.util.Scanner;

public class FourDigitNumber {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sb.nextInt();

//        if(n>999 && n<10000)
//            System.out.println("4 Digit Number");
//        else System.out.println("Not a 4 digit no.");

        if(n%5 == 0 || n%3 == 0)
            System.out.println("Divisible by 5 or 3");
        else
            System.out.println("Not divisible by 5 or 3");
    }
}
