class Solution {
    static int setKthBit(int n, int k) {
        int mask = (1<<k);
        return n | mask;
    }
}
