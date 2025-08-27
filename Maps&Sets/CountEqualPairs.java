package Maps_And_Sets;

import java.util.HashMap;

public class CountEqualPairs {
    long equalPairs(String s) {
        // ananyaa = 4+4+4+4+2+2+1
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        long pairs = 0;
        for(char ch : map.keySet()){
            long freq = map.get(ch);
            pairs += freq*freq;
        }
        return pairs;
    }
}
