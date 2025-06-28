class Solution {
    public void transpose(int n, int arr[][]) {
        for(int i=0;i<n;i++){ 
            for(int j=0;j<i;j++){ 
               int temp = arr[i][j];
               arr[i][j] = arr[j][i];
               arr[j][i] = temp;
            }
        }
    }
}
