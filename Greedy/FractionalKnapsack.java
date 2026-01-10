package Greedy;
import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        int n = val.length;
        int[][] arr = new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0] = val[i];
            arr[i][1] = wt[i];
        }
        // Sort by val/wt
        Arrays.sort(arr, Comparator.comparingDouble(a -> ((double)a[0]) / a[1]));
        double money = 0;
        for(int i=n-1;i>=0;i--){
            if(capacity==0) break;
            int v = arr[i][0];
            int w = arr[i][1];
            if(capacity >= w){
                capacity -= w;
                money += v;
            }
            else{ // capacity < w
                money += v*capacity/((double)w);
                capacity = 0;
            }
        }
        return money;
    }
}
