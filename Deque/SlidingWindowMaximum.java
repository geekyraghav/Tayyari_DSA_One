package Stacks;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
public class SlidingWindowMaximum {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            while(dq.size()>0 && dq.getFirst() <= i-k){ // Out of Window
                dq.removeFirst();
            }
            while(dq.size()>0 && arr[dq.getLast()] <= arr[i]){ // Removing Smaller values
                dq.removeLast();
            }
            dq.addLast(i);
            if(i >= k-1) ans.add(arr[dq.getFirst()]);
        }
        return ans;
    }
}
