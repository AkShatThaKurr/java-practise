// “Create a class Car with a public variable brand and a public method display(). Access both from another class.”
package accessmodifiers.a_public;

class Car {
    public String brand = "Toyota";


    public void display() {
        System.out.println("Brand: " + brand);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.display();  // Method access
        System.out.println("The brand is: " + obj.brand);   // Variable access
    }
}
