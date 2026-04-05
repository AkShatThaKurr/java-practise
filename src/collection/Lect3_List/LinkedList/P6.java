// First & Last access

package collection.Lect3_List.LinkedList;
import java.util.LinkedList;

public class P6 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(100);
        list.add(500);
        list.add(800);

        // to access first and last: -->   list.getFirst();    and    list.getLast();

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
}

/*
100
800
 */