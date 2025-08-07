package Queues;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
public class BasicSTLOfQueues {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10); q.add(20); q.add(30); q.add(40);
        System.out.println(q+" "+q.peek()); // nakli printing
        q.remove();
        System.out.println(q+" "+q.size());
        System.out.println(q.remove()+" "+q);
    }
}
