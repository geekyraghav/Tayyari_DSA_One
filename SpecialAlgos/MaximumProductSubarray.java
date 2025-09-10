package SpecialAlgos;

public class MaximumProductSubarray {
    int maxProduct(int[] arr) {
        int pro = 1, maxPro = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){ // left to right
            if(arr[i]==0){
                pro = 1;
                if(maxPro<0) maxPro = 0;
            }
            else{
                pro *= arr[i];
                maxPro = Math.max(maxPro,pro);
            }
        }
        pro = 1;
        for(int i=arr.length-1;i>=0;i--){ // right to left
            if(arr[i]==0){
                pro = 1;
                if(maxPro<0) maxPro = 0;
            }
            else{
                pro *= arr[i];
                maxPro = Math.max(maxPro,pro);
            }
        }
        return maxPro;
    }
}
