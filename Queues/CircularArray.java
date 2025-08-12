package Queues;
class CircularQueue{
    private int[] arr;
    private int f;
    private int r;
    private int size;
    CircularQueue(int capacity){
        arr = new int[capacity];
    }
    void add(int val){
        if(size==arr.length){
            System.out.println("Queue is FULL!");
            return;
        }
        arr[r++] = val;
        if(r==arr.length) r = 0;
        size++;
    }
    int remove(){
        if(size==0){
            System.out.println("Queue is EMPTY!");
            return -1;
        }
        int frontVal = arr[f];
        f++;
        if(f==arr.length) f = 0;
        size--;
        return frontVal;
    }
    int peek(){
        if(size==0){
            System.out.println("Queue is EMPTY!");
            return -1;
        }
        return arr[f];
    }
    void display(){
        if(size==0) return;
        if(f>=r){
            for(int i=f;i<arr.length;i++){ // front to end
                System.out.print(arr[i]+" ");
            }
            for(int i=0;i<r;i++){ // start to rear-1
                System.out.print(arr[i]+" ");
            }
        }
        else{
            for(int i=f;i<r;i++){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
}
public class CircularArray {
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(4);
        q.add(10); q.add(20); q.add(30);
        q.display();
        System.out.println(q.remove());
        q.display();
        q.add(40); q.add(50);
        q.display();
//        int[] a = q.arr;
//        for(int ele : a) System.out.print(ele+" ");
    }
}
