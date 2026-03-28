package OOPsPractise.Q11;

public class Circle extends Shape {
    int r;

    Circle(int r) {
        this.r = r;
    }

    double area() {
        return (Math.PI * r * r);
    }
}
