class Solution {
    public static void flatten(Node root) {
        if(root==null) return;
        Node lst = root.left;
        Node rst = root.right;
        root.left = null;
        // root.right = null;
        flatten(lst);
        flatten(rst);
        root.right = lst;
        Node last = root; // ye lst ka last element hoga
        while(last.right!=null) last = last.right;
        last.right = rst;
    }

    // public static void flatten(Node root) {
    //     ArrayList<Node> arr = new ArrayList<>();
    //     dfs(root,arr);
    //     for(int i=0;i<arr.size()-1;i++){
    //         Node a = arr.get(i);
    //         Node b = arr.get(i+1);
    //         a.right = b;
    //         a.left = null;
    //     }
    //     Node last = arr.get(arr.size()-1);
    //     last.left = null;
    //     last.right = null;
    // }

    // private static void dfs(Node root, ArrayList<Node> arr) {
    //     if(root==null) return;
    //     arr.add(root);
    //     dfs(root.left,arr);
    //     dfs(root.right,arr);
    // }
}
