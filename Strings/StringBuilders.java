package Strings;

import java.util.ArrayList;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        System.out.println(s.length()+" "+s.capacity());
        s.append("Raghav");
        System.out.println(s.length()+" "+s.capacity());
        System.out.println(s);
        s.setCharAt(1,'o');
        System.out.println(s);
        String t = s.toString();
        System.out.println(t);
        s.append("aDKLHJvlkbjlkdbvlkjdbfjklrbf.jkrbgjklrbkljVR");
        System.out.println(s.length()+" "+s.capacity());
        s.append("t");
        System.out.println(s.length()+" "+s.capacity());
        s.append("khaefbkeabfk");
        System.out.println(s.length()+" "+s.capacity());

    }
}
