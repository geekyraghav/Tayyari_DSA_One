class Solution {
    static int count;
    static int inversionCount(int arr[]) {
        count = 0;
        mergeSort(arr);
        return count;
    }
    private static void mergeSort(int[] arr) {
        int n = arr.length;
        if(n==1) return; 
        int[] a = new int[n/2]; 
        int[] b = new int[n-n/2];
        int idx = 0;
        for(int i=0;i<a.length;i++) a[i] = arr[idx++];
        for(int i=0;i<b.length;i++) b[i] = arr[idx++];
        mergeSort(a); 
        mergeSort(b);
        merge(a,b,arr);
    }
    public static void merge(int[] a, int[] b, int[] c){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) c[k++] = a[i++];
            else{ // a[i] > b[j]
                c[k++] = b[j++];
                count += (a.length - i);
            }
        }
        while(i<a.length) c[k++] = a[i++];
        while(j<b.length) c[k++] = b[j++];
    }
}
