package DP;

public class NumberOfPaths {
    public int numberOfPaths(int m, int n) {
        int[][] dp = new int[m][n]; // rows-> 0 to m, cols-> 0 to n
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0) dp[i][j] = 1;
                else dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
//    static int[][] dp;
//    public int numberOfPaths(int m, int n) {
//        dp = new int[m+1][n+1]; // rows-> 0 to m, cols-> 0 to n
//        return paths(m,n);
//    }
//    public int paths(int m, int n) { // m to 1, n to 1
//        if(m==1 || n==1) return 1;
//        if(dp[m][n]!=0) return dp[m][n];
//        return dp[m][n] = paths(m-1,n) + paths(m,n-1);
//    }
}
