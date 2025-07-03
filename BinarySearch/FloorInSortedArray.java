class Solution {
    static int findFloor(int[] arr, int tar) {
        int lo = 0, hi = arr.length - 1, idx = -1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]>tar) hi = mid - 1;
            else{ // arr[mid] <= x
                idx = mid;
                lo = mid + 1;
            }
        }
        return idx;
    }
}
