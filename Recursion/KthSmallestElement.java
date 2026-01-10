package Recursion;

public class KthSmallestElement {
    public int kthSmallest(int[] arr, int k) {
        return quickSelect(arr,0,arr.length-1,k);
    }

    private int quickSelect(int[] arr, int lo, int hi, int k) {
        int pi = partition(arr,lo,hi); // pi+1 th smallest element
        if(pi+1 == k) return arr[pi];
        else if(pi+1 < k) return quickSelect(arr,pi+1,hi,k);
        else return quickSelect(arr,lo,pi-1,k);
    }

    private int partition(int[] arr, int lo, int hi) {
        int pivot = arr[lo];
        int i = lo+1, j = hi;
        while(i<=j){
            if(arr[i] <= pivot) i++;
            else if(arr[j] > pivot) j--;
            else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap first(lo) with j
        int temp = arr[j];
        arr[j] = arr[lo];
        arr[lo] = temp;
        return j;
    }
}
