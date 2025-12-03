package Graphs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DistanceFromNearest1 {
    public class Pair{
        int row;
        int col;
        Pair(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    public ArrayList<ArrayList<Integer>> nearest(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        int[][] ans = new int[m][n];
        Queue<Pair> q = new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==1) q.add(new Pair(i,j));
            }
        }
        while(q.size()>0){
            Pair front = q.remove();
            int row = front.row, col = front.col;
            // left  (row,col-1)
            if(col-1 >= 0 && arr[row][col-1]==0 && ans[row][col-1]==0){
                ans[row][col-1] = ans[row][col] + 1;
                q.add(new Pair(row,col-1));
            }
            // right  (row,col+1)
            if(col+1 < n && arr[row][col+1]==0 && ans[row][col+1]==0){
                ans[row][col+1] = ans[row][col] + 1;
                q.add(new Pair(row,col+1));
            }
            // up  (row-1,col)
            if(row-1 >= 0 && arr[row-1][col]==0 && ans[row-1][col]==0) {
                ans[row-1][col] = ans[row][col] + 1;
                q.add(new Pair(row-1,col));
            }
            // down  (row+1,col)
            if(row+1 < m && arr[row+1][col]==0 && ans[row+1][col]==0) {
                ans[row+1][col] = ans[row][col] + 1;
                q.add(new Pair(row+1,col));
            }
        }
        ArrayList<ArrayList<Integer>> ans2 = new ArrayList<>();
        for(int i=0;i<m;i++){
            ArrayList<Integer> a = new ArrayList<>();
            for(int j=0;j<n;j++){
                a.add(ans[i][j]);
            }
            ans2.add(a);
        }
        return ans2;
    }
}
