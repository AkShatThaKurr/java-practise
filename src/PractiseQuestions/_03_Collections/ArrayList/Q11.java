package PractiseQuestions._03_Collections.ArrayList;

import java.util.ArrayList;

public class Q11 {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        boolean flag = true;

        for (int i = 0; i < al.size() - 1; i++) {
            if (al.get(i) > al.get(i + 1)) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("ArrayList is Sorted.");
        } else {
            System.out.println("ArrayList is NOT Sorted.");
        }
    }
}