package Arrays;

public class SumAndMax {
    public static void main(String[] args) {
        int[] arr = {-6,-8,-14,-2,-23,-47,-7};

//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        System.out.println(sum);
//        int max = arr[0];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) max = arr[i];
        }
        System.out.println(max);
    }
}
