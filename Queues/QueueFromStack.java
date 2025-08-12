class MyQueue {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> helper = new Stack<>();
    public MyQueue() {
        
    }

    public void push(int x) { // O(n)
        // push at bottom of st
        while(st.size()>0){
            helper.push(st.pop());
        }
        st.push(x);
        while(helper.size()>0){
            st.push(helper.pop());
        }
    }
    
    public int pop() { // O(1)
        return st.pop();
    }
    
    public int peek() { // O(1)
        return st.peek();
    }
    
    // public void push(int x) { // O(1)
    //     st.push(x);
    // }
    
    // public int pop() { // O(n)
    //     // st ka bottom remove karo
    //     while(st.size()>1){
    //         helper.push(st.pop());
    //     }
    //     int front = st.pop();
    //     while(helper.size()>0){
    //         st.push(helper.pop());
    //     }
    //     return front;
    // }
    
    // public int peek() { // O(n)
    //     // st ka bottom print karo
    //     while(st.size()>1){
    //         helper.push(st.pop());
    //     }
    //     int front = st.peek();
    //     while(helper.size()>0){
    //         st.push(helper.pop());
    //     }
    //     return front;
    // }
    
    public boolean empty() {
        return (st.size()==0);
    }
}
