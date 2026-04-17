// Priority Range (1 to 10), where 1 = MIN_PRIORITY, 2 = NORM_PRIORITY, 3 = MAX_PRIORITY

package Multithreading;

public class P4_01 implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " running with priority " + Thread.currentThread().getPriority());
    }
}
