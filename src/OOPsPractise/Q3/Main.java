package OOPsPractise.Q3;

public class Main {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle(15,7);
        Rectangle obj2 = new Rectangle(7,4);
        System.out.println("-------For Rectangle1-------");
        System.out.println("Area: " + obj1.area());
        System.out.println("Perimeter: " + obj1.perimeter());

        System.out.println();
        System.out.println("-------For Rectangle2-------");
        System.out.println("Area: " + obj2.area());
        System.out.println("Perimeter: " + obj2.perimeter());

    }
}
