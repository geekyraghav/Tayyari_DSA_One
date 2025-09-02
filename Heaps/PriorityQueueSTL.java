package Heaps;
import java.util.*;
public class PriorityQueueSTL {
    public static void main(String[] args) {
        // Minheap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10); pq.add(20); pq.add(-30);
        System.out.println(pq.peek());
        pq.add(35);
        System.out.println(pq.peek());
        System.out.println(pq.size());
        System.out.println(pq.remove());
        System.out.println(pq.peek());
        System.out.println(pq);

        pq.add(5); pq.add(8); pq.add(2); pq.add(0);
        pq.add(3); pq.add(1); pq.add(7); pq.add(6);

        for(int ele : pq){
            System.out.print(ele+" ");
        }

    }
}
