class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(-1);
        ListNode even = new ListNode(-1);
        ListNode t1 = odd;
        ListNode t2 = even;
        ListNode t = head;
        while(t!=null){
            t1.next = t;
            t = t.next;
            t1 = t1.next;
            t2.next = t;
            if(t!=null) t = t.next;
            t2 = t2.next;
        }
        t1.next = even.next;
        return odd.next;
    }
}
