package Graphs;
import java.util.Arrays;
class DSU{
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
public class DSU_Implementation {
    public static void main(String[] args) {
        DSU dsu = new DSU(6);
        dsu.union(0,1);
        dsu.union(2,3);
        System.out.println(dsu.groupLeader(3));
        dsu.union(0,2);
        //     0
        //  1     2
        //        3
        System.out.println(dsu.groupLeader(3));
    }
}
