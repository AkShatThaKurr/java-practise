// Child class
package OOPs_Concepts.Pillar2_Inheritance;

class Car extends Vehicle{
    int seats;
    Car(String brand, int speed, int seats){
        super(brand,speed);
        this.seats = seats;
    }
    void displayCar(){
        displayVehicle();
        System.out.println("Seats: " + seats);
    }
}
