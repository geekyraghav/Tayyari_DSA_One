package DP;

import java.util.*;

public class LargestDivisibleSubset {
    public ArrayList<Integer> largestSubset(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int[] dp = new int[n]; // LIS right to left
        Arrays.fill(dp,1);
        int maxLen = 1;
        for(int i=n-2;i>=0;i--){
            int max = 0;
            for(int j=i+1;j<n;j++){
                if(arr[j] % arr[i] == 0){
                    max = Math.max(max,dp[j]);
                }
            }
            dp[i] += max;
            maxLen = Math.max(maxLen,dp[i]);
        }
        int idx = 0;
        for(int i=0;i<n;i++){
            if(dp[i]==maxLen){
                idx = i;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr[idx]);
        maxLen--;
        idx++;
//        while(idx<n){
//            if()
//        }
        return ans;
    }
}
