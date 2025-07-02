class Solution {
    boolean twoSum(int arr[], int target) {
        Arrays.sort(arr); // time = nlogn , space = n
        int i=0,j=arr.length-1;
        while(i<j){ // time = n
            if(arr[i]+arr[j]==target) return true;
            else if(arr[i]+arr[j]>target) j--;
            else if(arr[i]+arr[j]<target) i++;
        }
        return false;
    }
}
