// Program to calculate electricity bill

public class Arithmetic12 {
    public static void main(String[] args) {
        double perUnit = 7;
        double fixcharge = 340;
        double unitconsumed = 100;
        double bill = (unitconsumed * perUnit) + fixcharge;
        System.out.println("Total electricity bill = " + bill);
    }
}
