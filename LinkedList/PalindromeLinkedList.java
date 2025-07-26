class Solution {
    static Node reverse(Node head) {
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
    static boolean isPalindrome(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node head2 = slow.next;
        slow.next = null;
        head2 = reverse(head2);
        
        Node i = head; 
        Node j = head2;
        while(j!=null){
            if(i.data != j.data) return false;
            i = i.next;
            j = j.next;
        }
        return true;
    }
    // static boolean isPalindrome(Node head) {
    //     Node temp = head;
    //     ArrayList<Integer> arr = new ArrayList<>();
    //     while(temp!=null){
    //         arr.add(temp.data);
    //         temp = temp.next;
    //     }
    //     int i = 0, j = arr.size()-1;
    //     while(i<=j){
    //         int a = arr.get(i), b = arr.get(j);
    //         if(a!=b) return false;
    //         i++; 
    //         j--;
    //     }
    //     return true;
    // }
}
