// Thread creating using runnable interface.

package Multithreading;

public class P2_01 implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable thread: " + i);
        }
    }
}
