package SpecialAlgos;

public class MaximumSubarraySum {
    int maxSubarraySum(int[] arr) {
        // [2, 3, -8, 7, -1, 2, 3]
        int sum = 0, maxSum = Integer.MIN_VALUE;
        for(int ele : arr){
            sum += ele;
            maxSum = Math.max(maxSum,sum);
            if(sum<0) sum = 0;
        }
        return maxSum;
    }
}
