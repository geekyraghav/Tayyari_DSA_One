class Solution {
    public Node sortedArrayToBST(int[] arr) {
        int n = arr.length;
        return convert(arr,0,n-1);
    }
    public Node convert(int[] arr, int lo, int hi) {
        if(lo>hi) return null;
        int mid = (lo+hi)/2;
        Node root = new Node(arr[mid]);
        root.left = convert(arr,lo,mid-1);
        root.right = convert(arr,mid+1,hi);
        return root;
    }
}
