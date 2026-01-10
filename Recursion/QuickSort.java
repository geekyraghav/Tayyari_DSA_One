package Recursion;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {6,3,7,4,9,2,1,5,8};
        quickSort(arr,0,arr.length-1);
        for(int ele : arr) System.out.print(ele+" ");
    }
    public static void quickSort(int[] arr, int lo, int hi) {
        if(lo>=hi) return;
        int pi = partition(arr,lo,hi); // p is pivot index
        quickSort(arr,lo,pi-1);
        quickSort(arr,pi+1,hi);
    }

    private static int partition(int[] arr, int lo, int hi) {
        int pivot = arr[hi];
        int i = lo, j = hi-1;
        while(i<=j){
            if(arr[i] <= pivot) i++;
            else if(arr[j] > pivot) j--;
            else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap last(hi) with i
        int temp = arr[i];
        arr[i] = arr[hi];
        arr[hi] = temp;
        return i;
    }
}
