// SortedSet is an interface of Set which stores elements in sorted (ascending) order and TreeSet is the implementation class of SortedSet.
// TreeSet does not allow duplicate elements,  also it does not allow Null value.

package collection.Lect3_Set.SortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class P1 {
    public static void main(String[] args) {
        SortedSet<Integer> ss = new TreeSet<>();
        ss.add(50);
        ss.add(20);
        ss.add(10);
        ss.add(15);
        ss.add(25);
        System.out.println(ss);
    }

}

// Output: [10, 15, 20, 25, 50]
