// Frequency of elements

package PractiseQuestions._03_Collections.ArrayList;

import java.util.ArrayList;

public class Q9 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(25);
        al.add(5);
        al.add(50);
        al.add(75);
        al.add(25);
        al.add(55);
        al.add(500);
        al.add(5);
        al.add(550);
        ArrayList<Integer> newAL = new ArrayList<>();
        newAL.addAll(al);
        System.out.println("ArrayList: " + al);
        System.out.println("Copied ArrayList: " + newAL);

        for (int i = 0; i < newAL.size(); i++) {
            int count = 1;
            for (int j = i + 1; j < newAL.size(); j++) {
                if (newAL.get(i).equals(newAL.get(j))) {
                    count++;
                    newAL.remove(j);
                    j--;
                }
            }
            System.out.println(newAL.get(i) + " frequency is: " + count);
        }


    }
}
