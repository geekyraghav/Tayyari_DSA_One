package BinarySearch;

public class KokoEatingBananas {
    public int kokoEat(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        for(int ele : arr){
            max = Math.max(max,ele);
        }
        int lo = 1, hi = max, speed = max;
        while(lo<=hi){ // O(n*log(max))
            int mid = lo + (hi-lo)/2;
            if(hours(mid,arr) <= k){
                hi = mid - 1;
                speed = mid;
            }
            else lo = mid + 1;
        }
        return speed;
    }

    private int hours(int speed, int[] arr) {
        int h = 0;
        for(int ele : arr){
            if(ele%speed == 0) h += ele/speed;
            else h += (ele/speed + 1);
        }
        return h;
    }
}
