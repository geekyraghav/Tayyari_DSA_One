package Greedy;

import java.util.Arrays;

public class BoatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        int boats = 0;
        Arrays.sort(people);
        int i = 0, j = people.length-1;
        while(i<=j){
            if(i==j){
                i++;
                j--;
            }
            else if(people[i] + people[j] <= limit){
                i++;
                j--;
            }
            else j--;
            boats++;
        }
        return boats;
    }
}
