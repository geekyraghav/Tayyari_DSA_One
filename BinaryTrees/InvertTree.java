class Solution {
    void mirror(Node root) {
        if(root==null) return;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
    }
}
// class Solution { // SPECIAL
//     void mirror(Node root) {
//         if(root==null) return;
//         mirror(root.left);
//         Node temp = root.left;
//         root.left = root.right;
//         root.right = temp;
//         mirror(root.left);
//     }
// }
