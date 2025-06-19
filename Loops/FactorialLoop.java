package Loops;
import java.util.Scanner;
public class FactorialLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact *= i;
        }
        System.out.println(fact);
    }
}
