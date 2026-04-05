// Add at specific index

package collection.Lect3_List.LinkedList;

import java.util.LinkedList;

public class P3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        // suppose we need to add 25 at index 2. -->   list.add(index, element);
        list.add(2, 25);
        System.out.println(list);
    }
}

/* Output:
[10, 20, 30]
[10, 20, 25, 30]
 */
