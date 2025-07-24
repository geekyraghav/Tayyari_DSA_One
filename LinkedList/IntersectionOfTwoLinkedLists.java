public class Solution {
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        int len1 = 0;
        ListNode temp1 = head1;
        while(temp1 != null){
            temp1 = temp1.next;
            len1++;
        }
        int len2 = 0;
        ListNode temp2 = head2;
        while(temp2 != null){
            temp2 = temp2.next;
            len2++;
        }
        temp1 = head1;
        temp2 = head2;
        if(len1 > len2){ // temp1 ko aage bhejenge
            for(int i=1;i<=len1-len2;i++){
                temp1 = temp1.next;
            }
        }
        else{ // temp2 ko aage bhejenge
            for(int i=1;i<=len2-len1;i++){
                temp2 = temp2.next;
            }
        }
        while(temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }
}
