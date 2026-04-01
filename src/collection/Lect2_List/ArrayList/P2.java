// Remove element from ArrayList:

package collection.Lect2_List.ArrayList;

import java.util.List;
import java.util.ArrayList;

public class P2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.print("The Array list is: " + list);
        System.out.println("\n");

        // Removing element from index 1.
        list.remove(1);
        System.out.print("New Array list is: " + list);
        System.out.println();
    }
}

/* Output:
The Array list is: [10, 20, 30, 40, 50]

New Array list is: [10, 30, 40, 50]

 */
