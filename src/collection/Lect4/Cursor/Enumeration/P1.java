// Cursor: It is a tool which is used to traverse or iterate through the Collectins which have legacy classes(vector).
// 1) Enumeration: It is used for legacy classes and can only read elements from collections no Update is allowed.

package collection.Lect4.Cursor.Enumeration;

import java.util.Vector;
import java.util.Enumeration;

public class P1 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);

        Enumeration<Integer> en = v.elements();
        while(en.hasMoreElements()){
            System.out.print(en.nextElement() + " ");
        }
    }
}
