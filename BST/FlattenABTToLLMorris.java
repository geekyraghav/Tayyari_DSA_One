class Solution {
    public static void flatten(Node root) { // Morris
        Node curr = root;
        while(curr!=null){
            if(curr.left!=null){ // pred nikal sakta hai
                Node pred = curr.left;
                while(pred.right!=null) pred = pred.right;
                pred.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
                curr = curr.right;
            }
            else curr = curr.right;
        }
    }
}
