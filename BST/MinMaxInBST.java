class Solution {
    // Function to find the minimum element in the given BST.
    int minValue(Node root) {
        Node temp = root;
        while(temp.left!=null) temp = temp.left;
        return temp.data;
    }
    int maxValue(Node root) {
        Node temp = root;
        while(temp.right!=null) temp = temp.right;
        return temp.data;
    }
}
