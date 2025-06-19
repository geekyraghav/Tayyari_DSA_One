package Pattern_Printing;

import java.util.Scanner;

public class TriangleFlippedVertically {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                if(i+j > n) System.out.print(j+" ");
//                else System.out.print("  ");
//            }
//            System.out.println();
//        }
        for(int i=1;i<=n;i++){ // lines
            for(int j=1;j<=n-i;j++){ // spaces
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){ // stars
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
