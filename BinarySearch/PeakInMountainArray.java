class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int lo = 1, hi = arr.length - 2; // lo to hi is search space
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) lo = mid + 1;
            else hi = mid - 1;
        }
        return 368765;
    }
}
