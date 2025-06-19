package Pattern_Printing;
import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n-1, nst = 1;
        for(int i=1;i<=n;i++){ // lines
            for(int j=1;j<=nsp;j++){ // spaces
                System.out.print(" "+" ");
            }
            for(int j=1;j<=nst;j++){ // stars
                System.out.print("*"+" ");
            }
            nsp--;
            nst += 2;
            System.out.println();
        }
    }
}
