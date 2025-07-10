package Strings;

public class CompareToStringMethod {
    public static int compareTo(String a, String b){

        return -1;
    }
    public static void main(String[] args) {
        String a = "gitanjali";
        String b = "priya";
//        a = a.concat(b);
        a = a + b;
        System.out.println(a);
        //System.out.println(compareTo(a,b));
    }
}
