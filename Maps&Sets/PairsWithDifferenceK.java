class Solution {
    int countPairs(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        int pairs = 0; // 1 1 1 1 1 4 4 4 1 -2 -2   k=3   (1,6) (4,3) (-2,2)
        for(int ele : map.keySet()){
            int rem1 = ele-k;
            int rem2 = ele+k;
            if(map.containsKey(rem1)) pairs += (map.get(ele))*(map.get(rem1));
            if(map.containsKey(rem2)) pairs += (map.get(ele))*(map.get(rem2));
        }
        pairs /= 2;
        return pairs;
    }
}
