package MultiDimensionalArrays;

public class Representation {
    public static void main(String[] args) {
        int[][] arr = new int[4][5]; // total ele - 20
        // rows - 0 to 3  and   cols - 0 to 4
        arr[2][3] = 2;
        arr[0][0] = 7; arr[0][1] = 2; arr[0][2] = 9; arr[0][3] = 5; arr[0][4] = 4;
        for(int i=0;i<=3;i++){
            for(int j=0;j<=4;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int ele : arr[2]){
            System.out.print(ele+" ");
        }
    }
}
