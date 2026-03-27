package OOPs_Concepts.Pillar3_Polymorphism.MethodOverloading;

public class Main {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int result1 = obj.add(10,20,30);
        int result2 = obj.add(10,20);
        double result3 = obj.add(10.5,9.5);
        System.out.println("Result1: " + result1);
        System.out.println("Result2: " + result2);
        System.out.println("Result3: " + result3);
    }
}
