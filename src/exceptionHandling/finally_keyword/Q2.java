// finally block executes even when we write return in the try block .

package exceptionHandling.finally_keyword;

public class Q2 {
    public static void main(String[] args) {
        try{
            System.out.println("Inside try");
            return;
        }
        catch(Exception e){
            System.out.println("Inside catch");
        }
        finally{
            System.out.println("Inside finally");
        }

    }
}
