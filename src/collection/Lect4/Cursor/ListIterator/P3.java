/*
Q3.

Using ListIterator:

👉 Replace:

20 → 200
 */

package collection.Lect4.Cursor.ListIterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class P3 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        ListIterator<Integer> li = al.listIterator();
        while(li.hasNext()){
            Integer data = li.next();
            if(data==20){
                li.set(200);
                System.out.println("Replaced 20 with 200.");
            }
        }
        System.out.println("Final list:" + al);
    }
}

/* Output:
Replaced 20 with 200.
Final list:[10, 200, 30, 40, 50]
 */
