class MyStack {
    Queue<Integer> q = new LinkedList<>();
    public MyStack() {
        
    }

    public void push(int x) { //  O(n)
        // q ke front pe add karna
        q.add(x);
        int n = q.size();
        for(int i=1;i<=n-1;i++){
            q.add(q.remove());
        }
    }
    
    public int pop() { //  O(1)
        return q.remove();
    }
    
    public int top() { //  O(1)
        return q.peek();
    }
    
    // public void push(int x) { //  O(1)
    //     q.add(x);
    // }
    
    // public int pop() { //  O(n)
    //     int n = q.size();
    //     for(int i=1;i<=n-1;i++){
    //         q.add(q.remove());
    //     }
    //     return q.remove();
    // }
    
    // public int top() { //  O(n)
    //     int n = q.size();
    //     for(int i=1;i<=n-1;i++){
    //         q.add(q.remove());
    //     }
    //     int p = q.peek();
    //     q.add(q.remove()); // imp
    //     return p;
    // }
    
    public boolean empty() {
        return (q.size()==0);
    }
}
