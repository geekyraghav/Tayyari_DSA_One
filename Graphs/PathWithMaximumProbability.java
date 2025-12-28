package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class PathWithMaximumProbability {
    public class Pair implements Comparable<Pair>{
        int node;
        double dist;
        Pair(int node, double dist){
            this.node = node;
            this.dist = dist;
        }
        public int compareTo(Pair p){
            if(this.dist==p.dist) return this.node - p.node;
            return Double.compare(this.dist,p.dist);
        }
    }
    public double maxProbability(int n, int[][] edges, double[] succProb, int src, int des) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0], v = edges[i][1];
            double wt = succProb[i];
            adj.get(u).add(new Pair(v,wt));
            adj.get(v).add(new Pair(u,wt));
        }
        double[] ans = new double[n]; // 0.0 is min probability
        ans[src] = 1;
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder()); // maxheap
        pq.add(new Pair(src,1));
        while(pq.size()>0){
            Pair top = pq.remove();
            int node = top.node;
            double probFromSrc = top.dist;
            if(probFromSrc < ans[node]) continue;
            for(Pair p : adj.get(node)){
                int vertex = p.node;
                double wt = p.dist;
                double totalDist = probFromSrc * wt; // VV IMP
                if(totalDist > ans[vertex]){
                    pq.add(new Pair(vertex,totalDist));
                    ans[vertex] = totalDist;
                }
            }
        }
        return ans[des];
    }

}
