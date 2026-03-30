// throws keyword is used only for Checked Exceptions, to declare the exceptions in compile time.

package exceptionHandling.throws_;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q1 {
    static void m1() throws FileNotFoundException{
       File file = new File("abc.txt");
       Scanner sc = new Scanner(file);
    }

    public static void main(String[] args) {
        try{
            m1();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}

/* Output:
java.io.FileNotFoundException: abc.txt (The system cannot find the file specified)
    at ...
 */
