/* LinkedHashSet:
Duplicate allow nhi krta.
Insertion order maintain krta h.
Output insertion order se same deta h, jis order m input hua vohi order m output.
 */

package collection.Lect3_Set.LinkedHashSet;

import java.util.Set;
import java.util.LinkedHashSet;

public class P1 {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(200);
        set.add(205);
        set.add(5000);
        set.add(20);
        set.add(10);
        set.add(50);
        set.add(5);
        set.add(150);
        System.out.println(set);
    }
}

/*  Output:
[200, 205, 5000, 20, 10, 50, 5, 150]

 */