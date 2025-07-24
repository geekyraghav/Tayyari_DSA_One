class Solution {
    int getKthFromLast(Node head, int k) {
        Node slow = head;
        Node fast = head;
        // fast ko k steps aage le jaao
        for(int i=1;i<=k;i++){
            if(fast==null) return -1;
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }
}
