class Solution {
    public Node deepCopy(Node head1) {
        Node temp1 = head1;
        Node head2 = new Node(-1);
        Node temp2 = head2;
        while(temp1!=null){
            Node t = new Node(temp1.val);
            temp2.next = t;
            temp2 = temp2.next;
            temp1 = temp1.next;
        }
        return head2.next;
    }
    public void merge(Node head1, Node head2) {
        Node dummy = new Node(-1);
        Node temp = dummy;
        Node temp1 = head1;
        Node temp2 = head2;
        while(temp2!=null){
            temp.next = temp1;
            temp1 = temp1.next;
            temp = temp.next;

            temp.next = temp2;
            temp2 = temp2.next;
            temp = temp.next;
        }
    }
    public void randomConnections(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;
        while(temp1!=null && temp2!=null){
            if(temp1.random==null) temp2.random = null;
            else temp2.random = temp1.random.next; // main cheez
            temp1 = temp1.next.next;
            if(temp2.next!=null) temp2 = temp2.next.next;
        }
    }
    public void split(Node head1) {
        Node dummy1 = new Node(-1);
        Node temp1 = dummy1;
        Node dummy2 = new Node(-1);
        Node temp2 = dummy2;
        Node temp = head1; // merged list pe traverse
        
        while(temp!=null){
            temp1.next = temp;
            temp = temp.next;
            temp1 = temp1.next;

            temp2.next = temp;
            temp = temp.next;
            temp2 = temp2.next;
        }
        temp1.next = null;
    }
    public Node copyRandomList(Node head1) {
        // Step 1 : Creating deep copy without random
        Node head2 = deepCopy(head1);
        // Step 2 : Alternatively connecting lists
        merge(head1,head2);
        // Step 3 : Assigning Random Pointer
        randomConnections(head1,head2);
        // Step 4 : Split the list
        split(head1);
        return head2;
    }
}
