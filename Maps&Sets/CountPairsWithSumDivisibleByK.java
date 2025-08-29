package Maps_And_Sets;

import java.util.HashMap;

public class CountPairsWithSumDivisibleByK {
    public static long countKdivPairs(int arr[], int n, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : arr){
            int x = ele%k;
            map.put(x,map.getOrDefault(x,0)+1);
        }
        long pairs = 0;
        // check for zero remainders
        long zeroCount = map.get(0);
        pairs += zeroCount*(zeroCount-1)/2;
        map.remove(0);
        // check for k/2 remainders
        if(k%2 == 0){
            long halfCount = map.get(k/2);
            pairs += halfCount*(halfCount-1)/2;
            map.remove(k/2);
        }
        pairs *= 2;

        for(int key : map.keySet()){
            int rem = k - key;
            if(map.containsKey(rem))
                pairs += (map.get(key))*(map.get(rem));
        }
        pairs /= 2;
        return pairs;
    }
}
