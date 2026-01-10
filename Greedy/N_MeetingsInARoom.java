package Greedy;
import java.util.Arrays;
public class N_MeetingsInARoom {
    public int maxMeetings(int start[], int end[]) {
        int n = start.length;
        int[][] arr = new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0] = start[i];
            arr[i][1] = end[i];
        }
        // Sort wrt end time
        Arrays.sort(arr,(a,b) -> a[1]-b[1]);
        int count = 1;
        int endTime = arr[0][1];
        for(int i=1;i<n;i++){
            if(arr[i][0] > endTime){
                count++;
                endTime = arr[i][1];
            }
        }
        return count;
    }
}
