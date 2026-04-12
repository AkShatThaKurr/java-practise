// Print elements backward.

package PractiseQuestions._03_Collections.ListIterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Q2 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println("Array List: " + al);
        ListIterator<Integer> li = al.listIterator();

        while (li.hasNext()) {
            li.next();
        }
        System.out.print("Backwards: ");
        while (li.hasPrevious()) {
            int data = li.previous();
            System.out.print(data + " ");
        }

    }
}
