package collection.Map.HashMap;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class P3 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Saurabh");
        map.put(2, "Sachin");
        map.put(3, "Saumya");
        map.put(4, "Somaya");
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        Iterator<Map.Entry<Integer, String>> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            Integer rank = entry.getKey();
            String name = entry.getValue();
            System.out.println("Rank --> " + rank + ", Name --> " + name);
        }

    }
}
