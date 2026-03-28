package OOPsPractise.Q11;

public class Square extends Shape {
    int s;

    Square(int s) {
        this.s = s;
    }

    double area() {
        return (s * s);
    }
}
