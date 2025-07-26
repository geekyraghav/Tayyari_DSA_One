class Solution {
    // Node reverseList(Node head) {
    //     if(head==null || head.next==null) return head;
    //     Node a = head.next;
    //     head.next = null;
    //     Node b = reverseList(a);
    //     a.next = head;
    //     return b;
    // }
    Node reverseList(Node head) {
        Node curr = head;
        Node prev = null;
        Node fwd = null;
        while(curr != null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
    // Node reverseList(Node head) {
    //     Node temp = head;
    //     ArrayList<Node> arr = new ArrayList<>();
    //     while(temp!=null){
    //         arr.add(temp);
    //         temp = temp.next;
    //     }
    //     int n = arr.size();
    //     for(int i=n-1;i>=1;i--){
    //         arr.get(i).next = arr.get(i-1);
    //     }
    //     arr.get(0).next = null;
    //     return arr.get(n-1);
    // }
}
