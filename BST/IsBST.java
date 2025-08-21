class Triplet{
    int max;
    int min;
    boolean isBST;
    Triplet(int max, int min, boolean isBST){
        this.max = max;
        this.min = min;
        this.isBST = isBST;
    }
}
class Solution {
    boolean isBST(Node root) {
        return maxMin(root).isBST;
    }
    Triplet maxMin(Node root){
        if(root==null) return new Triplet(Integer.MIN_VALUE,Integer.MAX_VALUE,true);
        Triplet lst = maxMin(root.left);
        Triplet rst = maxMin(root.right);
        int max = Math.max(root.data,Math.max(lst.max,rst.max));
        int min = Math.min(root.data,Math.min(lst.min,rst.min));
        boolean isBST = lst.isBST && rst.isBST && (lst.max < root.data) && (rst.min > root.data); 
        return new Triplet(max,min,isBST);
    }
}
