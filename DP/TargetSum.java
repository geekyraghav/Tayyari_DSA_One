package DP;

public class TargetSum {
    static int absSum;
    static int findTargetSumWays(int n, int[] arr, int target) {
        // 140000006 140000002    target = 4
        absSum = 0;
        for(int ele : arr) absSum += Math.abs(ele);
        int[][] dp = new int[arr.length][2*absSum+1];
        return helper(0,0,target,arr,dp);
    }
    // i -> 0 to n-1    sum -> -arrayAbs to arrayAbs  =>  0 to 2*arrayAbs
    static int helper(int i, int sum, int target, int[] arr, int[][] dp) {
        if(i==arr.length){
            if(sum==target) return 1; // 1 valid way
            else return 0;
        }
        if(dp[i][sum+absSum]!=0) return dp[i][sum+absSum];
        int add = helper(i+1,sum+arr[i],target,arr,dp);
        int subtract = helper(i+1,sum-arr[i],target,arr,dp);
        return dp[i][sum+absSum] = add + subtract;
    }
}
