package Loops;
import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0) n = 9;
        int count = 0;
        while(n != 0){
            n /= 10;
            count++;
        }
        System.out.println(count);
    }
}
