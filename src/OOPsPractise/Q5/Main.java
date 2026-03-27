package OOPsPractise.Q5;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        emp1.setId("S5980");
        emp1.setName("Akshat Thakur");
        emp1.setSalary(800000);

        emp2.setId("S6980");
        emp2.setName("Aditya Singh");
        emp2.setSalary(500000);

        System.out.println("-------Employee1-------");
        System.out.println("Id: " + emp1.getId() + ", Name: " + emp1.getName() + ", Salary: " + emp1.getSalary());
        System.out.println();
        System.out.println("-------Employee2-------");
        System.out.println("Id: " + emp2.getId() + ", Name: " + emp2.getName() + ", Salary: " + emp2.getSalary());
        System.out.println();
        System.out.println("-------Updating Salaries-------");
        emp1.setSalary(1000000);
        emp2.setSalary(800000);

        System.out.println("Updated salary of " + emp1.getName() + " is: " + emp1.getSalary());
        System.out.println("Updated salary of " + emp2.getName() + " is: " + emp2.getSalary());


    }
}
