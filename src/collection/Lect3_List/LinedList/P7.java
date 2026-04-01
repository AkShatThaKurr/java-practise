// Q7. Reverse print (important 🔥)

package collection.Lect3_List.LinedList;

import java.util.LinkedList;

public class P7 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // print reverse:
        int size = list.size();
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
