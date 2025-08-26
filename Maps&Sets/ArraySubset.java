package Maps_And_Sets;

import java.util.HashMap;

public class ArraySubset {
    public boolean isSubset(int a[], int b[]) {
        // a[] = [11, 1, 13, 21, 3, 7, 3], b[] = [11, 3, 7, 1, 7]
        // no
        HashMap<Integer,Integer> aMap = new HashMap<>();
        for(int ele : a){
            if(aMap.containsKey(ele)){
                int freq = aMap.get(ele);
                aMap.put(ele,freq+1);
            }
            else aMap.put(ele,1);
        }
        HashMap<Integer,Integer> bMap = new HashMap<>();
        for(int ele : b){
            if(!aMap.containsKey(ele)) return false;
            if(bMap.containsKey(ele)){
                int freq = bMap.get(ele);
                bMap.put(ele,freq+1);
            }
            else bMap.put(ele,1);
        }
        for(int ele : bMap.keySet()){
            int freq = bMap.get(ele);
            int aFreq = aMap.get(ele);
            if(aFreq<freq) return false;
        }
        return true;
    }
}
