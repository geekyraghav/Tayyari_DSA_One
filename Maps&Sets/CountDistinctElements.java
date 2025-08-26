package Maps_And_Sets;

import java.util.HashSet;

public class CountDistinctElements {
    static int distinct(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr) set.add(ele);
        return set.size();
    }
}
