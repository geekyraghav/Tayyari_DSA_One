class Solution {
    // Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int arr[][]) {
        int n = arr.length;
        // transpose
        for(int i=0;i<n;i++){ 
            for(int j=0;j<i;j++){ 
               int temp = arr[i][j];
               arr[i][j] = arr[j][i];
               arr[j][i] = temp;
            }
        }
        // reverse each column
        for(int col=0;col<n;col++){
            int i=0, j=n-1;
            while(i<j){
                int temp = arr[i][col];
                arr[i][col] = arr[j][col];
                arr[j][col] = temp;
                i++;
                j--;
            }
        }
    }
}
