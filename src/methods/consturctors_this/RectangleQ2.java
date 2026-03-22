// “Design a class Rectangle. Initialize its dimensions using a constructor and print the area of the rectangle.”
package methods.consturctors_this;

public class RectangleQ2 {
    int length, breadth;

    RectangleQ2(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void area() {
        System.out.println("Area: " + (this.length * this.breadth));

    }

    public static void main(String[] args) {

        RectangleQ2 r1 = new RectangleQ2(5, 4);
        RectangleQ2 r2 = new RectangleQ2(10, 3);
        RectangleQ2 r3 = new RectangleQ2(2, 4);

        r1.area();
        r2.area();
        r3.area();

    }
}
