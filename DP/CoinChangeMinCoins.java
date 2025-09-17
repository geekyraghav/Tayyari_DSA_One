package DP;

public class CoinChangeMinCoins {
    public int minCoins(int coins[], int sum) {
        if(sum==0) return 0;
        // 2 20 10 5 1  sum = 14   10+2+2 = 3 coins
        int[][] dp = new int[coins.length][sum+1];
        int ans = helper(0,sum,coins,dp);
        return (ans!=Integer.MAX_VALUE) ? ans : -1;
    }
    // i -> 0 to n-1    sum -> sum to  0
    private int helper(int i, int sum, int[] coins, int[][] dp) {
        if(i==coins.length){
            if(sum==0) return 0; // valid ans
            else return Integer.MAX_VALUE; // invalid ans
        }
        if(dp[i][sum]!=0) return dp[i][sum];
        int skip = helper(i+1,sum,coins,dp);
        if(sum < coins[i]) return dp[i][sum] = skip;
        int take = helper(i,sum-coins[i],coins,dp);
        int pick = (take==Integer.MAX_VALUE) ? take : take + 1;
        return dp[i][sum] = Math.min(skip,pick);
    }
}
