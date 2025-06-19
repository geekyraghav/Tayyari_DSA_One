package Loops;
import java.util.Scanner;
public class PowerLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int pow = 1;
        for(int i=1;i<=b;i++){
            pow *= a;
        }
        System.out.println(a+" raised to the power "+b+" is "+pow);
    }
}
