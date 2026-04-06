// Q1. Create a Student class with fields and a display method.

package PractiseQuestions._01_OOPs;

import java.util.Scanner;
import java.util.ArrayList;

public class Q1 {
    public static class Student {
        final private String name;
        final private String id;
        final private String stream;
        long phoneNumber;
        int age;

        public Student(String name, String id, String stream, long phoneNumber, int age) {

            this.name = name;
            this.id = id;
            this.stream = stream;
            this.phoneNumber = phoneNumber;
            this.age = age;
        }

        public void display() {
            System.out.println("Name: " + name);
            System.out.println("Id: " + id);
            System.out.println("Stream: " + stream);
            System.out.println("Phone Number: " + phoneNumber);
            System.out.println("Age: " + age);
            System.out.println(2);
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String name;
            String id;
            String stream;
            long phoneNumber;
            int age;
            System.out.println("----------Enter details of Student"+ (i+1) + "----------");
            System.out.print("Enter Name: ");
            name = sc.nextLine();
            System.out.print("Enter Id: ");
            id = sc.nextLine();
            System.out.print("Enter Stream: ");
            stream = sc.nextLine();
            System.out.print("Enter Phone number: ");
            phoneNumber = sc.nextLong();
            System.out.print("Enter Age: ");
            age = sc.nextInt();
            sc.nextLine();
            al.add(new Student(name, id, stream, phoneNumber, age));
        }
        System.out.println("----------All Students Detail----------");

        for (Student s : al) {
            s.display();
        }


        sc.close();

    }
}
