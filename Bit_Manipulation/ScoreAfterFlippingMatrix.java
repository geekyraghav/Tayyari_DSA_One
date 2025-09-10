package BitManipulation;

public class ScoreAfterFlippingMatrix {
    public int matrixScore(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        // 0th col of matrix should have all ones
        for(int i=0;i<m;i++){
            if(arr[i][0]==0){ // flip that row
                for(int j=0;j<n;j++){
                    arr[i][j] = 1 - arr[i][j];
                }
            }
        }
        // har us col ko flip karo jisme no of 0 > no of 1
        for(int j=0;j<n;j++){
            int zeros = 0, ones = 0;
            for(int i=0;i<m;i++){
                if(arr[i][j]==0) zeros++;
                else ones++;
            }
            if(zeros>ones){ // flip that col
                for(int i=0;i<m;i++){
                    arr[i][j] ^= 1;
                }
            }
        }
        int sum = 0;
        int pow = 1;
        for(int j=n-1;j>=0;j--){
            int ones = 0;
            for(int i=0;i<m;i++){
                if(arr[i][j]==1) ones++;
            }
            sum += pow*ones;
            pow *= 2;
        }
        return sum;
    }
}
