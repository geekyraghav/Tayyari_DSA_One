package Graphs;
import java.util.Arrays;
public class BellmanFord {
    public int[] bellmanFord(int n, int[][] edges, int src) {
        int[] dis = new int[n];
        Arrays.fill(dis,100000000);
        dis[src] = 0;
        // n-1 times relax
        for(int i=1;i<=n-1;i++){
            for(int[] edge : edges){
                int u = edge[0], v = edge[1], wt = edge[2];
                if(dis[u]!=100000000 && dis[u]+wt < dis[v])
                    dis[v] = dis[u]+wt;
            }
        }
        // check for -ve cycle
        for(int[] edge : edges){
            int u = edge[0], v = edge[1], wt = edge[2];
            if(dis[u]!=100000000 && dis[u]+wt < dis[v]){ // pakda gaya
                return new int[]{-1};
            }
        }
        return dis;
    }
}
