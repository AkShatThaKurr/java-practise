// Merge two lists.

package PractiseQuestions._03_Collections.ArrayList;

import java.util.ArrayList;

public class Q7 {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(40);
        al1.add(50);
        al2.add(100);
        al2.add(200);
        al2.add(300);
        al2.add(400);
        al2.add(500);

        // Method1: Using inbuilt method -> addAll()
        System.out.println("========== METHOD1: USING -> addAll() ==========\n");
        ArrayList<Integer> mergedAL1 = new ArrayList<>();
        mergedAL1.addAll(al1);
        mergedAL1.addAll(al2);
        // ArrayList1:
        System.out.println("Array List1: " + al1);
        System.out.println("Array List2: " + al2);
        System.out.println("Merged Array List: " + mergedAL1 + "\n\n");
        // Method2: Manually Merging without using inbuild methods
        System.out.println("========== METHOD2: MANUALLY merging (Interview Favourite) ==========\n");
        ArrayList<Integer> mergedAL2 = new ArrayList<>();
        for (int i = 0; i < al1.size(); i++) {
            mergedAL2.add(al1.get(i));
        }
        for (int i = 0; i < al2.size(); i++) {
            mergedAL2.add(al2.get(i));
        }
        System.out.println("Merged Array List: " + mergedAL2);


    }
}
