/*
🔴 Level 3 (Interview level 🔥)
✅ Q8. Count even numbers
 */

package collection.Lect3_List.LinkedList;

import java.util.LinkedList;

public class P8 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(100);
        list.add(101);
        list.add(102);
        list.add(103);
        list.add(104);
        System.out.println(list);

        int countEven = 0;
        for (int num : list) {
            if (num % 2 == 0) {
                countEven++;
            }
        }
        System.out.println("Even numbers in list: " + countEven);
    }
}
