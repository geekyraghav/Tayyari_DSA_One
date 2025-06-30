class Solution {
    public void setMatrixZeroes(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        // check zeroth row and col pehle
        boolean zerothRow = false;
        for(int j=0;j<n;j++){
            if(arr[0][j]==0){
                zerothRow = true;
                break;
            }
        }
        boolean zerothCol = false;
        for(int i=0;i<m;i++){
            if(arr[i][0]==0){
                zerothCol = true;
                break;
            }
        }
        // travel the sub-matrix and find zeroes
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(arr[i][j]==0){
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }
        // mark rows zero (zeroth col from 1st index)
        for(int i=1;i<m;i++){
            if(arr[i][0]==0){ // mark ith row of arr 0
                for(int j=1;j<n;j++){
                    arr[i][j] = 0;
                }
            }
        }
        // mark cols zero (zeroth row from 1st index)
        for(int j=1;j<n;j++){
            if(arr[0][j]==0){ // mark ith row of arr 0
                for(int i=0;i<m;i++){
                    arr[i][j] = 0;
                }
            }
        }
        if(zerothRow==true){
            for(int j=0;j<n;j++){
                arr[0][j]=0;
            }
        }
        if(zerothCol==true){
            for(int i=0;i<m;i++){
                arr[i][0]=0;
            }
        }
    }
}
