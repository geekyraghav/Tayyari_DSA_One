package Greedy;

import java.util.Arrays;

public class AssignCookies {
    public int maxChildren(int[] greed, int[] cookie) {
        Arrays.sort(greed);
        Arrays.sort(cookie);
        int i = 0, j = 0;
        while(i<cookie.length && j<greed.length){
            if(cookie[i]>=greed[j]) j++;
            i++;
        }
        return j;
    }
}
