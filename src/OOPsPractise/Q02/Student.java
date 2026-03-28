/*  student Class with Constructor
Create a class Student with name, rollNo, marks.
Add a parameterized constructor to initialize all attributes.
Write a method display() to print student details.*/

package OOPsPractise.Q02;

public class Student {
    private String name;
    private int rollNo;
    private float marks;

    public Student(String name, int rollNo, float marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

         public void display(){
             System.out.println("Student detail: ");
            System.out.println("Name: " + name);
            System.out.println("RollNo: " + rollNo);
            System.out.println("Marks: " + marks);
        }


}
