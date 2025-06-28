package MultiDimensionalArrays;

public class InstantInitialise {
    public static void main(String[] args) {
        int[][] arr = {{2,6,3,5},{4,8,0},{2,6,3,7,1}}; // jagged array

        int m = arr.length, n = arr[0].length;
        for(int[] arr1D : arr){
            for(int ele : arr1D){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
    }
}
