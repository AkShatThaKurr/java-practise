// Count Frequency of Characters.

package PractiseQuestions._03_Collections.HashMap;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        // Method:1 of printing output: direct sout(map)
        System.out.println(map);
        System.out.println();

        // Method:2 of printing output: using map.keySet() and map.get(key)
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "->" + value);
        }
        sc.close();
    }
}
