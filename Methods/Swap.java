package Methods;

import java.util.Scanner;

public class Swap {
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a+" "+b);
        swap(a,b);
        System.out.println(a+" "+b);
    }
}
