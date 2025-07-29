class Solution {
    public static Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node fwd = null;
        while(curr!=null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
    public static Node reverseBetween(int l, int r, Node head) {
        Node dummy = new Node(-1);
        Node temp = dummy;
        dummy.next = head;
        
        for(int i=1;i<=l-1;i++){
            temp = temp.next;
        }
        Node tail1 = temp;
        Node head2 = temp.next;
    
        for(int i=1;i<=r-l+1;i++){
            temp = temp.next;
        }
        Node tail2 = temp;
        Node head3 = temp.next;
        
        tail1.next = null;
        tail2.next = null;
        
        reverse(head2);
        
        tail1.next = tail2;
        head2.next = head3;
        return dummy.next;
    }
    // public static Node reverseBetween(int a, int b, Node head) {
    //     ArrayList<Node> arr = new ArrayList<>();
    //     Node temp = head;
    //     while(temp!=null){
    //         arr.add(temp);
    //         temp = temp.next;
    //     }
    //     int i = a-1, j = b-1;
    //     while(i<j){
    //         Node t1 = arr.get(i);
    //         Node t2 = arr.get(j);
    //         arr.set(i,t2);
    //         arr.set(j,t1);
    //         i++;
    //         j--;
    //     }
    //     for(i=0;i<arr.size();i++){
    //         arr.get(i).next = (i==arr.size()-1) ? null : arr.get(i+1);
    //     }
    //     return arr.get(0);
    // }
}
