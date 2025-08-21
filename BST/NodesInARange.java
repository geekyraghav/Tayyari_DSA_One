class Solution { 
    int getCount(Node root, int l, int h) {
        if(root==null) return 0;
        if(root.data < l) return getCount(root.right,l,h);
        else if(root.data > h) return getCount(root.left,l,h);
        else // l <= root.data <= h
            return 1 + getCount(root.left,l,h) + getCount(root.right,l,h);
    }
}
