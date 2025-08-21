class Solution {
    Node lca(Node root, int p, int q) { // TC = O(n)
        if(root==null) return null;
        if(root.data==p || root.data==q) return root;
        Node l = lca(root.left,p,q);
        Node r = lca(root.right,p,q);
        if(l!=null && r!=null) return root;
        return (l==null) ? r : l;
    }
}
