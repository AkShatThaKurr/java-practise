// Sort Student objects by marks.
package PractiseQuestions._03_Collections.ComparatorAndComparable;

import java.util.Comparator;
import java.util.TreeSet;

public class Q1 {
    public static class Student implements Comparator<Student> {
        String name;
        int marks;

        public Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }

        public Student() {
        }


        public int compare(Student S1, Student S2) {
            return S1.marks - S2.marks;
        }

        public String toString() {
            return "{Name: " + name + " , Marks:" + marks + "}";
        }

        public static void main(String[] args) {
            Student s1 = new Student("Akshat", 95);
            Student s2 = new Student("Aditya", 76);
            Student s3 = new Student("Aryan", 90);
            Student s4 = new Student("Ayush", 98);
            Student s5 = new Student("Abhinav", 99);
            TreeSet<Student> tset = new TreeSet<>(new Student());
            tset.add(s1);
            tset.add(s2);
            tset.add(s3);
            tset.add(s4);
            tset.add(s5);
            System.out.println(tset);

        }

    }
}
