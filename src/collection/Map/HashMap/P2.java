package collection.Map.HashMap;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class P2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        Iterator<Map.Entry<Integer, String>> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key --> " + key + ", Value --> " + value);
        }
    }
}

/* Output
Key --> 1, Value --> one
Key --> 2, Value --> two
Key --> 3, Value --> three
Key --> 4, Value --> four
 */
