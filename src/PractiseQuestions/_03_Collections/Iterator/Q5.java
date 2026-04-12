// Count total elements.

package PractiseQuestions._03_Collections.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Q5 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println(al);
        Iterator<Integer> it = al.iterator();
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        System.out.println("Total elements = " + count);
    }
}
