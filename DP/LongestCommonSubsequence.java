package DP;

public class LongestCommonSubsequence {
    static int lcs(String a, String b) {
        int m = a.length(), n = b.length();
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                dp[i][j] = -1; // -1 means unvisited
        return LCS(m-1,n-1,new StringBuilder(a),new StringBuilder(b),dp);
    }
    // i -> m-1 to 0     j -> n-1 to 0
    private static int LCS(int i, int j, StringBuilder a, StringBuilder b, int[][] dp) {
        if(i<0 || j<0) return 0; // there is nothing in common
        if(dp[i][j]!=-1) return dp[i][j];
        if(a.charAt(i)==b.charAt(j)) return dp[i][j] = 1 + LCS(i-1,j-1,a,b,dp);
        else return dp[i][j] = Math.max(LCS(i-1,j,a,b,dp),LCS(i,j-1,a,b,dp));
    }
}
