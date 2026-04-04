// Iterator: It is used to read as well as remove elements from the Collections(arraylist, sets, etc)
// It has 3 functions: (iterator(), hasNext(), next())

package collection.Lect4.Cursor.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class P1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        Iterator<Integer> it = al.iterator();
        // Suppose we have to print the list after removing 30 from it, than:
        while(it.hasNext()){
            Integer data = it.next();
            if(data==30){
                it.remove();
            }
            System.out.print(data + " ");
        }
        System.out.println();
        System.out.println(al);

    }
}
