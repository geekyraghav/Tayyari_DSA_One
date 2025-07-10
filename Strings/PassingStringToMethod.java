package Strings;

public class PassingStringToMethod {
    public static void change(String x){
        x = "Utkarsh";
    }
    public static void main(String[] args) {
        String x = "raghav";
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
}
