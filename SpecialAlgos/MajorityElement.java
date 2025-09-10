package SpecialAlgos;

public class MajorityElement {
    int majorityElement(int arr[]) {
        // 1 1 1 1 2 2 2 3   no majority
        int winner = arr[0], count = 1, n = arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]==winner) count++;
            else{
                if(count==0){
                    winner = arr[i];
                    count = 1;
                }
                else count--; // neutralization
            }
            if(count>n/2) return winner;
        }
        count = 0; // this count will store winner's count
        for(int ele : arr){
            if(ele==winner) count++;
        }
        return (count>n/2) ? winner : -1;
    }
}
