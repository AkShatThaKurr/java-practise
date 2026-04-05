package collection.Map.HashMap;

import java.util.Map;
import java.util.HashMap;

public class P4 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(2, "Love");
        map.put(3, "Development");

        for (String val : map.values()) {
            System.out.print(val + " ");
        }
    }
}

// I Love Development
