/*
Q4.

Given:

[1, 2, 3, 4, 5]

👉 Do:

If element is even → multiply by 10
If element is odd → remove it
 */

package collection.Lect4.Cursor.ListIterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class P4 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        ListIterator<Integer> li = al.listIterator();
        while(li.hasNext()){
            int data = li.next();
            if(data%2==0){
                System.out.println(data + " Multiplied by 10.");
                li.set(data*10);
            }
            else{
                System.out.println(data + " Removed successfully.");
                li.remove();
            }
        }
        System.out.print(al);
    }

}
