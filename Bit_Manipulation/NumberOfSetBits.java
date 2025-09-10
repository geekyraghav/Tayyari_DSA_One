class Solution {
    static int setBits(int n) {
        int count = 0;
        for(int i=0;i<31;i++){ // O(31)
            if((n>>i)%2 != 0) count++;
        }
        return count;
    }
}
