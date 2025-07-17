package OOPS;

import java.util.Scanner;

class Students{
    String name; // null
    private int rno; // 0
    double cgpa; // 0.0
    void print(){ // getter
        System.out.println(name+" "+cgpa+" "+rno);
    }
    int getRno(){ // getter
        return rno;
    }
    void setRno(int x){ // setter
        rno = x;
    }
}
public class PrivateKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Students s1 = new Students();
        // s1.print();
        s1.cgpa = 8.9;
        s1.name = "Hemant";
        // s1.rno = 45;  error
        s1.setRno(45);
        System.out.println(s1.getRno());

//        StringBuilder sb = new StringBuilder(sc.nextLine());
//        System.out.println(sb);
    }
}
