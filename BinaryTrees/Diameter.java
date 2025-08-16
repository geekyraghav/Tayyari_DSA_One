class Solution {
    static int max;
    int diameter(Node root) {
        max = 0;
        levels(root);
        return max;
    }
    int levels(Node root) { // kaam ki cheez
        if(root==null) return 0;
        int leftLevels = levels(root.left);
        int rightLevels = levels(root.right);
        max = Math.max(max,leftLevels + rightLevels); // extra
        return 1 + Math.max(leftLevels,rightLevels);
    }
}
