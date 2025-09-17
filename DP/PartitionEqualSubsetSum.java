package DP;

public class PartitionEqualSubsetSum {
    static boolean equalPartition(int arr[]) {
        int arraySum = 0;
        for(int ele : arr) arraySum += ele;
        if(arraySum%2 == 1) return false;
        int sum = arraySum/2;
        Boolean[][] dp = new Boolean[arr.length][sum+1];
        return partition(0,sum,arr,dp);
    }

    static boolean partition(int i, int sum, int[] arr, Boolean[][] dp) {
        if(i==arr.length){
            if(sum==0) return true;
            else return false;
        }
        if(dp[i][sum]!=null) return dp[i][sum];
        boolean skip = partition(i+1,sum,arr,dp);
        if(sum < arr[i]) return dp[i][sum] = skip;
        boolean pick = partition(i+1,sum-arr[i],arr,dp);
        return dp[i][sum] = (pick || skip);
    }

}
