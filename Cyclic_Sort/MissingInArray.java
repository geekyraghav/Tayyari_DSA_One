class Solution {
    int missingNum(int arr[]) { 
        int n = 1 + arr.length;  // 1 to n
        int i = 0;
        while(i<arr.length){
            if(arr[i] == i+1 || arr[i] == n) i++;
            else{
                int idx = arr[i] - 1;
                swap(arr,i,idx);
            }
        }
        for(i=0;i<arr.length;i++){
            if(arr[i] != i+1) return i+1;
        }
        return n;
    }

    private void swap(int[] arr, int i, int idx) {
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}
