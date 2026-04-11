// Find Second Largest Element

package PractiseQuestions._03_Collections.ArrayList;

import java.util.ArrayList;

public class Q10 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(25);
        System.out.println("The ArrayList is: " + al);
        int larg = Integer.MIN_VALUE, slarg = Integer.MIN_VALUE;
        for (int num : al) {
            if (larg < num) {
                slarg = larg;
                larg = num;
            } else if (larg > num && slarg < num) {
                slarg = num;
            }
        }
        if (slarg == Integer.MIN_VALUE) {
            System.out.println("Second largest not found.");
        } else {
            System.out.println("Second large element is: " + slarg);
        }

    }
}
