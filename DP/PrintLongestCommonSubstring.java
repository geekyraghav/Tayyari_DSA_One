package DP;

public class PrintLongestCommonSubstring {
    public String getLongestPal(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        int maxLen = 1;
        for(int i=0;i<n;i++){
            int row = 0;
            for(int col=i;col<n;col++,row++){
                if(row==col) dp[row][col] = 1;
                else if(s.charAt(row)==s.charAt(col)){
                    if(dp[row+1][col-1]!=0) dp[row][col] = dp[row+1][col-1] + 2;
                }
                maxLen = Math.max(maxLen,dp[row][col]);
            }
        }
        String ans = "";
        for(int i=0;i<n;i++){
            int row = 0;
            for(int col=i;col<n;col++,row++){
                if(dp[row][col]==maxLen){
                    ans = s.substring(row,col+1);
                    return ans;
                }
            }
        }
        return ans;
    }
}
