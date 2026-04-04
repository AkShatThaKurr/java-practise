/*
Q2. Create an ArrayList:

[10, 20, 30, 40]

 Use ListIterator to:

Print all elements (forward)
Then print all elements (backward)
 */


package collection.Lect4.Cursor.ListIterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class P2 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        ListIterator<Integer> li = al.listIterator();
        while (li.hasNext()) {
            System.out.print(li.next() + " ");
        }
        System.out.println();
        while (li.hasPrevious()) {
            System.out.print(li.previous() + " ");
        }
    }
}
