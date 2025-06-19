package Pattern_Printing;

import java.util.Scanner;

public class Bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=2*n-1;i++){
            System.out.print("* ");
        }
        System.out.println();
        int nsp = 1;
        for(int i=1;i<=n-1;i++){ // lines
            for(int j=1;j<=n-i;j++){ // stars
                System.out.print("*"+" ");
            }
            for(int j=1;j<=nsp;j++){ // spaces
                System.out.print(" "+" ");
            }
            for(int j=1;j<=n-i;j++){ // stars
                System.out.print("*"+" ");
            }
            nsp += 2;
            System.out.println();
        }
    }
}
