package DP;
import java.util.*;
public class RussianDollEnvelopes {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (a,b) -> (a[0]!=b[0]) ? Integer.compare(a[0],b[0]) : Integer.compare(b[1],a[1]));
        ArrayList<Integer> ans = new ArrayList<>();
        for(int[] a : envelopes){
            int ele = a[1];
            if(ans.size()==0 || ele>ans.get(ans.size()-1)) ans.add(ele);
            else replace(ele,ans);
        }
        return ans.size();
    }

    public void replace(int ele, ArrayList<Integer> ans) {
        // find the lower bound
        int lo = 0, hi = ans.size()-1, lb = -1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(ans.get(mid)>=ele){
                lb = mid;
                hi = mid - 1;
            }
            else lo = mid + 1;
        }
        ans.set(lb,ele);
    }
}
