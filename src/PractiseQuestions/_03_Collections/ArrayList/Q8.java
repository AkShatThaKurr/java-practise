// Remove duplicates.

package PractiseQuestions._03_Collections.ArrayList;

import java.util.ArrayList;

public class Q8 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(10);
        al.add(20);
        al.add(50);
        al.add(60);
        al.add(20);
        al.add(80);
        al.add(100);
        System.out.println("Original ArrayList: " + al);
        System.out.println();
        // Method1: Using method contains(value)
        ArrayList<Integer> uniqueAL1 = new ArrayList<>();
        for (int num : al) {
            if (!uniqueAL1.contains(num)) {
                uniqueAL1.add(num);
            }
        }
        System.out.println("Using built-in method contains():");
        System.out.println("Unique ArrayList: " + uniqueAL1);
        // Method2: Bruteforce method using Nested loops
        for (int i = 0; i < al.size() - 1; i++) {
            for (int j = i + 1; j < al.size(); j++) {
                if (al.get(i).equals(al.get(j))) {
                    al.remove(j);
                    j--;
                }
            }
        }
        System.out.println("Using Nested Loops:");
        System.out.println("Unique ArrayList: " + al);
    }
}
