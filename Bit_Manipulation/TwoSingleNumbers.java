package BitManipulation;
import java.util.*;
public class TwoSingleNumbers {
    public int[] singleNum(int[] arr) {
        int xor = 0;
        for(int ele : arr){
            xor ^= ele;
        }
        int mask = (xor&(xor-1))^xor; // rightmost setbit mask of xor
        int b1 = 0, b2 = 0;
        for(int ele : arr){
            if((ele&mask)!=0) b1 ^= ele;
            else b2 ^= ele;
        }
        int[] ans = {b1,b2};
        Arrays.sort(ans);
        return ans;
    }
}
