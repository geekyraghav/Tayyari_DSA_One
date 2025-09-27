package DP;

public class LongestCommonSubstring {
    public int longestCommonSubstr(String a, String b) {
        int m = a.length(), n = b.length();
        int[][] dp = new int[m+1][n+1];
        int maxLen = 0;
        for(int i=1;i<=m;i++) {
            for(int j=1;j<=n;j++){
                if(a.charAt(i-1)==b.charAt(j-1)) dp[i][j] = 1 + dp[i-1][j-1];
                else dp[i][j] = 0;
                maxLen = Math.max(maxLen,dp[i][j]);
            }
        }
        return maxLen;
    }

//    static int maxLen;
//    public int longestCommonSubstr(String s1, String s2) {
//        int m = s1.length(), n = s2.length();
//        maxLen = 0;
//        int[][] dp = new int[m][n];
//        for(int i=0;i<m;i++)
//            for(int j=0;j<n;j++)
//                dp[i][j] = -1; // -1 means unvisited
//        LCS(m-1,n-1,new StringBuilder(s1), new StringBuilder(s2), dp);
//        return maxLen;
//    }
//    private int LCS(int i, int j, StringBuilder a, StringBuilder b, int[][] dp) {
//        if(i<0 || j<0) return 0; // there is nothing in common
//        if(dp[i][j]!=-1) return dp[i][j];
//        if(a.charAt(i)==b.charAt(j)){
//            int len = 1 + LCS(i-1,j-1,a,b,dp);
//            maxLen = Math.max(maxLen,len);
//            return dp[i][j] = len;
//        }
//        else{
//            int len = Math.max(LCS(i-1,j,a,b,dp),LCS(i,j-1,a,b,dp));
//            maxLen = Math.max(maxLen,len);
//            return dp[i][j] = 0;
//        }
//    }


}
