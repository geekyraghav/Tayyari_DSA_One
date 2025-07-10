package Strings;

import java.util.Collections;

public class ReverseSb {
    public static void main(String[] args) {
        String s = "Devesh";
        StringBuilder sb = new StringBuilder(s);
        // Collections.sort(sb); // does not work
        // sb.reverse();
        sb.deleteCharAt(1);
        sb.insert(1,'e');
        sb.delete(3,6); // 3 to 5
        System.out.println(sb);
//        String s = "Aditya";
//        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//        s = sb.toString();
//        System.out.println(s);
    }
}
