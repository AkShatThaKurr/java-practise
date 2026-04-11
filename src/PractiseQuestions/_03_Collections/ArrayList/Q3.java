// Reverse the ArrayList.

package PractiseQuestions._03_Collections.ArrayList;

import java.util.ArrayList;

public class Q3 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        int n = al.size();
        for (int i = 0; i < n/2; i++) {
            int temp = al.get(i);
            al.set(i, al.get(n - i - 1));
            al.set(n - 1 - i, temp);
        }
        System.out.println(al);
    }
}
