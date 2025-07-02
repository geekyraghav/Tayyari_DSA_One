class Solution {
    public static int kthSmallest(int[] arr, int k) {
        int n = arr.length;
        // TC = O(n*k)
        for(int i=0;i<k;i++) { // n-1 passes
            int min = Integer.MAX_VALUE, mindx = -1;
            for(int j=i;j<n;j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    mindx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }
        return arr[k-1];
    }
}
