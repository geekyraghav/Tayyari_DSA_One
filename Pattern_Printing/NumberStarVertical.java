package Pattern_Printing;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class NumberStarVertical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n2 = n, count = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        int max = 0;
        while(n2!=0){
            max = Math.max(max,n2%10);
            arr.add(n2%10);
            n2 = n2/10;
            count++;
        }
        Collections.reverse(arr);
        for(int i=1;i<=max;i++){
            for(int j=0;j<arr.size();j++){
                if(arr.get(j)>=i) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
