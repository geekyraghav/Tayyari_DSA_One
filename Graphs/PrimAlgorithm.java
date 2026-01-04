package Graphs;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimAlgorithm {
    public int spanningTree(int n, int[][] edges) {
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int[] edge : edges){
            int u = edge[0], v = edge[1], wt = edge[2];
            adj.get(u).add(new int[]{v,wt});
            adj.get(v).add(new int[]{u,wt});
        }
        boolean[] vis = new boolean[n];
        // PQ<Node,Parent,wt>
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[2]-b[2]);
        pq.add(new int[]{0,-1,0});
        int sum = 0;
        while(pq.size()>0){
            int[] top = pq.remove();
            int node = top[0], parent = top[1], wt = top[2];
            if(vis[node]) continue;
            vis[node] = true;
            sum += wt;
            for(int[] pair : adj.get(node)){
                int v = pair[0], w = pair[1];
                if(!vis[v]) pq.add(new int[]{v,node,w});
            }
        }
        return sum;
    }
}
