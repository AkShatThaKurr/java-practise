/*
Sort Student objects in descending order of name.
If two students have the same name, then sort them in descending order of age.
Use ArrayList and Comparator to perform the sorting.
 */

package PractiseQuestions._03_Collections.ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Comparator;

public class Q3 {
    public static class Student implements Comparator<Student> {
        String name;
        int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Student() {
        }

        public int compare(Student s1, Student s2) {
            int res = s2.name.compareTo(s1.name);
            if (res == 0) {
                return s2.age - s1.age;
            } else {
                return res;
            }
        }

        public String toString() {
            return "{Name:" + name + " ,Age:" + age + "}\n";
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Akshat", 23);
        Student s2 = new Student("Abhishek", 24);
        Student s3 = new Student("Aditya", 22);
        Student s4 = new Student("Abhinav", 21);
        Student s5 = new Student("Ishaan", 24);
        Student s6 = new Student("Rajat", 26);
        Student s7 = new Student("Aditya", 24);
        ArrayList<Student> al = new ArrayList<>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);
        al.add(s5);
        al.add(s6);
        al.add(s7);
        al.sort(new Student());
        System.out.println(al);
    }
}
