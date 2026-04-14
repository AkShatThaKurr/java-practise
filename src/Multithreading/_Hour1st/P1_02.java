package Multithreading._Hour1st;

public class P1_02 {
    public static void main(String[] args) {
        P1_01 c = new P1_01();
        c.start();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Inside main class " + i);
        }
    }
}


/* Note: Output order is not fixed because thread scheduling is handled by JVM/OS.
Multiple threads run concurrently and CPU switches between them using context switching.
This leads to unpredictable output order.

Output:
Inside main class 1
Inside main class 2
Inside Child class 1
Inside Child class 2
Inside Child class 3
Inside Child class 4
Inside Child class 5
Inside main class 3
Inside main class 4
Inside main class 5
 */