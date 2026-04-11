// Store and print elements.

package PractiseQuestions._03_Collections.ArrayList;

import java.util.ArrayList;

public class Q1 {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(20);
        al1.add(30);
        al1.add(40);
        al1.add(30);
        al1.add(20);
        System.out.println("ArrayList of Integer: " + al1);
        System.out.println();
        ArrayList<String> al2 = new ArrayList<>();
        al2.add("apple");
        al2.add("banana");
        al2.add("mango");
        al2.add("papaya");
        System.out.println("ArrayList of String: " + al2);
    }
}
