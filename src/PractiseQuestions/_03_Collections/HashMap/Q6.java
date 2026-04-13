// Check if key exists

package PractiseQuestions._03_Collections.HashMap;

import java.util.Scanner;
import java.util.HashMap;

public class Q6 {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<>();
        hmap.put(1, "Jonathan");
        hmap.put(2, "Ghatak");
        hmap.put(3, "Aman");
        hmap.put(4, "Neyoo");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a key: ");
        int key = sc.nextInt();
        boolean found = hmap.containsKey(key);
        if (found) {
            System.out.println("Yes, the key exists in the HashMap.");
        } else {
            System.out.println("No, the key does not exist in the HashMap.");
        }
        sc.close();
    }
}
