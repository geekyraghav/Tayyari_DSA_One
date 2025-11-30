package Graphs;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        // single BFS lagana hai 0 pe
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        visited[0] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while(q.size()>0){
            int front = q.remove();
            for(int ele : rooms.get(front)){
                if(!visited[ele]){
                    q.add(ele);
                    visited[ele] = true;
                }
            }
        }
        for(boolean flag : visited){
            if(!flag) return false;
        }
        return true;
    }
}
