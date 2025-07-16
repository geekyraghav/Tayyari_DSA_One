package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        hanoi(5,'A','B','C');
    }

    private static void hanoi(int n, char a, char b, char c) {
        if(n==0) return;
        hanoi(n-1,a,c,b); // n-1 disks from A to B via C
        System.out.println(a+"->"+c); // largest from A to C
        hanoi(n-1,b,a,c); // n-1 disks from B to C via A
    }

    public static void merge(int[] a, int[] b, int[] c){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(i<a.length) c[k++] = a[i++];
        while(j<b.length) c[k++] = b[j++];
    }




}
