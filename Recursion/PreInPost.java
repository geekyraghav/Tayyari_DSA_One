package Recursion;

public class PreInPost {
    public static void main(String[] args) {
        pip(3);
    }
    public static void pip(int n){
        if(n==0) return;
        System.out.print("Pre "+n+" "); // Pre
        pip(n-1);
        System.out.print("In "+n+" "); // In
        pip(n-1);
        System.out.print("Post "+n+" "); // Post
    }
    // 2 1 1 1 2 1 1 1 2
    // 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3
}
