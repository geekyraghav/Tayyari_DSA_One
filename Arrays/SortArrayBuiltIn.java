package Arrays;
import java.util.Arrays;
public class SortArrayBuiltIn {
    public static void main(String[] args) {
        // sort - ascending order
        int[] arr = {4,1,7,5,-3,10,2};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
