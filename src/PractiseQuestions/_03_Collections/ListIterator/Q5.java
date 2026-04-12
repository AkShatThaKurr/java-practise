// Remove Even element using ListIterator.

package PractiseQuestions._03_Collections.ListIterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Q5 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(102);
        al.add(205);
        al.add(323);
        al.add(404);
        al.add(501);
        al.add(506);
        al.add(502);
        al.add(507);
        System.out.println("Array List: " + al);
        ListIterator<Integer> li = al.listIterator();
        while (li.hasNext()) {
            int data = li.next();
            if (data % 2 == 0) {
                li.remove();
            }
        }
        System.out.println("Updated Array List: " + al);
    }

}
