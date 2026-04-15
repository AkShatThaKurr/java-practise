// Thread creation using extending Thread class and  ( run(), start() method).
package Multithreading;


public class P1_01 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Inside Child class " + i);
        }
    }
}
