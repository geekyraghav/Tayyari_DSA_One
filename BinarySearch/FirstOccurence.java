class Solution {
    public int binarysearch(int[] arr, int tar) {
        // Code Here
        int lo = 0, hi = arr.length - 1, idx = -1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]>tar) hi = mid - 1;
            else if(arr[mid]<tar) lo = mid + 1;
            else{ // arr[mid] == tar
                idx = mid;
                hi = mid - 1;
            }
        }
        return idx;
    }
}
