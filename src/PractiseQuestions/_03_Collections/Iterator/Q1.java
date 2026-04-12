// Traverse using iterator.

package PractiseQuestions._03_Collections.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Q1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(60);
        // Reading or Iterating elements:
        Iterator<Integer> it = al.iterator();
        while (it.hasNext()) {
            int data = it.next();
            if (data == 30) {
                it.remove();
            } else {
                System.out.print(data + " ");
            }
        }
        System.out.println();
        System.out.println(al);
    }
}
