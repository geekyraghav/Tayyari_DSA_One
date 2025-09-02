package Heaps;
import java.util.Arrays;
class Student implements Comparable<Student>{
    String name;
    int rno;
    double cgpa;
    Student(String name, int rno, double cgpa){
        this.name = name;
        this.rno = rno;
        this.cgpa = cgpa;
    }

    public int compareTo(Student s){
        if(this.cgpa == s.cgpa)
            return this.rno - s.rno;
        return Double.compare(this.cgpa,s.cgpa);
    }
}
public class CustomComparator {
    public static void main(String[] args) {
        Student s1 = new Student("Gopi",200,8.3);
        Student s2 = new Student("Shahid",49,8.9);
        Student s3 = new Student("Anuj",90,8.5);
        Student s4 = new Student("Isha",8,8.3);
        Student s5 = new Student("Aditya",31,9.7);
        Student[] arr = {s1,s2,s3,s4,s5};
        Arrays.sort(arr);
        for(Student s : arr){
            System.out.println(s.name+" "+s.rno+" "+s.cgpa);
        }
    }
}
