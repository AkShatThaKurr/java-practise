package collection.Lect3_Set.SortedSet;

import java.util.Comparator;
import java.util.TreeSet;

public class P2 {

    public static class Employee implements Comparator<Employee> {


        private int id;
        private String name;

        public Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public Employee(){};


        public String toString() {
            return "{id=" + id + ", name='" + name + "'}";

        }

        @Override
        public int compare(Employee emp1, Employee emp2) {
            if (emp1.id < emp2.id) {
                return -1;
            } else if (emp1.id > emp2.id) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(2100101020, "Akshat");
        Employee emp2 = new Employee(2100101021, "Rishabh");
        Employee emp3 = new Employee(2100101022, "Daksh");
        Employee emp4 = new Employee(2100101023, "Aarush");
        Employee emp5 = new Employee(2100101024, "Rishi");

        TreeSet<Employee> treeSet = new TreeSet<>(new Employee());
        treeSet.add(emp1);
        treeSet.add(emp2);
        treeSet.add(emp3);
        treeSet.add(emp4);
        treeSet.add(emp5);
        System.out.println(treeSet);
    }
}
