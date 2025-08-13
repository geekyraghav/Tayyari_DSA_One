class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class Implementation {
    public static void main(String[] args) {
        //        3
        //      /   \
        //     4     2
        //   /   \ /   \
        // -1    1 6    9
        Node a = new Node(3); // root
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        display(a);
        System.out.println();
        System.out.println(size(a));
        System.out.println(sum(a));
        System.out.println(max(a));
    }

    private static int size(Node root) {
        if(root==null) return 0;
        return 1 + size(root.left) + size(root.right);
    }
    private static int sum(Node root) {
        if(root==null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }
    private static int max(Node root) {
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(max(root.left),max(root.right)));
    }

    private static void display(Node root) {
        if(root==null) return;
        System.out.print(root.val+" ");
        display(root.left); // left ki saari values print kar dega ye
        display(root.right); // right ki saari values print kar dega ye
    }
}
