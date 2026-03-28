package OOPsPractise.Q11;

public class Main {
    public static void main(String[] args) {
        Shape obj1 = new Circle(21);
        Shape obj2 = new Square(5);

        System.out.println("Area of Circle: " + obj1.area());
        System.out.println("Area of Square: " + obj2.area());
    }
}
