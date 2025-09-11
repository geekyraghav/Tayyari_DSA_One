package DP;
import java.util.*;
public class VivekTheRobber {
    static int[] dp;
    public int findMaxSum(int arr[]) {
        int n = arr.length;
        dp = new int[n]; // 0 to n-1
        Arrays.fill(dp,-1); // mark
        return loot(0,arr);
    }

    private int loot(int i, int[] arr) { // i -> 0 to n-1
        if(i>=arr.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int pick = arr[i] + loot(i+2,arr);
        int skip = loot(i+1,arr);
        return dp[i] = Math.max(pick,skip);
    }
}
