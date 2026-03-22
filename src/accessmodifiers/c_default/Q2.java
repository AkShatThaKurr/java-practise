// Create a class Employee with a variable salary and a method display() (both default access). Create another class in the same package and access both
// variable and method to print the salary.”
package accessmodifiers.c_default;

class Employee {
    double salary = 35000;

    void display() {
        System.out.println("Salary (display): " + salary);

    }

}

public class Q2 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println("Salary (variable): " + emp.salary);
        emp.display();
    }

}
