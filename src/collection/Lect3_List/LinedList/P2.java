/*
Q2. Print using loop

👉 LinkedList me elements add karo aur for-each loop se print karo
 */

package collection.Lect3_List.LinedList;

import java.util.LinkedList;

public class P2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(20);
        list.add(25);
        list.add(50);
        list.add(30);
        list.add(900);
        list.add(200);
        list.addLast(30);

        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}

// Output:  20 25 50 30 900 200 30
