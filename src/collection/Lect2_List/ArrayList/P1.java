package collection.Lect2_List.ArrayList;

import java.util.List;
import java.util.ArrayList;

public class P1 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();  // Initial Capacity of ArrayList<> is 10,
        arr.add(5);                             // after having 10 elements capacity changes to 15
        arr.add(10);                            // new capacity = old capacity + (old capacity/2)
        arr.add(15);
        arr.add(20);
        arr.add(25);
        System.out.println(arr);        // Output:[5, 10, 15, 20, 25]

        // We can also give capacity manually:
        List<Integer> arr2 = new ArrayList<>(20);  //capacity of ArrayList is 20.
    }
}
