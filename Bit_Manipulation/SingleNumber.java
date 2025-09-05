package BitManipulation;

public class SingleNumber {
    class Solution {
        int getSingle(int arr[]) {
            // 1 1 1 1 2 2 3 3 3
            int xor = 0;
            for(int ele : arr){
                xor = xor ^ ele;
            }
            return xor;
        }
    }
}
