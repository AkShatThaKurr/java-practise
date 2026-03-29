// java.io.FileNotFoundException: abc.txt (The system cannot find the file specified.)


package exceptionHandling.trycatch;

import java.util.Scanner;
import java.io.File;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("Before Exception: ");
        try{
            File file = new File("abc.txt");
            Scanner sc = new Scanner(file);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("After Exception: ");
    }
}
