package MultiDimensionalArrays;

public class FindRowWithMaxSum {
    public static void main(String[] args) {
        int[][] arr = {{2,6,3,15,12},
                      {4,8,0,16,2},
                      {2,6,13,70,1}};
        int m = arr.length, n = arr[0].length;
        snake(arr);
        // printColWise(arr);
        int maxSum = Integer.MIN_VALUE;
        int maxRow = -1;
        for(int i=0;i<m;i++){
            int sum = 0;
            for(int j=0;j<n;j++){
                sum += arr[i][j];
            }
            if(sum > maxSum){
                maxSum = sum;
                maxRow = i;
            }
        }
        //System.out.println(maxSum+" "+maxRow);
    }

    public static void printColWise(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        for(int j=0;j<n;j++){ // cols
            for(int i=0;i<m;i++){ // rows
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void snake(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        for(int i=0;i<m;i++){
            if(i%2 == 0){
                for(int j=0;j<n;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int j=n-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}
