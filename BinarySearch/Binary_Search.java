class Solution {
    static boolean searchInSorted(int arr[], int tar) {
        int lo = 0, hi = arr.length - 1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]>tar) hi = mid - 1;
            else if(arr[mid]<tar) lo = mid + 1;
            else return true;
        }
        return false;
    }
}
