class Solution {
    int countWays(int n) {
        if(n<=2) return n;
        return countWays(n-1) + countWays(n-2);
    }
}
