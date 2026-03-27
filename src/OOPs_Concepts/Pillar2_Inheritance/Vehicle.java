// Parent class
package OOPs_Concepts.Pillar2_Inheritance;

public class Vehicle {
    String brand;
    int speed;
    Vehicle(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }
    void displayVehicle(){
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}
