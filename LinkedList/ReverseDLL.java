class Solution {
    public DLLNode reverseDLL(DLLNode head) {
        if(head.next==null) return head;
        DLLNode temp = null;
        DLLNode curr = head;
        while(curr!=null){
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp; 
            curr = curr.prev; // aage leke jaa rahe hai
        }
        return temp.prev;
    }
    // public DLLNode reverseDLL(DLLNode head) {
    //     DLLNode pre = null;
    //     DLLNode curr = head;
    //     DLLNode fwd = null;
    //     while(curr!=null){
    //         fwd = curr.next;
    //         curr.next = pre;
    //         curr.prev = fwd; // added line
    //         pre = curr;
    //         curr = fwd;
    //     }
    //     return pre;
    // }
}
