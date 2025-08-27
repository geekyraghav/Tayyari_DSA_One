package Maps_And_Sets;
import java.util.HashSet;
public class LongestNonRepeatingSubstring {
    int longestUniqueSubstring(String s) {
        // ulangwar
        HashSet<Character> set = new HashSet<>();
        int i = 0, j = 0, maxLen = 1;
        while(j<s.length()){
            char ch = s.charAt(j);
            if(!set.contains(ch)){
                set.add(ch);
                j++;
            }
            else{
                int len = j-i;
                maxLen = Math.max(maxLen,len);
                while(s.charAt(i)!=s.charAt(j)){
                    set.remove(s.charAt(i));
                    i++;
                }
                i++;
            }
        }
        int len = j-i;
        maxLen = Math.max(maxLen,len);
        return maxLen;
    }
}
