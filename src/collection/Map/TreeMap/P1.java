package collection.Map.TreeMap;

import java.util.TreeMap;

public class P1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tmap = new TreeMap<>();
        tmap.put(3, "C");
        tmap.put(4, "D");
        tmap.put(1, "A");
        tmap.put(2, "B");
        tmap.put(5, "E");
        System.out.println(tmap);
    }
}
// Ouput: {1=A, 2=B, 3=C, 4=D, 5=E}
