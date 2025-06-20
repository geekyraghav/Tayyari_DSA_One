package Methods;

public class ReturnType {
    public static int prasun(int a){
        System.out.println("banu");
        if(a>0) return 5; // khatam
        else return 10;
    }
    public static void main(String[] args) {
        int x = prasun(7);
        System.out.println(3+x);
        //prasun(); // stand alone call lagayi bas
    }
}
