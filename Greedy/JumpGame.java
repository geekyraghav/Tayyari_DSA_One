package Greedy;

public class JumpGame {
    public boolean canJump(int[] arr) {
        int maxPos = 0;
        for(int i=0;i<arr.length;i++){
            if(i>maxPos) return false;
            maxPos = Math.max(maxPos,i+arr[i]);
        }
        return true;
    }
}
