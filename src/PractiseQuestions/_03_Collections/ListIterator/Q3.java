// Replace element (20 → 200).

package PractiseQuestions._03_Collections.ListIterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Q3 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println("Original Array List: " + al);
        ListIterator<Integer> li = al.listIterator();
        while (li.hasNext()) {
            int data = li.next();
            if (data == 20) {
                li.set(200);
            }
        }
        System.out.println("Updated Array List: " + al);
    }
}
