package Recursion;

public class GlobalVariables {
    static int x = 10;
    public static void main(String[] args) {
//        fun();
        x = 9; // change
        System.out.println(x);
        int x = 4; // local variable dec and ini
        System.out.println(x);
        x = 6;
    }
    public static void fun(){
        x = 20;
        int x = 6;
    }
}
