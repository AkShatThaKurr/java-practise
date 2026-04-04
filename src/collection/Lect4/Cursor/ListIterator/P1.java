package collection.Lect4.Cursor.ListIterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class P1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        ListIterator<Integer> li = al.listIterator();
        while(li.hasNext()){
            li.next();
        }
        li.add(7);
        while(li.hasPrevious()){
            int data = li.previous();
            if(data==5){
                li.remove();
            }
            if(data==3){
                li.set(30);
            }
            System.out.print(data + " ");
        }
        System.out.println();
        System.out.println(al);
    }
}

/*Output:
7 6 5 4 3 2 1
[1, 2, 30, 4, 6, 7]

 */
