// Remove all odd numbers.

package PractiseQuestions._03_Collections.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Q3 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(101);
        al.add(102);
        al.add(103);
        al.add(104);
        al.add(105);
        al.add(106);
        System.out.println("Before: " + al);
        Iterator<Integer> it = al.iterator();
        while (it.hasNext()) {
            int data = it.next();
            if (data % 2 != 0) {
                it.remove();
            }
        }
        System.out.println("After removing odd numbers: " + al);
    }
}
