//  Store roll number → name.

package PractiseQuestions._03_Collections.HashMap;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class Q1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Aakash Kumar");
        map.put(2, "Abhinav Bhandari");
        map.put(3, "Abhishek Kumar Singh");
        map.put(4, "Akshat Mishra");
        map.put(5, "Akshat Thakur");
        // Appraoch 1st: Sout(map)
        System.out.println("Method1: Direct using sout(map):");
        System.out.println(map);
        System.out.println();
        // Approach 2nd: Using Set and Iterator.
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        Iterator<Map.Entry<Integer, String>> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Roll number:" + key + "  and  Name:" + value);
        }
        System.out.println();
        // Approach 3rd: Using keySet() and values()
        for (Integer key : map.keySet()) {
            System.out.print(key + "  ");
        }
        System.out.println();
        for (String val : map.values()) {
                System.out.print(val + "  ");
        }
    }
}
