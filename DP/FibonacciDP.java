package DP;

public class FibonacciDP {
    public int nthFibonacci(int n) {
        int[] dp = new int[n+1]; // idx from 0 to n
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
//    static int[] dp;
//    public int fibo(int n) {
//        if(n<=1) return n;
//        if(dp[n]!=0) return dp[n]; // extra
//        int ans = fibo(n-1) + fibo(n-2);
//        dp[n] = ans; // extra
//        return ans;
//    }
//    public int nthFibonacci(int n) {
//        dp = new int[n+1]; // idx from 0 to n
//        return fibo(n);
//    }
}
