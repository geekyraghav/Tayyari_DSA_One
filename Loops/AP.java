package Loops;

import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 4,10,16,22,28...
        int a = 4, d = 6;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            a += d;
        }
    }
}
