package Multithreading;

public class P6_02 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new P6_01());
        t1.start();
        try{
            t1.join();
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        for(int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}
