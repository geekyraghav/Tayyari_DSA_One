package OOPS;

import java.util.ArrayList;

class Arraylist{ // user defined data structure
    int[] arr;
    int idx = 0;
    int size = 0;
    Arraylist(int capacity){
        arr = new int[capacity];
    }
    void add(int ele){
        if(idx == arr.length){ // array is full
            capacityIncrease();
        }
        arr[idx] = ele;
        idx++;
        size++;
    }
    void removeFromEnd(){
        idx--;
        size--;
    }
    void remove(int index){
        // complete it
    }
    void add(int index, int val){
        // complete it
    }
    void capacityIncrease(){
        int[] arr2 = new int[arr.length*2];
        for(int i=0;i<arr.length;i++){ // copy paste
            arr2[i] = arr[i];
        }
        arr = arr2;
    }
    int capacity(){
        return arr.length;
    }
    int get(int index){
        return arr[index];
    }
    void set(int index, int val){
        arr[index] = val;
    }
    void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class OwnArrayList {
    public static void main(String[] args) {
        Arraylist arr = new Arraylist(3);
        arr.add(10); arr.add(20); arr.add(30);
        arr.display();
        System.out.println(arr.get(1));
        arr.add(40); arr.add(40); arr.add(40); arr.add(40); arr.add(40);
        arr.display();
    }
}
