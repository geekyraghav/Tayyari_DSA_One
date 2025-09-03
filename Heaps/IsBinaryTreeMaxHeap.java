package Heaps;
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
public class IsBinaryTreeMaxHeap {
    static int s;
    boolean isHeap(Node root) {
        s = size(root);
        return isMaxHeap(root) && isCBT(root,1);
    }

    private int size(Node root) {
        if(root==null) return 0;
        return 1 + size(root.left) + size(root.right);
    }

    private boolean isCBT(Node root, int idx) {
        if(root==null) return true;
        if(idx>s) return false;
        return isCBT(root.left,2*idx) && isCBT(root.right,2*idx+1);
    }

    private boolean isMaxHeap(Node root) {
        if(root==null) return true;
        int leftVal = (root.left != null) ? root.left.data : Integer.MIN_VALUE;
        int rightVal = (root.right != null) ? root.right.data : Integer.MIN_VALUE;
        if(root.data <= leftVal || root.data <= rightVal) return false;
        return isMaxHeap(root.left) && isMaxHeap(root.right);
    }
}
