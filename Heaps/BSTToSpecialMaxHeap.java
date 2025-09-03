package Heaps;
import java.util.ArrayList;
import java.util.Arrays;
public class BSTToSpecialMaxHeap {
    static int idx;
    public static void convertToMaxHeapUtil(Node root) {
        idx = 0;
        ArrayList<Integer> in = new ArrayList<>();
        inorder(root,in);
        postorder(root,in);
    }

    private static void postorder(Node root, ArrayList<Integer> in) {
        if(root==null) return;
        postorder(root.left,in);
        postorder(root.right,in);
        root.data = in.get(idx++);
    }

    private static void inorder(Node root, ArrayList<Integer> in) {
        if(root==null) return;
        inorder(root.left,in);
        in.add(root.data);
        inorder(root.right,in);
    }
}
