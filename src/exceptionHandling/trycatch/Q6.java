// Multiple catch blocks for handling multiple types of exceptions.

package exceptionHandling.trycatch;

public class Q6 {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30};

        try {
            int index = 5;
            int value = arr[6];

            int result = value / 0;
            System.out.println(result);
        } catch (ArithmeticException e1) {
            System.out.println("Arithmetic Error");
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("Array Index Out Of Bound Exception");
        } catch (Exception e3) {
            System.out.println("Some other exception");
        }


    }
}
