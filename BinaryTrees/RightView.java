class Solution {
    ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        view(root,0,ans);
        return ans;
    }

    private void view(Node root, int level, ArrayList<Integer> ans) {
        if(root==null) return;
        if(level>=ans.size()) ans.add(root.data);
        else ans.set(level,root.data);
        view(root.left,level+1,ans);
        view(root.right,level+1,ans);
    }
}
