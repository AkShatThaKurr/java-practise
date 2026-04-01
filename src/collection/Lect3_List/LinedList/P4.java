// (IMP): Remove by value:-

package collection.Lect3_List.LinedList;

import java.util.LinkedList;

public class P4 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);

        // suppose we want to remove value 30, -->  list.remove(Integer.valueof(30);
        list.remove(Integer.valueOf(30));
        System.out.println(list);
    }
}

/* Output:
[10, 20, 30, 40]
[10, 20, 40]
 */