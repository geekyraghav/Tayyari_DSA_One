package Graphs;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class NumberOfProvinces {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int n) {
        // 0 to n-1 nodes
        int count = 0;
        boolean[] visited = new boolean[n]; // false
        for(int i=0;i<n;i++){
            if(!visited[i]){
                bfs(i,visited,adj);
                count++;
            }
        }
        return count;
    }

    static void bfs(int i, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        visited[i] = true;
        while(q.size()>0){
            int front = q.remove();
            for(int j=0;j<n;j++){
                if(adj.get(front).get(j)==1 && visited[j]==false){
                    q.add(j);
                    visited[j] = true;
                }
            }
        }
    }
}
