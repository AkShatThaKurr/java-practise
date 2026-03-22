// Create a class Student with a variable name(default access). Create another class in the same package and print the name using an object.
package accessmodifiers.c_default;

class Student {
    String name = "Akshat";
}

public class Q1 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("Student Name: " + s.name);

    }
}
