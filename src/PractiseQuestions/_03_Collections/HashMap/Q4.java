// Find duplicate elements.

package PractiseQuestions._03_Collections.HashMap;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String s = sc.nextLine();
        HashMap<Character, Integer> hmap = new HashMap<>();

        for (char c1 : s.toCharArray()) {
            hmap.put(c1, hmap.getOrDefault(c1, 0) + 1);
        }

        System.out.print("Duplicate elements: ");
        boolean duplicate = false;
        for (Map.Entry<Character, Integer> entry : hmap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
                duplicate = true;
            }
        }
        if(!duplicate){
            System.out.println("None");
        }
    }
}
