package Stacks;
import java.util.Deque;
import java.util.LinkedList;
public class DequeSTL {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addLast(10); dq.addLast(20); dq.addLast(30);
        System.out.println(dq);
        // System.out.println(dq.getLast()+" "+ dq.getFirst());
        dq.removeLast();
        dq.addFirst(40);
        System.out.println(dq);
        print(dq);
    }

    private static void print(Deque<Integer> dq) {
        int n = dq.size();
        for(int i=1;i<=n;i++){
            System.out.print(dq.getFirst()+" ");
            dq.addLast(dq.removeFirst());
        }
        System.out.println();
    }
}
