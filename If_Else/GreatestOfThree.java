package If_Else;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter 1st no: ");
        int a = sb.nextInt();
        System.out.print("Enter 2nd no: ");
        int b = sb.nextInt();
        System.out.print("Enter 3rd no: ");
        int c = sb.nextInt();

        if(a>=b){
            if(a>=c) System.out.println(a);
            else // c > a
                System.out.println(c);
        }
        else{ // b > a
            if(b>=c) System.out.println(b);
            else // c > b
                System.out.println(c);
        }
    }
}
