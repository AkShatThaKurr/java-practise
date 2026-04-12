// Print elements forward.

package PractiseQuestions._03_Collections.ListIterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Q1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        ListIterator<Integer> li = al.listIterator();
        while (li.hasNext()) {
            int data = li.next();
            System.out.print(data + " ");
        }
    }
}
