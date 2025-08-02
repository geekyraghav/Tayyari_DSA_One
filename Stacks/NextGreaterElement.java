package Stacks;
import java.util.ArrayList;
import java.util.Stack;

public class NextGreaterElement {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length;
        int[] nge = new int[n];
        nge[n-1] = -1;
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && arr[i]>st.peek()) st.pop();
            if(st.size()==0) nge[i] = -1;
            else nge[i] = st.peek();
            st.push(arr[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            ans.add(nge[i]);
        }
        return ans;
    }
}
