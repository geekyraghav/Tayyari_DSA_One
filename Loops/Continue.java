package Loops;

public class Continue {
    public static void main(String[] args) {
        for(int i=1;i<=20;i++){
            System.out.println(i);
            if(i==13) continue;
            System.out.println("Good Morning");
        }
    }
}
