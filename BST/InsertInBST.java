class Solution {
    Node insert(Node root, int key) {
        if(root==null) return new Node(key);
        if(root.data < key){ // RST me attach karke aao
            root.right = insert(root.right,key);
        } 
        else if(root.data > key){ // LST me attach karke aao
            root.left = insert(root.left,key);
        } 
        return root;
    }
}
