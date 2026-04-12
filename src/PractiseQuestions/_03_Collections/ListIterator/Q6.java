// Modify elements while traversing backward.

package PractiseQuestions._03_Collections.ListIterator;

import java.util.ArrayList;
import java.util.ListIterator;


public class Q6 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(31);
        al.add(33);
        al.add(34);
        al.add(35);
        al.add(47);
        al.add(68);
        al.add(60);
        System.out.println("Array List: " + al);
        ListIterator<Integer> li = al.listIterator();
        while (li.hasNext()) {
            li.next();
        }
        while (li.hasPrevious()) {
            int data = li.previous();
            if (data < 30) {
                li.remove();
            } else if (data >= 30 && data < 35) {
                li.set(35);
            }
        }
        System.out.println("Updated Array List: " + al);
    }
}
