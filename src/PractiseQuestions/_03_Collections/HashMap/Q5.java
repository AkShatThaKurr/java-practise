// Merge two HashMaps.
package PractiseQuestions._03_Collections.HashMap;

import java.util.HashMap;

public class Q5 {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap1 = new HashMap<>();
        hmap1.put(1, "Akshat");
        hmap1.put(2, "Aditya");
        hmap1.put(3, "Abhinav");
        System.out.println("HashMap1: " + hmap1);
        HashMap<Integer, String> hmap2 = new HashMap<>();
        hmap2.put(10, "Peter");
        hmap2.put(20, "Bruce");
        hmap2.put(30, "Tony");
        System.out.println("HashMap2: " + hmap2);
        HashMap<Integer, String> hmap3 = new HashMap<>();
        /* Method1: Manually assigning values of HashMap into another hashmap
        for (Map.Entry<Integer, String> entry : hmap1.entrySet()) {
            hmap3.put(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<Integer, String> entry : hmap2.entrySet()) {
            hmap3.put(entry.getKey(), entry.getValue());
        } */
        // Method2: Using map2.putAll(map1),  it will put the values of map1 into map2
        hmap3.putAll(hmap1);
        hmap3.putAll(hmap2);
        System.out.println("HashMap3: " + hmap3);
    }
}
