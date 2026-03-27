package OOPsPractise.Q7;

public class Main {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle();
        Circle obj2 = new Circle();

        obj2.r=21;
        System.out.println("Area of Circle: " + obj2.area());

        obj1.l = 15;
        obj1.b = 12;
        System.out.println("Area of Rectangle: " + obj1.area());


    }
}
