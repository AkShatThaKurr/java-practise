// Create a Student class where you initialize the student’s name and age using a constructor. Use the this keyword and print the details of the student.
package methods.consturctors_this;

public class StudentQ1 {
    String name;
    int age;

    StudentQ1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void show() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {
        StudentQ1 s1 = new StudentQ1("Akshat", 23);
        StudentQ1 s2 = new StudentQ1("Abhinav", 21);
        s1.show();
        s2.show();
    }

}
