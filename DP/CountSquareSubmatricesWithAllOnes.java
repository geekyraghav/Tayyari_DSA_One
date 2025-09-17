package DP;

public class CountSquareSubmatricesWithAllOnes {
    public int countSquares(int N, int M, int arr[][]) {
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i!=0 && j!=0){
                    if(arr[i][j]==1){
                        arr[i][j] += Math.min(arr[i-1][j],Math.min(arr[i-1][j-1],arr[i][j-1]));
                    }
                }
                count += arr[i][j];
            }
        }
        return count;
    }
}
