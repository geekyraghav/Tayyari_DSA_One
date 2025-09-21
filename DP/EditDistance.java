package DP;

import java.util.Arrays;

public class EditDistance {
    public int editDistance(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                if(s1.charAt(i)==s2.charAt(j)) dp[i][j] = (i>=1 && j>=1) ? dp[i-1][j-1] : 0;
                else{
                    int replace = 1 + ((i>=1 && j>=1) ? dp[i-1][j-1] : (i==0 ? j+1 : i+1));
                    int remove = 1 + ((i>=1) ? dp[i-1][j] : j+1);
                    int insert = 1 + ((j>=1) ? dp[i][j-1] : i+1);
                    dp[i][j] = Math.min(replace,Math.min(remove,insert));
                }
            }
        }
        return dp[m-1][n-1]; // this is equivalent to edit(m-1,n-1)
    }

//    public int editDistance(String s1, String s2) {
//        int m = s1.length(), n = s2.length();
//        int[][] dp = new int[m][n];
//        for(int i=0;i<m;i++)
//            for(int j=0;j<n;j++)
//                dp[i][j] = -1;
//        return edit(m-1,n-1,new StringBuilder(s1),new StringBuilder(s2),dp);
//    }
//    // i = m-1 to 0  j = n-1 to 0
//    private int edit(int i, int j, StringBuilder s1, StringBuilder s2, int[][] dp) {
//        if(i<0) return j+1; // inserting remaining chars of s2
//        if(j<0) return i+1; // remove extra chars of s1
//        if(dp[i][j]!=-1) return dp[i][j];
//        if(s1.charAt(i)==s2.charAt(j)) return dp[i][j] = edit(i-1,j-1,s1,s2,dp);
//        int replace = 1 + edit(i-1,j-1,s1,s2,dp);
//        int remove = 1 + edit(i-1,j,s1,s2,dp);
//        int insert = 1 + edit(i,j-1,s1,s2,dp);
//        return dp[i][j] = Math.min(replace,Math.min(remove,insert));
//    }
}
