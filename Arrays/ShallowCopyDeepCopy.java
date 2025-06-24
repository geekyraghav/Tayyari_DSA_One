package Arrays;
import java.util.Arrays;
import java.util.Vector;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int a = 4; // 4 bytes leta hai ye
        int[] arr = {10,20,30,40}; // 16 byte
        int[] brr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            brr[i] = arr[i];
        }
        // brr is deep copy
//        int[] x = arr; // x is shallow copy of arr
//        x[0] = 100;
//        int[] y = Arrays.copyOf(arr,arr.length); // deep copy
//        y[0] = 100;
//        System.out.println(y[0]);
//        System.out.println(arr[0]);

    }
}
