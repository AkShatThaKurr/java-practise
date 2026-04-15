// Thread creation using extending Thread class and  ( run(), start() method).

package Multithreading;

public class P1_02 {
    public static void main(String[] args) {
        P1_01 c = new P1_01();
        c.start();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Inside main class " + i);
        }
    }
}




