/* Step 1: Classes & Objects (Easy)
Car Class
Create a class Car with attributes: brand, color, speed.
Write methods to display car details.
Create 2 objects with different values and print their info.*/

package OOPsPractise.Q1;

public class Car {
    private String brand, color;
    private int speed;

    public Car(String brand, String color, int speed){
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    public void display(){
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed);
    }
}
