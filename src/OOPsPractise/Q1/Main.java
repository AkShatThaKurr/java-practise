package OOPsPractise.Q1;

public class Main {
    public static void main(String[] args) {

        Car obj1 = new Car("BMW", "BLACK", 150);

        Car obj2 = new Car("AUDI", "WHITE", 110);


        System.out.println("Details for Car1:");
        obj1.display();
        System.out.println();
        System.out.println("Details for Car2:");
        obj2.display();
    }
}
