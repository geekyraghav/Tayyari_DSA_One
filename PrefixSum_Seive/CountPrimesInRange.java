package PrefixSum;
import java.util.Arrays;
public class CountPrimesInRange {
    int countPrimes(int l, int r) {
        int count = 0;
        int[] s = seive(r);
        for(int i=l;i<=r;i++){
            if(s[i]==1) count++;
        }
        return count;
    }

    private int[] seive(int n) { // TC = O(n*log(logn))
        int[] arr = new int[n+1];
        Arrays.fill(arr,1);
        arr[0] = 0;
        arr[1] = 0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(arr[i]==1){ // i is prime
                for(int j=i*i;j<=n;j+=i){
                    arr[j] = 0; // composite
                }
            }
        }
        return arr;
    }

//    int countPrimes(int l, int r) {
//        int count = 0;
//        for(int i=l;i<=r;i++){
//            if(isPrime(i)) count++;
//        }
//        return count;
//    }
//
//    private boolean isPrime(int n) {
//        if(n==1) return false;
//        for(int i=2;i<=Math.sqrt(n);i++){
//            if(n%i == 0){ // 'i' to 'n' ka ek factor nikla
//                return false;
//            }
//        }
//        return true;
//    }
}
