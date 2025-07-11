class Solution {
    public int uniquePaths(int m, int n) {
        if(m==1 || n==1) return 1;
        return uniquePaths(m-1,n) + uniquePaths(m,n-1);
    }

    // public int paths(int cr, int cc, int lr, int lc) {
    //     if(cr==lr && cc==lc) return 1;
    //     if(cr>lr || cc>lc) return 0; // IMPORTANT
    //     int right = paths(cr,cc+1,lr,lc);
    //     int down = paths(cr+1,cc,lr,lc);
    //     return right + down;
    // }
    // public int uniquePaths(int m, int n) {
    //     return paths(0,0,m-1,n-1);
    // }
}
