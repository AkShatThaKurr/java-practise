// Sort Student objects by name.
// Tree set hmesha unique pe chalti h, agr koi value same ho gai toh vo ek ko skip kr degi.
// Isliye now we are using ArrayList.

package PractiseQuestions._03_Collections.ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Comparator;

public class Q2 {
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
            int res = s1.name.compareTo(s2.name);
            if (res == 0) {
                return s1.age - s2.age;
            } else {
                return res;
            }
        }

        public String toString() {
            return "{Name:" + name + " ,Age:" + age + "}";
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Akshat", 23);
        Student s2 = new Student("Aditya", 22);
        Student s3 = new Student("Aayush", 22);
        Student s4 = new Student("Ishaan", 22);
        Student s5 = new Student("Shiven", 23);
        Student s6 = new Student("Rajat", 25);
        Student s7 = new Student("Shiven", 19);

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
