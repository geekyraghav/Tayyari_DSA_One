package DP;

public class Derangements {
    static int countDer(int n) {
        if(n<=3) return n-1;
        return (n-1)*(countDer(n-1)+countDer(n-2));
    }
}
