// LinkedList: The can have duplicate numbers, also they have order, but Random access is not allowed here.
package collection.Lect3_List.LinkedList;

import java.util.LinkedList;

public class P1 {
    public static void main(String[] args) {
        LinkedList<Integer> abc = new LinkedList<>();
        abc.add(10);
        abc.add(20);
        abc.add(30);
        abc.add(40);
        abc.add(50);

        abc.addFirst(5);        // It will add the value at the first index of the LinkedList.
        abc.addLast(100);       // It will add the value at the last index of the LinkedList.
        // abc.removeFirst();       // It will remove the last index of the LinkedList.

        System.out.println(abc);  // Output: [5, 10, 20, 30, 40, 50, 100]

        abc.remove(3);

        System.out.println(abc);  // Output: [5, 10, 20, 40, 50, 100]
    }
}
