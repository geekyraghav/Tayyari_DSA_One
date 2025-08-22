class Solution {
    ArrayList<Integer> inOrder(Node root) { // Morris
        ArrayList<Integer> ans = new ArrayList<>();
        Node curr = root;
        while(curr != null){
            if(curr.left != null){
                // find pred and do work
                Node pred = curr.left;
                while(pred.right != null && pred.right != curr)
                    pred = pred.right;
                if(pred.right == null){ // link
                    pred.right = curr;
                    curr = curr.left;
                }
                else{ // pred.right = curr // Unlink & Print
                    pred.right = null;
                    ans.add(curr.data);
                    curr = curr.right;
                }
            }
            else{
                ans.add(curr.data);
                curr = curr.right;
            }
        }
        return ans;
    }
}
