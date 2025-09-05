package BitManipulation;

public class BitwiseAndOrXor {
    public static void main(String[] args) {
        System.out.println(51&42);
        System.out.println(51|42);

        int x = 5;
        System.out.println(~x); // 1s complement
        System.out.println(-x-1); // 1s complement
        System.out.println(~x+1); // 2s complement
        System.out.println(-x); // 2s complement
    }
}
