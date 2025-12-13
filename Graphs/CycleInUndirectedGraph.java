package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CycleInUndirectedGraph {
    public class Pair{
        int vertex;
        int parent;
        Pair(int vertex, int parent){
            this.vertex = vertex;
            this.parent = parent;
        }
    }
    public boolean isCycle(int n, int[][] edges) {
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
        boolean[] vis = new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                if(bfs(i,vis,adj)) return true;
            }
        }
        return false;
    }

    private boolean bfs(int src, boolean[] vis, ArrayList<ArrayList<Integer>> adj) {
        vis[src] = true;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(src,-1));
        while(q.size()>0){
            Pair front = q.remove();
            int vertex = front.vertex, parent = front.parent;
            for(int ele : adj.get(vertex)){
                if(!vis[ele]){
                    q.add(new Pair(ele,vertex));
                    vis[ele] = true;
                }
                else if(ele!=parent) return true;
            }
        }
        return false;
    }
}
