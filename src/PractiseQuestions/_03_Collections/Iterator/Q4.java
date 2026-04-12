// Print elements greater than 20.

package PractiseQuestions._03_Collections.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Q4 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(10);
        al.add(15);
        al.add(20);
        al.add(25);
        al.add(30);
        al.add(35);
        al.add(40);
        Iterator<Integer> it = al.iterator();
        System.out.print("Elements greater than 20 are -> ");
        while (it.hasNext()) {
            int data = it.next();
            if (data > 20) {
                System.out.print(data + " ");
            }
        }
    }
}
