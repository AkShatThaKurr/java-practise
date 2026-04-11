// Copy one list to another.

package PractiseQuestions._03_Collections.ArrayList;

import java.util.ArrayList;

public class Q6 {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(20);
        al1.add(50);
        al1.add(30);
        al1.add(10);
        al1.add(40);
        System.out.print("Original array/ Array1: ");
        for(int num: al1){
            System.out.print(num + " ");
        }
        System.out.println();
        ArrayList<Integer> al2 = new ArrayList<>();
        for(int num: al1){
            al2.add(num);
        }

        System.out.print("Copied array/ Array2: ");
        for(int num: al2){
            System.out.print(num + " ");
        }
    }
}
