package Graphs;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberOfProvincesDSU {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int n) {
        DSU dsu = new DSU(n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(adj.get(i).get(j)==1){ // i to j edge
                    if(dsu.groupLeader(i)!=dsu.groupLeader(j))
                        dsu.union(i,j);
                }
            }
        }
        int count = 0;
        for(int i=0;i<n;i++){
            if(dsu.parent[i]==i) count++;
        }
        return count;
    }

    static class DSU{
        int[] parent;
        private int[] size;
        DSU(int vertices){
            parent = new int[vertices];
            for(int i=0;i<vertices;i++) make(i);
            size = new int[vertices];
            Arrays.fill(size,1);
        }
        void make(int n){
            parent[n] = n;
        }
        int groupLeader(int n){
            if(parent[n]==n) return n;
            return parent[n] = groupLeader(parent[n]);
        }
        void union(int a, int b){
            a = groupLeader(a);
            b = groupLeader(b);
            if(size[a] > size[b]){ // union by size
                parent[b] = a;
                size[a] += size[b];
            }
            else{
                parent[a] = b;
                size[b] += size[a];
            }
        }
    }
}
