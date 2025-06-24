package Arrays;

public class ForEach {
    public static void main(String[] args) {
        int[] arr = {5,8,2,6,9};
//        for(int ele : arr){
//            System.out.print(ele+" ");
//        }
        for(int ele : arr){
            ele *= 2;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
