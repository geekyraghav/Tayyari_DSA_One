package MultiDimensionalArrays;

import java.util.ArrayList;

public class ArrayListMulti {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(100); a1.add(210); a1.add(130);
        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(5); a2.add(63);
        ArrayList<Integer> a3 = new ArrayList<>();
        a3.add(1000);
        arr.add(a1); arr.add(a2); arr.add(a1); arr.add(a3);
        System.out.println(arr);
        a1.remove(a1.size()-1);
        a2.add(90);
        System.out.println(arr);

        arr.get(0).set(1,910);
        System.out.println(arr);
    }
}
