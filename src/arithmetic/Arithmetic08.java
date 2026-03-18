package arithmetic;// (Program to swap two numbers)

public class Arithmetic08 {
    public static void main(String[] args) {
        int a=11, b=55;
        int swap = a;
        System.out.println("Before Swapping:");
        System.out.println("a = " + a + ", b = " + b);
        a = b;
        b = swap;
        System.out.println("After Swapping:");
        System.out.println("a = " + a + ", b = " + b);
    }

}
