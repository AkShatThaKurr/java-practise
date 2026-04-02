// Vector: It is a dynamic array, which is thread safe. otherwise same as ArrayList but slow in  Randome access.

package collection.Lect3_List.Vector;

import java.util.Vector;

public class P1 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        // Add:
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        System.out.println(v);

        // Access:
        System.out.println("Element at index 1: " + v.get(1));

        // Remove: 1) Index based, 2) Value based
        v.remove(2);
        v.remove(Integer.valueOf(50));

        // Size:
        System.out.println("Size: " + v.size());

        System.out.println(v);
    }
}

/* Output:
[10, 20, 30, 40, 50]
Element at index 1: 20
Size: 3
[10, 20, 40]
 */