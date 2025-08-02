package Stacks;
import java.util.Stack;
public class BaseBallGame {
    public int calPoints(String[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            String s = arr[i];
            if(s.equals("C")) st.pop();
            else if(s.equals("D")) st.push(2*st.peek());
            else if(s.equals("+")){
                int top = st.pop();
                int secondTop = st.peek();
                int sum = top + secondTop;
                st.push(top);
                st.push(sum);
            }
            else st.push(Integer.parseInt(s));
        }
        int sum = 0;
        while(st.size()>0){
            sum += st.pop();
        }
        return sum;
    }
}
