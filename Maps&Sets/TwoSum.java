package Maps_And_Sets;
import java.util.HashSet;
public class TwoSum {
    boolean twoSum(int arr[], int target) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr){
            int rem = target - ele;
            if(set.contains(rem)) return true;
            set.add(ele);
        }
        return false;
    }
}
