package Maps_And_Sets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

//class Pair{
//    Node node;
//    int dist;
//    Pair(Node node, int dist){
//        this.node = node;
//        this.dist = dist;
//    }
//}
public class BurningTree {
    static Node start;
    static HashMap<Node,Node> parent;
    public static int minTime(Node root, int target) {
        start = null;
        parent = new HashMap<>();
        dfs(root,target);
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(start,0));
        HashSet<Node> burned = new HashSet<>();
        burned.add(start);
        int time = 0;
        while(q.size()>0){
            Pair front = q.remove();
            int dist = front.dist;
            time = Math.max(time,dist); // special
            Node node = front.node;
            if(node.left!=null && !burned.contains(node.left)){
                q.add(new Pair(node.left,dist+1));
                burned.add(node.left);
            }
            if(node.right!=null && !burned.contains(node.right)){
                q.add(new Pair(node.right,dist+1));
                burned.add(node.right);
            }
            if(parent.containsKey(node) && !burned.contains(parent.get(node))){
                q.add(new Pair(parent.get(node),dist+1));
                burned.add(parent.get(node));
            }
        }
        return time;
    }

    private static void dfs(Node root, int target) {
        if(root==null) return;
        if(root.data==target) start = root;
        if(root.left!=null) parent.put(root.left,root);
        if(root.right!=null) parent.put(root.right,root);
        dfs(root.left,target);
        dfs(root.right,target);
    }
}
