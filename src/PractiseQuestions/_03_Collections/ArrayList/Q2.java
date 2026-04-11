// remove even numbers

package PractiseQuestions._03_Collections.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("Enter elements of array list");
        for (int i = 0; i < 5; i++) {
            al.add(sc.nextInt());
        }
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) % 2 == 0) {
                al.remove(i);
                i--;
            }
        }
        System.out.println(al);
    }
}
