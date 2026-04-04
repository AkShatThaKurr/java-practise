/*
Q5.

👉 Insert elements at beginning using ListIterator

(Hint: cursor position concept)
 */
package collection.Lect4.Cursor.ListIterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class P5 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        ListIterator<Integer> li = al.listIterator();
        li.add(100);
        System.out.println(al);
    }
}
