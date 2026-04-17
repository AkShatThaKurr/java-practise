package Multithreading;

public class P5_02 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new P5_01());
        Thread t2 = new Thread(new P5_01());

        t1.start();
        t2.start();
    }
}

