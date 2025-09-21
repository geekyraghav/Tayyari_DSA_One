package DP;

public class LongestCommonSubsequence {
    public static void main(String[] args) { // PRINT LCS
        String a = "anuj";
        String b = "anjum";
        int m = a.length(), n = b.length();
        int[][] dp = new int[m+1][n+1];
        for(int i=1;i<=m;i++) {
            for(int j=1;j<=n;j++){
                if(a.charAt(i-1)==b.charAt(j-1)) dp[i][j] = 1 + dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        // now printing lcs
        StringBuilder ans = new StringBuilder();
        int i = m, j = n;
        while(i>0 && j>0){
            if(a.charAt(i-1)==b.charAt(j-1)){
                ans.append(a.charAt(i-1));
                i--;
                j--;
            }
            else{
                if(dp[i-1][j]>dp[i][j-1]) i--;
                else j--;
            }
        }
        ans.reverse();
        System.out.println(ans);
    }
    static int lcs(String a, String b) { // Tabulation m+1,n+1
        int m = a.length(), n = b.length();
        int[][] dp = new int[m+1][n+1];
        for(int i=1;i<=m;i++) {
            for(int j=1;j<=n;j++){
                if(a.charAt(i-1)==b.charAt(j-1)) dp[i][j] = 1 + dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[m][n];
    }

//    static int lcs(String a, String b) {
//        int m = a.length(), n = b.length();
//        int[][] dp = new int[m][n];
//        for(int i=0;i<m;i++)
//            for(int j=0;j<n;j++)
//                dp[i][j] = -1; // -1 means unvisited
//        return LCS(m-1,n-1,new StringBuilder(a),new StringBuilder(b),dp);
//    }
//    // i -> m-1 to 0     j -> n-1 to 0
//    private static int LCS(int i, int j, StringBuilder a, StringBuilder b, int[][] dp) {
//        if(i<0 || j<0) return 0; // there is nothing in common
//        if(dp[i][j]!=-1) return dp[i][j];
//        if(a.charAt(i)==b.charAt(j)) return dp[i][j] = 1 + LCS(i-1,j-1,a,b,dp);
//        else return dp[i][j] = Math.max(LCS(i-1,j,a,b,dp),LCS(i,j-1,a,b,dp));
//    }

//    static int lcs(String a, String b) { // Tabulation m,n
//        int m = a.length(), n = b.length();
//        int[][] dp = new int[m][n];
//        for(int i=0;i<m;i++) {
//            for(int j=0;j<n;j++){
//                int x = (i-1>=0 && j-1>=0) ? dp[i-1][j-1] : 0;
//                int y = (i-1>=0) ? dp[i-1][j] : 0;
//                int z = (j-1>=0) ? dp[i][j-1] : 0;
//                if(a.charAt(i)==b.charAt(j)) dp[i][j] = 1 + x;
//                else dp[i][j] = Math.max(y,z);
//            }
//        }
//        return dp[m-1][n-1];
//    }
}
