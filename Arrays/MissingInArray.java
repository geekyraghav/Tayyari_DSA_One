class Solution {
    int missingNum(int arr[]) {
        long n = arr.length + 1; // 1 to n tak numbers honge arr me
        long sum = n*(n+1)/2;
        long arraySum = 0;
        for(int ele : arr){
            arraySum += ele;
        }
        return (int)(sum - arraySum);
    }
}
