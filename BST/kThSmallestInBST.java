class Solution {
    static int ans;
    static int k2;
    public void inorder(Node root) {
        if(root==null) return;
        inorder(root.left);
        k2--;
        if(k2==0) ans = root.data;
        inorder(root.right);
    }
    public int kthSmallest(Node root, int k) {
        k2 = k;
        ans = -1;
        inorder(root);
        return ans;
    }
}
