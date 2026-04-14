// Sort by multiple fields (marks + name).

package PractiseQuestions._03_Collections.ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Comparator;

public class Q4 {
    public static class Student implements Comparator<Student> {
        int marks;
        String name;

        public Student(int marks, String name) {
            this.marks = marks;
            this.name = name;
        }

        public Student() {
        }

        public int compare(Student s1, Student s2) {
            int res = s2.marks - s1.marks;
            if (res == 0) {
                return s1.name.compareTo(s2.name);
            } else {
                return res;
            }
        }

        public String toString() {
            return "{Marks:" + marks + ", Name:" + name + "}";
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student(99, "Shrishti");
        Student s2 = new Student(98, "Nishit");
        Student s3 = new Student(95, "Abhinav");
        Student s4 = new Student(95, "Anshul");
        Student s5 = new Student(90, "Apoorv");
        Student s6 = new Student(93, "Varun");
        ArrayList<Student> al = new ArrayList<>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);
        al.add(s5);
        al.add(s6);
        al.sort(new Student());
        System.out.println(al);
    }
}
