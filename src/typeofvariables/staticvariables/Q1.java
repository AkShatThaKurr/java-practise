// Program to demonstrate that static variable are shared among all object in the class.

package typeofvariables.staticvariables;


class Student {
    static String college = "IIT";
}


public class Q1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println("Before change:");
        System.out.println(s1.college);
        System.out.println(s2.college);

        s1.college = "NIT";

        System.out.println("After change:");
        System.out.println(s1.college);
        System.out.println(s2.college);

        // access using class name
        System.out.println("Using class name: ");
        System.out.println(Student.college);
        ;

    }

}
