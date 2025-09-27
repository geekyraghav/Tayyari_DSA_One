package DP;

import java.util.Arrays;

public class CustomSorting {
    public static void main(String[] args) {
        Integer[] arr = {3,-1,5,2,-7,4,9};
        // Arrays.sort(arr);
        Arrays.sort(arr, (a, b) -> Math.abs(a)-Math.abs(b));
        print(arr);
    }

    private static void print(Integer[] arr) {
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
