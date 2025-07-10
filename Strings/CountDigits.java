package Strings;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        String s = "" + n;
        System.out.println(s.length());
    }
}
