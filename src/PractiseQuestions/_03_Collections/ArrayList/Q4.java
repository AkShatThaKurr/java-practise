// find maximum and minimum element in the ArrayList.

package PractiseQuestions._03_Collections.ArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class Q4 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements for ArrayList: ");
        al.add(sc.nextInt());
        al.add(sc.nextInt());
        al.add(sc.nextInt());
        al.add(sc.nextInt());
        al.add(sc.nextInt());
        int max = al.get(0);
        int min = al.get(0);
        for (int i = 1; i < al.size(); i++) {
            if (al.get(i) > max) {
                max = al.get(i);
            }
            if (al.get(i) < min) {
                min = al.get(i);
            }
        }
        System.out.println("Maximum element in the ArrayList is: " + max);
        System.out.println("Minimum element in the ArrayList is: " + min);
    }
}
