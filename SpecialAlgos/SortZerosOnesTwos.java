package SpecialAlgos;

public class SortZerosOnesTwos {
//    public void sort012(int[] arr) { // 2 pass solution
//        int zeros = 0, ones = 0;
//        for(int ele : arr){
//            if(ele==0) zeros++;
//            if(ele==1) ones++;
//        }
//        for(int i=0;i<zeros;i++){
//            arr[i] = 0;
//        }
//        for(int i=zeros;i<zeros+ones;i++){
//            arr[i] = 1;
//        }
//        for(int i=zeros+ones;i<arr.length;i++){
//            arr[i] = 2;
//        }
//    }
    public void sort012(int[] arr) { // 1 pass solution
        int lo = 0, mid = 0, hi = arr.length-1;
        while(mid<hi){
            if(arr[mid]==0){
                arr[mid] = arr[lo];
                arr[lo] = 0;
                lo++;
                mid++;
            }
            else if(arr[mid]==1) mid++;
            else{ // arr[mid]==2
                arr[mid] = arr[hi];
                arr[hi] = 2;
                hi--;
            }
        }
    }
}
