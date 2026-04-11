// Search an element.

package PractiseQuestions._03_Collections.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.print("Enter element to search: ");
        int element = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) == element) {
                System.out.println(element + " is present at index " + i + ".");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(element + " not found.");
        }
    }
}
