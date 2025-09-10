class Solution {
    public static boolean isPowerofTwo(int n) {
        return ((n & (n-1))==0);
    }
    // public static boolean isPowerofTwo(int n) {
    //     if(n==0) return false;
    //     while(n>1){
    //         if(n%2 == 1) return false;
    //         n /= 2;
    //     }
    //     return true;
    // }
    // public static boolean isPowerofTwo(int n) {
    //     if(n==0) return false;
    //     if(n==1) return true;
    //     if(n%2 == 1) return false;
    //     return isPowerofTwo(n/2);
    // }
}
