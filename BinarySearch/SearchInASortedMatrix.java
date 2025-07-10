class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] arr, int tar) {
        int rows = arr.length, cols = arr[0].length;
        int lo = 0, hi = rows*cols-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            int midRow = mid/cols, midCol = mid%cols;
            if(arr[midRow][midCol]==tar) return true;
            else if(arr[midRow][midCol]>tar) hi = mid - 1;
            else lo = mid + 1;
        }
        return false;
    }
}
