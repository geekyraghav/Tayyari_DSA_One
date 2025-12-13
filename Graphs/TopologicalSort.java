package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSort {
    public ArrayList<Integer> topoSort(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int[] indegree = new int[n];
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            indegree[v]++;
            // adj.get(v).add(u);
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0) q.add(i);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(q.size()>0){
            int vertex = q.remove();
            ans.add(vertex);
            for(int ele : adj.get(vertex)){
                indegree[ele]--;
                if(indegree[ele]==0) q.add(ele);
            }
        }
        return ans;
    }
}
