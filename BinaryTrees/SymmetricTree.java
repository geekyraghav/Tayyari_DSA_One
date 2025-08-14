class Solution {
    public boolean isSymmetric(Node root) {
        mirror(root.left);
        return isIdentical(root.left,root.right);
    }
    boolean isIdentical(Node p, Node q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.data != q.data) return false;
        return isIdentical(p.left,q.left) && isIdentical(p.right,q.right);
    }
    void mirror(Node root) {
        if(root==null) return;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
    }
}
