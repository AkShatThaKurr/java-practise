package Multithreading;


public class P4_02 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new P4_01());
        Thread t2 = new Thread(new P4_01());
        Thread t3 = new Thread(new P4_01());
        t1.start();
        t2.start();
        t3.start();
        System.out.println("The default thread priority of thread inside main thread is always 5.");
        System.out.println("Thread Priority of t1 is: " + t1.getPriority());
        t1.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Updated Priority of t1: " + t1.getPriority());
        System.out.println("Thread Priority of t2 is: " + t2.getPriority());
        t2.setPriority(Thread.NORM_PRIORITY);
        System.out.println("Updated Priority of t2: " + t2.getPriority());

        System.out.println("Thread Priority of t3: " + t3.getPriority());
        t3.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Updated Thread Priority of t3: " + t3.getPriority());

    }
}
