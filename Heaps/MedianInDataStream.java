package Heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

class MedianFinder { // we are creating a DS
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    public MedianFinder() {

    }

    public void addNum(int num) {
        if(maxHeap.size()==0) maxHeap.add(num);
        else{
            if(num<maxHeap.peek()) maxHeap.add(num);
            else minHeap.add(num);
        }
        if(maxHeap.size() == minHeap.size()+2)
            minHeap.add(maxHeap.remove());
        if(minHeap.size() == maxHeap.size()+2)
            maxHeap.add(minHeap.remove());
    }

    public double findMedian() {
        if(maxHeap.size() == minHeap.size()+1)
            return maxHeap.peek();
        else if(minHeap.size() == maxHeap.size()+1)
            return minHeap.peek();
        else
            return (maxHeap.peek() + minHeap.peek())/2.0;
    }
}
public class MedianInDataStream {
    public static void main(String[] args) {

    }
}
