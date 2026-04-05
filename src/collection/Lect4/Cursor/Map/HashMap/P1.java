    // Map, HashMap, put(), Map.Entry<key,value>, entrySet(), getKey(), getValue() .

    package collection.Lect4.Cursor.Map.HashMap;

    import java.util.Map;
    import java.util.HashMap;
    import java.util.Set;
    import java.util.Iterator;

    public class P1 {
        public static void main(String[] args) {

            Map<Integer, String> map = new HashMap<>();

            map.put(1, "Akshat");
            map.put(2, "Aman");
            map.put(3, "Aditya");
            map.put(4, "Abhinav");
            map.put(2, "RanaJi");       // replace previous value.

            Set<Map.Entry<Integer, String>> set = map.entrySet();

            Iterator<Map.Entry<Integer, String>> it = set.iterator();

            while (it.hasNext()) {

                Map.Entry<Integer, String> entry = it.next();

                Integer key = entry.getKey();
                String value = entry.getValue();

                System.out.println("Key = " + key + ", value = " + value);
            }

        }
    }
