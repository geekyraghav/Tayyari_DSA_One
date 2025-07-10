class Solution {
    public int nthFibonacci(int n) {
        if(n<=1) return n;
        return nthFibonacci(n-1) + nthFibonacci(n-2);
    }
}
