package Graphs;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MinCostToConnectHouses {
    public int minCost(int[][] houses) {
        int n = houses.length;
        boolean[] vis = new boolean[n];
        // PQ<pt,wt>
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1]-b[1]);
        pq.add(new int[]{0,0});
        int sum = 0;
        while(pq.size()>0){
            int[] top = pq.remove();
            int node = top[0], wt = top[1];
            if(vis[node]) continue;
            vis[node] = true;
            sum += wt;
            for(int i=0;i<n;i++){
                if(i==node) continue;
                int dist = Math.abs(houses[node][0]-houses[i][0]) + Math.abs(houses[node][1]-houses[i][1]);
                if(!vis[i]) pq.add(new int[]{i,dist});
            }
        }
        return sum;
    }
}
