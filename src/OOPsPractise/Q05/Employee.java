/*
Employee Info
Class Employee with private fields: id, name, salary.
Provide getters and setters for all fields.
Create 2 objects and update salary using setter, display updated info.
 */
package OOPsPractise.Q05;

public class Employee {
    private String id, name;
    private double salary;

    //ID
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    //NAME
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //SALARY
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid Salary input");
        }
    }

    public double getSalary() {
        return salary;
    }
}
