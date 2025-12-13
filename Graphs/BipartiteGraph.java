package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BipartiteGraph {
    public boolean isBipartite(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int[] vis = new int[n]; // 1 is green, 2 is red, 0 is uncolored
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                if(!bfs(i,vis,adj)) return false;
            }
        }
        return true;
    }
    private boolean bfs(int src, int[] vis, ArrayList<ArrayList<Integer>> adj) {
        vis[src] = 1;
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        while(q.size()>0){
            int vertex = q.remove();
            int color = vis[vertex];
            for(int ele : adj.get(vertex)){
                if(vis[ele]==0){
                    q.add(ele);
                    vis[ele] = 3-color;
                }
                else if(vis[ele]==color) return false;
            }
        }
        return true;
    }
}
