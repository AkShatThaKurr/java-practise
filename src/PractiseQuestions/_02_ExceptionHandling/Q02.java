// Handle ArrayIndexOutOfBoundsException.

package PractiseQuestions._02_ExceptionHandling;

public class Q02 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[1] = 50;
        try{
            System.out.println(arr[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Array index out of bounds.");
        }
    }
}
