package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class WinnerOfCircularGame {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=n;i++){
            q.add(i);
        }
        while(q.size()>1){
            // k-1 elements remove and add
            for(int i=1;i<=k-1;i++){
                q.add(q.remove());
            }
            q.remove(); // kth will be removed
        }
        return q.peek();
    }
}
