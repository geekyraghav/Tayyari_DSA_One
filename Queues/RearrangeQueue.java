class Solution {
    public Queue<Integer> rearrangeQueue(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        int n = q.size();
        for(int i=1;i<=n/2;i++){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        for(int i=1;i<=n/2;i++){
            st.push(q.remove());
        }
        
        // re arrangement
        while(st.size()>0){
            q.add(st.pop());
            q.add(q.remove());
        }
        
        // reverse the q
        while(q.size()>0){
            st.push(q.pop());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        return q;
    }
}
