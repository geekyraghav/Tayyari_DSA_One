package Strings;

public class SubStringsOfString {
    public static void main(String[] args) {
        String s = "bhakti";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                System.out.print(s.substring(i,j+1)+" "); // i to j
            }
            System.out.println();
        }
    }
}
