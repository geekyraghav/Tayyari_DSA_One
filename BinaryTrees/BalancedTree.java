class Solution {
    static boolean flag;
    public boolean isBalanced(Node root) {
        if(root==null) return true;
        flag = true; 
        levels(root);
        return flag;
    }
    
    private int levels(Node root) { // kaam ki cheez
        if(root==null) return 0;
        int leftLevels = levels(root.left);
        int rightLevels = levels(root.right);
        if(Math.abs(leftLevels-rightLevels) > 1) flag = false;
        return 1 + Math.max(leftLevels,rightLevels);
    }
}
