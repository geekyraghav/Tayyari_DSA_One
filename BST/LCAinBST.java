class Solution {
    Node LCA(Node root, Node p, Node q) {
        if(root.data > p.data && root.data > q.data) 
            return LCA(root.left,p,q); 
        else if(root.data < p.data && root.data < q.data) 
            return LCA(root.right,p,q); 
        else return root;
    }
}
