package Arrays;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println("Two Sum");
    }
    public static boolean twoSum(int arr[], int target) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j] == target)
                    return true;
            }
        }
        return false;
    }
}
