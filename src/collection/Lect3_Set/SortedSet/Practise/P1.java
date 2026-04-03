/*
Q1. Add & Print (Ascending)
Input: 50, 10, 30, 20
 */

package collection.Lect3_Set.SortedSet.Practise;

import java.util.TreeSet;

public class P1 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(50);
        set.add(10);
        set.add(30);
        set.add(20);
        System.out.println(set);
    }
}

// Output: [10, 20, 30, 50]
