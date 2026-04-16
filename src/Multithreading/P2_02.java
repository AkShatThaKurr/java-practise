package Multithreading;

public class P2_02 {
    public static void main(String[] args) {
        P2_01 r = new P2_01();
        Thread t = new Thread(r);
        t.start();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread: " + i);
        }
    }
}
