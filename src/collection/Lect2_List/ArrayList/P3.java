// Take input and store in ArrayList
package collection.Lect2_List.ArrayList;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter of integer elements: ");
        int num = sc.nextInt();

        List<Integer> list = new ArrayList<>(num);

        System.out.println("Enter numbers:");

        for (int i = 0; i < num; i++) {
            int a = sc.nextInt();
            list.add(a);
        }
        System.out.println(list);
    }
}

/* Output:
Enter of integer elements: 5
Enter numbers:
10
20
40
50
70
[10, 20, 40, 50, 70]
 */
