// Perform custom sorting.

package PractiseQuestions._03_Collections.Set;

import java.util.TreeSet;
import java.util.Comparator;

public class Q3 {
    public static class Student implements Comparator<Student> {
        private int Rno;
        private String Name;

        public Student(int Rno, String Name) {
            this.Rno = Rno;
            this.Name = Name;
        }

        public Student() {
        }


        @Override
        public int compare(Student S1, Student S2) {
            return S2.Rno - S1.Rno;
        }

        public String toString() {
            return "{Rno=" + Rno + " ,Name=" + Name + "}";
        }
    }

    public static void main(String[] args) {
        Student S1 = new Student(1, "Aakash");
        Student S4 = new Student(4, "Aayush");
        Student S2 = new Student(2, "Abhinav");
        Student S3 = new Student(3, "Aditya");
        Student S5 = new Student(5, "Akshat");

        TreeSet<Student> tset = new TreeSet<>(new Student());
        tset.add(S1);
        tset.add(S2);
        tset.add(S3);
        tset.add(S4);
        tset.add(S5);
        System.out.println(tset);
    }
}
