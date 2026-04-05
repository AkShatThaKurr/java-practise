//  Check element exists

package collection.Lect3_List.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        System.out.println(list);

        // to check whether element exist or not: --> list.contains(val);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (list.contains(num)) {
            System.out.println("Element Present.");
        } else {
            System.out.println("Element Absent.");
        }
    }
}
