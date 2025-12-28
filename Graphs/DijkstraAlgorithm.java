package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {
    public class Pair implements Comparable<Pair>{
        int node;
        int dist;
        Pair(int node, int dist){
            this.node = node;
            this.dist = dist;
        }
        public int compareTo(Pair p){
            if(this.dist==p.dist) return this.node - p.node;
            return this.dist - p.dist;
        }
    }
    public int[] dijkstra(int n, int[][] edges, int src) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int[] egde : edges){
            int u = egde[0], v = egde[1], wt = egde[2];
            adj.get(u).add(new Pair(v,wt));
            adj.get(v).add(new Pair(u,wt));
        }
        int[] ans = new int[n];
        Arrays.fill(ans,Integer.MAX_VALUE);
        ans[src] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src,0));
        while(pq.size()>0){
            Pair top = pq.remove();
            int node = top.node;
            int distFromSrc = top.dist;
            if(distFromSrc > ans[node]) continue;
            for(Pair p : adj.get(node)){
                int vertex = p.node, wt = p.dist;
                int totalDist = distFromSrc + wt; // VV IMP
                if(totalDist < ans[vertex]){
                    pq.add(new Pair(vertex,totalDist));
                    ans[vertex] = totalDist;
                }
            }
        }
        return ans;
    }
}
