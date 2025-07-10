package Recursion;

import java.util.Scanner;

public class OneToN {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        printDecInc(n);
    }
    public static void printDecInc(int n){
        if(n==0) return;
        System.out.print(n+" ");
        printDecInc(n-1);
        if(n!=1) System.out.print(n+" ");
    }
    public static void printNto1(int n){
        if(n==0) return;
        System.out.print(n+" ");
        printNto1(n-1);
    }
    public static void print1toN(int n){
        if(n==0) return;
        print1toN(n-1);
        System.out.print(n+" ");
    }
    public static void print1toNGlobal(int x){
        if(x>n) return;
        System.out.print(x+" ");
        print1toNGlobal(x+1);
    }
    public static void ParameterisedPrint1toN(int x, int n){
        if(x>n) return;
        System.out.println(x);
        ParameterisedPrint1toN(x+1,n);
    }
}
