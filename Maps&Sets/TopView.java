package Maps_And_Sets;
import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
}
class Pair{
    Node node;
    int dist;
    Pair(Node node, int dist){
        this.node = node;
        this.dist = dist;
    }
}
public class TopView {
    static ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>(); // <horizontal dist,node data>
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));
        int minDist = Integer.MAX_VALUE, maxDist = Integer.MIN_VALUE;
        while(q.size()>0){
            Pair front = q.remove();
            Node node = front.node;
            int dist = front.dist;
            minDist = Math.min(dist,minDist);
            maxDist = Math.max(dist,maxDist);
            if(!map.containsKey(dist)) map.put(dist,node.data); // work
            if(node.left!=null) q.add(new Pair(node.left,dist-1));
            if(node.right!=null) q.add(new Pair(node.right,dist+1));
        }
        for(int i=minDist;i<=maxDist;i++){
            ans.add(map.get(i));
        }
        return ans;
    }
}
