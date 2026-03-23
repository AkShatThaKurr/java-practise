// // Program showing that each object has its own copy of instance variable
// Each object has its own separate copy of instance variables.
//Changing one object’s value does not affect others.

package typeofvariables.instancevariables;

class Student {
    String name = "default name";   // instance variable
}

public class Q1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        System.out.println("Values before updation: ");
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.name);

        s1.name = "Akshat";

        System.out.println("Values after updation: ");
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.name);
    }
}

