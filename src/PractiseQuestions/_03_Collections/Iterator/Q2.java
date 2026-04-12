// traverse using iterator

package PractiseQuestions._03_Collections.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Q2 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        Iterator<Integer> it = al.iterator();
        while(it.hasNext()){
            int data = it.next();
            System.out.print(data + " ");
        }
    }
}
