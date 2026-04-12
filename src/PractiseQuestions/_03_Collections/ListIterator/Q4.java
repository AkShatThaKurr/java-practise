// Add element at beginning.

package PractiseQuestions._03_Collections.ListIterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Q4 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println("Array List: " + al);
        ListIterator<Integer> li = al.listIterator();
        li.add(0);

        System.out.println("Updated Array List: " + al);
    }
}
