// find first non-repeating character.

package PractiseQuestions._03_Collections.HashMap;

import java.util.Scanner;
import java.util.HashMap;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        HashMap<Character, Integer> hmap = new HashMap<>();
        for (char c1 : name.toCharArray()) {
            hmap.put(c1, hmap.getOrDefault(c1, 0) + 1);
        }
        for (char c2 : name.toCharArray()) {
            if (hmap.get(c2) == 1) {
                System.out.println("First non-repeating character is: " + c2);
                return;
            }
        }
        System.out.println("No non-repeating character exists.");
    }
}
