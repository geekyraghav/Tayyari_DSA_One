class Solution {
    ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(root.data);
        if(root.left==null && root.right==null) return ans;
        leftBoundary(root.left,ans);
        leafNodes(root,ans);
        rightBoundary(root.right,ans);
        return ans;
    }
    void leftBoundary(Node root, ArrayList<Integer> ans) {
        if(root==null) return;
        if(root.left==null && root.right==null) return;
        ans.add(root.data);
        if(root.left!=null) leftBoundary(root.left,ans);
        else leftBoundary(root.right,ans);
    }
    void leafNodes(Node root, ArrayList<Integer> ans) {
        if(root==null) return;
        if(root.left==null && root.right==null) ans.add(root.data);
        leafNodes(root.left,ans);
        leafNodes(root.right,ans);
    }
    void rightBoundary(Node root, ArrayList<Integer> ans) {
        if(root==null) return;
        if(root.left==null && root.right==null) return;
        if(root.right!=null) rightBoundary(root.right,ans);
        else rightBoundary(root.left,ans);
        ans.add(root.data);
    }
    // void leftBoundary(Node root, ArrayList<Integer> ans) {
    //     while(root!=null){
    //         if(root.left==null && root.right==null) break;
    //         ans.add(root.data);
    //         if(root.left!=null) root = root.left;
    //         else root = root.right;
    //     }
    // }
    // void rightBoundary(Node root, ArrayList<Integer> ans) {
    //     ArrayList<Integer> ans2 = new ArrayList<>();
    //     while(root!=null){
    //         if(root.left==null && root.right==null) break;
    //         ans2.add(root.data);
    //         if(root.right!=null) root = root.right;
    //         else root = root.left;
    //     }
    //     for(int i=ans2.size()-1;i>=0;i--){
    //         ans.add(ans2.get(i));
    //     }
        
    // }
}
