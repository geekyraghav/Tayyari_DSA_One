package DP;

import java.util.Arrays;

public class LongestBitonicArray {
    public static int LongestBitonicSequence(int n, int[] arr) {
        int[] dp = new int[n]; // LIS left to right
        Arrays.fill(dp,1);
        for(int i=1;i<n;i++){
            int max = 0;
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]){
                    max = Math.max(max,dp[j]);
                }
            }
            dp[i] += max;
        }

        int[] dp2 = new int[n]; // LIS right to left
        Arrays.fill(dp2,1);
        for(int i=n-2;i>=0;i--){
            int max = 0;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    max = Math.max(max,dp2[j]);
                }
            }
            dp2[i] += max;
        }
        int maxLen = 0;
        for(int i=0;i<n;i++){
            if(dp[i]!=1 && dp2[i]!=1)
                maxLen = Math.max(maxLen,dp[i]+dp2[i]-1);
        }
        return maxLen;
    }
}
