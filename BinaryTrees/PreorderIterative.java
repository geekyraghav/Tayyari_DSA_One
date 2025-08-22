class Solution {
    public ArrayList<Integer> preorder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(st.size()>0){
            Node top = st.pop();
            ans.add(top.data);
            if(top.right!=null) st.push(top.right);
            if(top.left!=null) st.push(top.left);
        }
        return ans;
    }
}
