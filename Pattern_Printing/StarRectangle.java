package Pattern_Printing;

import java.util.Scanner;

public class StarRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        for(int i=1;i<=row;i++){ // kitni lines hogi
            for(int j=1;j<=col;j++){ // har line me kitna print hoga
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
