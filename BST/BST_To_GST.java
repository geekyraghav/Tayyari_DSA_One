class Solution {
    static int sum;
    public static void revInorder(Node root) {
        if(root==null) return;
        revInorder(root.right);
        int val = root.data;
        root.data = sum;
        sum += val;
        revInorder(root.left);
    } // 7 6 3 2 1 -> 0 7 13 16 18
    public static void transformTree(Node root) {
        sum = 0;
        revInorder(root);
    }
    // public static void revInorder(Node root, ArrayList<Node> arr) {
    //     if(root==null) return;
    //     revInorder(root.right,arr);
    //     arr.add(root);
    //     revInorder(root.left,arr);
    // } // 7 6 3 2 1 -> 0 7 13 16 18
    // public static void transformTree(Node root) {
    //     ArrayList<Node> arr = new ArrayList<>();
    //     revInorder(root,arr);
    //     int sum = 0;
    //     for(int i=0;i<arr.size();i++){
    //         int val = arr.get(i).data;
    //         arr.get(i).data = sum;
    //         sum += val;
    //     }
    // }
}
