package Multithreading;

public class P6_01 implements Runnable{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}
