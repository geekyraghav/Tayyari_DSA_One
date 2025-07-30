class Solution {
    // Function to reverse a circular linked list
    void reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        Node fwd = null;
        while(curr!=null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
    }
    Node reverse(Node head) {
        Node tail = head;
        while(tail.next!=head) tail = tail.next;
        tail.next = null;
        reverseList(head);
        head.next = tail;
        return tail;
    }

    // Function to delete a node from the circular linked list
    Node deleteNode(Node head, int key) {
        Node tail = head;
        while(tail.next!=head) tail = tail.next;
        tail.next = null;
        if(head.data==key){
            head = head.next;
            tail.next = head;
            return head;
        }
        Node temp = head;
        Node temp2 = head.next;
        while(temp2!=null){
            if(temp2.data == key){
                temp.next = temp2.next;
                break;
            }
            temp = temp.next;
            temp2 = temp2.next;
        }
        tail.next = head;
        return head;
    }
}
