class Solution {
    public static boolean detectLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) return true;
        }
        return false;
    }
    // public static boolean detectLoop(Node head) {
    //     Node slow = head;
    //     Node fast = head;
    //     while(fast!=null && fast.next!=null && fast.next.next!=null){
    //         slow = slow.next;
    //         fast = fast.next.next.next;
    //         if(fast == slow) return true;
    //     }
    //     return false;
    // }
}
