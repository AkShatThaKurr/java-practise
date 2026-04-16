package Multithreading;

public class P3_02 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new P3_01());

        // To check which thread is running we can use:- Thread.currentThread()
        System.out.println("The thread which is running at present = " + Thread.currentThread());

        // To check what is the name of thread t1 we can use: t1.getName()
        System.out.println("The name of thread t1 = " + t1.getName());

        // To get the full detail of thread we just put the object name in sout()
        System.out.println("Full detail of thread t1 = " + t1);

        // To change the name of thread we write t1.setName("new name")
        t1.setName("Thread-2");

        System.out.println("The updated name of thread t1 = " + t1.getName());
        System.out.println("Full detail of updated thread t1 = " + t1);


    }
}
/* Output:
The thread which is running at present = Thread[#1,main,5,main]
The name of thread t1 = Thread-0
Full detail of thread t1 = Thread[#22,Thread-0,5,main]
The updated name of thread t1 = Thread-2
Full detail of updated thread t1 = Thread[#22,Thread-2,5,main]

 */
