package Backtracking;

public class RatInAMaze {
    public static void main(String[] args) {
        int m = 3, n = 3;
        boolean[][] visited = new boolean[m][n]; // false
        System.out.println(paths(0,0,m-1,n-1,visited,""));
    }

    private static int paths(int r, int c, int er, int ec, boolean[][] visited, String s) {
        if(r>er || c>ec || r<0 || c<0 || visited[r][c]) return 0;
        visited[r][c] = true;
        if(r==er && c==ec){
            System.out.println(s);
            visited[r][c] = false; // backtracking
            return 1; // valid path
        }
        int left = paths(r,c-1,er,ec,visited,s+'L');
        int up = paths(r-1,c,er,ec,visited,s+'U');
        int right = paths(r,c+1,er,ec,visited,s+'R');
        int down = paths(r+1,c,er,ec,visited,s+'D');
        visited[r][c] = false; // backtracking
        return right + down + left + up;
    }
}
